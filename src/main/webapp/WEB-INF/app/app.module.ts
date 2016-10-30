import {NgModule}      from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {RouterModule}   from '@angular/router';

import {AppComponent}  from './app.component';
import {ViewComponent} from './view.component';
import {DashboardComponent} from './dashboard.component'
import {HighlightDirective} from './directive/highlight.directive'
import {UserService} from './services/user.service';
import {TitleComponent} from './components/title.component';


@NgModule({
    imports:        [
        BrowserModule,
        RouterModule.forRoot([
       
        {
            path: 'dashboard',
            component: DashboardComponent
        },
        {
            path: '',
            redirectTo: '/dashboard',
            pathMatch: 'full'
        },
        {
            path: 'view',
            component: ViewComponent
        }
        ])
    ],
    providers:      [
                        UserService
                    ],
    
    declarations:   [
                        AppComponent, 
                        ViewComponent, 
                        DashboardComponent, 
                        HighlightDirective,
                        TitleComponent
                    ],
    
    bootstrap:      [AppComponent]
})

export class AppModule {}