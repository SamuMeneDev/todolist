import { Component } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
/**
 * Componente que renderiza uma categoria de tarefa.
 */
@Component({
  selector: 'app-categoria',
  imports: [MatCardModule],
  templateUrl: './categoria.html',
  styleUrl: './categoria.css',
})
export class Categoria {}
