import { Component } from '@angular/core';

@Component({
  selector: 'dashboard',
  template: `
    <div class="main container ">
      <div class="column main-column">
          <job-item [name]="job1"></job-item>
          <job-item [name]="job2"></job-item>
          <job-item [name]="job3"></job-item>
          <job-item [name]="job4"></job-item>
        
      </div>
      <div class="column historyscroll">
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        <historical [name]="histName"></historical>
        
      </div>
    </div>
  `
})
export class DashboardComponent{
    title = 'Dashboard component';
    histName = 'Historical';
    
    
    job1 = 'Job description 1'
    job2 = 'Job description 2'
    job3 = 'Job description 3'
    job4 = 'Job description 4'
 }