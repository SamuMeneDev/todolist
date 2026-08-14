import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Navbar } from "@/app/_components";
import {MatFormFieldModule } from "@angular/material/form-field";
import { MatInputModule } from '@angular/material/input';
import { MatIconModule } from "@angular/material/icon";
import { MatButtonModule } from "@angular/material/button";
import { MatTabsModule } from '@angular/material/tabs';
import { Tarefa } from "@/app/_components/tarefa/tarefa";
import { ListaTarefas } from "@/app/_components/lista-tarefas/lista-tarefas";

@Component({
  selector: 'app-tarefas',
  imports: [
    RouterOutlet, MatTabsModule, Navbar, MatFormFieldModule,
    MatInputModule, MatIconModule, MatButtonModule,
    Tarefa,
    ListaTarefas
],
  templateUrl: './tarefas.html',
  styleUrl: './tarefas.css',
})
export class Tarefas {}
