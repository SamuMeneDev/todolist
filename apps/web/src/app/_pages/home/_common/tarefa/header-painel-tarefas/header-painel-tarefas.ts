import { Component } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatIcon } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';

/**
 * Parte superior do painel de tarefas, contendo o titulo e
 * outros componentes de criação de tarefas e busca.
 */
@Component({
  selector: 'app-header-painel-tarefas',
  imports: [MatFormFieldModule, MatInputModule, MatButtonModule, MatIcon],
  templateUrl: './header-painel-tarefas.html',
  styleUrl: './header-painel-tarefas.css',
})
export class HeaderPainelTarefas {}
