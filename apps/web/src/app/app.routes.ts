import { Routes } from '@angular/router';
import { Cadastro, Login, Home } from './_pages';

export const routes: Routes = [
  {path: "login", component: Login},
  {path: "cadastro", component: Cadastro},
  {path: "home", component: Home},
  {path: "**", redirectTo: "login"}
];
