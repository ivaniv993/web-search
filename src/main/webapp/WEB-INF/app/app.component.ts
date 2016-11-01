import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router'

@Component({
  selector: 'my-app',
  template: `
  <div class="main container">
      <div class="column main-column">
        <historical></historical>
        <historical></historical>
      </div>
      <div class="column">
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        
      </div>
  </div>
  <router-outlet></router-outlet>`
})
export class AppComponent{ 
  histName = 'Historical'
}