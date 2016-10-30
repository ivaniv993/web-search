import {Component, Input} from '@angular/core';
import {UserService} from '../services/user.service'

@Component({
    selector: 'app-title',
    template: `
        <h3> {{mainTitle}}  {{subtitle}}</h3>
        <p *ngIf="user">
            <i>Welcome, {{user}}</i>
        <p>
    `
})
export class TitleComponent{
    
    @Input() subtitle = '';
    mainTitle = 'Angular app';
    user = '';
    
    constructor( userService: UserService){
        console.log("TitleComponent user: "+
            userService.userName+
            ' input '+this.subtitle);
        this.user = userService.userName;
    }
}