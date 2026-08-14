import { Component } from '@angular/core';
import { MatListItem } from "@angular/material/list";
import { MatIcon } from "@angular/material/icon";
import { MatButtonModule } from "@angular/material/button";

/**
 * Renderiza uma tarefa que o usuário tem.
 */
@Component({
  selector: 'app-tarefa',
  imports: [MatIcon, MatButtonModule],
  templateUrl: './tarefa.html',
  styleUrl: './tarefa.css',
})
export class Tarefa {}
