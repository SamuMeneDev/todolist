import { Component } from '@angular/core';
import { HeaderPainelTarefas } from '../header-painel-tarefas/header-painel-tarefas';
import { TabsTarefas } from '../tabs-tarefas/tabs-tarefas';

/**
 * Componente que agrupa outros
 * relacionados à manipulação de tarefas do usuário.
 */
@Component({
  selector: 'app-painel-tarefas',
  imports: [HeaderPainelTarefas, TabsTarefas],
  templateUrl: './painel-tarefas.html',
  styleUrl: './painel-tarefas.css',
})
export class PainelTarefas {}
