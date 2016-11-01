import { Component } from '@angular/core';

@Component({
  selector: 'dashboard',
  template: `
    <h1>{{title}}</h1>
  `
})
export class DashboardComponent{
    title = 'Dashboard component'
 }