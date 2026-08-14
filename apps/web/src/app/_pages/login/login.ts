import { Component } from '@angular/core';
import { Navbar } from "@/app/_components";
import { RouterOutlet } from '@angular/router';
import { FormLogin } from './_common';

@Component({
  selector: 'app-login',
  imports: [RouterOutlet, Navbar, FormLogin],
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login {}
