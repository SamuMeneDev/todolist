import { Routes } from '@angular/router';
import { Cadastro, Login } from './_pages';

export const routes: Routes = [
  {path: "login", component: Login},
  {path: "cadastro", component: Cadastro},
  {path: "**", redirectTo: "login"}
];
