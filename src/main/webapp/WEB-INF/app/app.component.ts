import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router'

@Component({
  selector: 'my-app',
  template: `
  <nav class="main-nav" >
    <li class="nav-li">
      <a routerLink="/view" class="nav-link">View</a>
    </li>
    <li class="nav-li">
      <a routerLink="/dashboard" class="nav-link">Dashboard</a>
    </li>
  </nav>
  <router-outlet></router-outlet>`
})
export class AppComponent{ 
}