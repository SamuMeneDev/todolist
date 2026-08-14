import { Component } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import { MatFormField, MatInputModule } from '@angular/material/input';
import { RouterLink } from '@angular/router';

/**
 * Formulário com os campos para cadastro do usuário.
 */
@Component({
  selector: 'app-form-cadastro',
  imports: [RouterLink,  MatFormField, MatInputModule, MatButtonModule],
  templateUrl: './form-cadastro.html',
  styleUrl: './form-cadastro.css',
})
export class FormCadastro {}
