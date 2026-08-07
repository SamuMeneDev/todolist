import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Navbar } from "@/app/_components";
import { MatFormField } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';

@Component({
  selector: 'app-login',
  imports: [RouterOutlet, MatFormField, MatInputModule, Navbar],
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login {}
