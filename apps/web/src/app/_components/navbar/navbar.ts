import { Component } from '@angular/core';
import { MatIconModule } from '@angular/material/icon';

/**
 * Parte superior da aplicação com o titulo e opções
 */
@Component({
  selector: 'app-navbar',
  imports: [MatIconModule],
  templateUrl: './navbar.html',
  styleUrl: './navbar.css',
})
export class Navbar {}
