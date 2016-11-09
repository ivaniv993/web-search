import {Component, Input} from '@angular/core';
import {Article} from '../dto/article';

@Component({
    selector: 'historical',
    templateUrl: './app/components/historical.html',
})
export class HistoricalComponent{
    
    @Input() article : Article;
    @Input() date: Date = new Date();
    
    
}