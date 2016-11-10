import {Component, Input} from '@angular/core';

@Component({
    selector: 'job-item',
    templateUrl: './app/components/job-item.html'
})
export class JobItemComponent{
    
    @Input() name = "DEfault name";
    @Input() status = 'Default status';
    
   
  
  doEnter(event) {
    console.log('bakaalalla');
    event.preventDefault();
  }
}