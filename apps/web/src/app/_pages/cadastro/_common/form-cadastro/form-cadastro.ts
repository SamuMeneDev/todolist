import { Component, inject, signal } from '@angular/core';
import { FormBuilder, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatFormField, MatInputModule } from '@angular/material/input';
import { RouterLink } from '@angular/router';

/**
 * Formulário com os campos para cadastro do usuário.
 */
@Component({
  selector: 'app-form-cadastro',
  imports: [RouterLink,  MatFormField, MatInputModule, MatButtonModule, ReactiveFormsModule],
  templateUrl: './form-cadastro.html',
  styleUrl: './form-cadastro.css',
})
export class FormCadastro {

  /**
   * Instância de um FormBuilder para criar o formulário de cadastro.
   */
  private fb = inject(FormBuilder);

  /**
   *  Formulário com seus campos e validações
   */
  form = this.fb.group({
    nome: ["", [Validators.required, Validators.minLength(3)]],
    email: ["", [Validators.required, Validators.email]],
    senha: ["", [Validators.required, Validators.minLength(6)]]
  });

  /**
   * Mensagens de erro a serem mostrados para cada validação.
   */
  errosForm: Record<string, Record<string, string>> = {
    nome: {
      required: "O nome é obrigatório",
      minlength: "O nome deve ter no mínimo 3 caracteres"
    },
    email: {
      required: "O email é obrigatório",
      email: "Insira um email válido"
    },
    senha: {
      required: "A senha é obrigatória",
      minlength: "A senha deve ter no mínimo 6 caracteres"
    }
  }

  /**
   * Busca possível mensagem de erro em um campo do formuário.
   *
   * @param nomeCampo Campo do formulário.
   */
  public obterMensagemErro(nomeCampo: string) {
    // Pega referência do campo.
    const controle = this.form.get(nomeCampo);

    // Se o controle existir, estiver inválido e estiver selecionado ou com conteudo.
    if(controle && controle.invalid && (controle.touched || controle.dirty)) {
      if(controle.errors) {
        // Pega o primeiro erro da lista para comparação.
        const primeiroErro = Object.keys(controle.errors)[0];
        return this.errosForm[nomeCampo]?.[primeiroErro] || "Campo inválido";
      }
    }
    return "";
  }

  public submit() {
    console.log(this.form.status);
  }


  // GETTERS
  get nome() { return this.form.get("nome"); }
}
