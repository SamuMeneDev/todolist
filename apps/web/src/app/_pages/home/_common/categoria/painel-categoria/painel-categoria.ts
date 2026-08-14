import { Component } from '@angular/core';
import { HeaderPainelCategoria } from "../header-painel-categoria/header-painel-categoria";
import { ListaCategorias } from "@/app/_components/lista-categorias/lista-categorias";
import { Categoria } from "@/app/_components/categoria/categoria";

/**
 * Componente que agrupa outros componentes relacionados à
 * visualização e outras ações sobre categorias.
 */
@Component({
  selector: 'app-painel-categoria',
  imports: [HeaderPainelCategoria, ListaCategorias, Categoria],
  templateUrl: './painel-categoria.html',
  styleUrl: './painel-categoria.css',
})
export class PainelCategoria {}
