import { Component } from '@angular/core';
import { Navbar } from "@/app/_components";
import { RouterOutlet } from '@angular/router';
import { FormCadastro } from './_common';

/**
 * Tela onde um novo usuário pode criar sua conta.
 */
@Component({
  selector: 'app-cadastro',
  imports: [RouterOutlet, Navbar, FormCadastro],
  templateUrl: './cadastro.html',
  styleUrl: './cadastro.css',
})
export class Cadastro {}
