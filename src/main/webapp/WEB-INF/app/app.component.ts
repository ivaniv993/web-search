import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router'

@Component({
  selector: 'my-app',
  styles: [`
    .container{
        display: flex;
    }
    .column{
        background: #eee;
        border: 5px solid #ccc;
        display: flex;
        flex: 3;
        flex-direction: column;
        padding: 10px;
    }
    .main-column{
        flex: 7;
    }
    .article {
      background: mediumseagreen;
      border: 5px solid seagreen;
      color: white;
      flex: 1;
      margin: 10px;
      padding: 20px;
    }
    
    `],
  template: `
  <app-title [subtitle]="subtitle"></app-title>
  <div class="container">
    <div class="column main-column">
      <a routerLink="/view">View</a>
    </div>
    <div class="column">
      <a routerLink="/dashboard">Dashboard</a>
    </div>
  </div>
  <router-outlet></router-outlet>`
})
export class AppComponent{ 
  title = 'Angular 2 app'
  subtitle = 'Hello';
}