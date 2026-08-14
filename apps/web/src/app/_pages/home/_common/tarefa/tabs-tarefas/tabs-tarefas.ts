
import { ListaTarefas, Tarefa } from '@/app/_components';
import { Component } from '@angular/core';
import { MatTabsModule } from '@angular/material/tabs';

/**
 * Renderiza abas para visualizar as tarefas do usuário, sendo inicialmente
 * uma aba de tarefas pendentes e outra de tarefas concluídas.
 */
@Component({
  selector: 'app-tabs-tarefas',
  imports: [MatTabsModule, ListaTarefas, Tarefa],
  templateUrl: './tabs-tarefas.html',
  styleUrl: './tabs-tarefas.css',
})
export class TabsTarefas {}
