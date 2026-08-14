import { Routes } from '@angular/router';
import { Cadastro, Login, Tarefas } from './_pages';

export const routes: Routes = [
  {path: "login", component: Login},
  {path: "cadastro", component: Cadastro},
  {path: "tarefas", component: Tarefas},
  {path: "**", redirectTo: "login"}
];
