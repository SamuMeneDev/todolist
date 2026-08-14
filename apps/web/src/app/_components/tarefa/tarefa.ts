import { Component } from '@angular/core';
import { MatListItem } from "@angular/material/list";
import { MatIcon } from "@angular/material/icon";
import { MatButtonModule } from "@angular/material/button";

@Component({
  selector: 'app-tarefa',
  imports: [MatListItem, MatIcon, MatButtonModule],
  templateUrl: './tarefa.html',
  styleUrl: './tarefa.css',
})
export class Tarefa {}
