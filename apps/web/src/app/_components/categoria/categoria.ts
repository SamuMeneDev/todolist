import { Component } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
import { MatIcon } from '@angular/material/icon';
/**
 * Componente que renderiza uma categoria de tarefa.
 */
@Component({
  selector: 'app-categoria',
  imports: [MatCardModule, MatIcon, MatButtonModule],
  templateUrl: './categoria.html',
  styleUrl: './categoria.css',
})
export class Categoria {}
