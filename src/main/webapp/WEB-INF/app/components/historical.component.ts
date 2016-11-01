import {Component, Input} from '@angular/core';


@Component({
    selector: 'historical',
    templateUrl: './app/components/historical.html',
})
export class HistoricalComponent{
    
    
    @Input() name = '';
    @Input() author = '';
    @Input() date: Date;
    @Input() status: boolean = false; 
    
    
}