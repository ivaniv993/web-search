import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router'

@Component({
  selector: 'my-app',
  template: `
  <app-title [subtitle]="subtitle"></app-title>
  <nav>
    <a routerLink="/view">View</a>
    <a routerLink="/dashboard">Dashboard</a>
  </nav>
  <router-outlet></router-outlet>`
})
export class AppComponent{ 
  title = 'Angular 2 app'
}