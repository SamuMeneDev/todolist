import { Component } from '@angular/core';
import { Navbar } from "@/app/_components";
import { RouterOutlet } from '@angular/router';
import { PainelTarefas } from "./_common";
import { PainelCategoria } from "./_common/categoria/painel-categoria/painel-categoria";

/**
 * Tela principal da aplicação, onde são exibidos painéis
 *  de tarefas e das categorias de tarefas.
 */
@Component({
  selector: 'app-home',
  imports: [Navbar, RouterOutlet, PainelTarefas, PainelCategoria],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home {}
