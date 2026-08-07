import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Navbar } from "@/app/_components";

@Component({
  selector: 'app-login',
  imports: [RouterOutlet, Navbar],
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login {}
