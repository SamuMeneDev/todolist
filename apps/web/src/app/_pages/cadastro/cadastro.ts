import { Component } from '@angular/core';
import { Navbar } from "@/app/_components";
import { RouterLink, RouterOutlet } from '@angular/router';
import { MatFormField } from "@angular/material/form-field";
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';

@Component({
  selector: 'app-cadastro',
  imports: [RouterOutlet, RouterLink, Navbar, MatFormField, MatInputModule, MatButtonModule],
  templateUrl: './cadastro.html',
  styleUrl: './cadastro.css',
})
export class Cadastro {}
