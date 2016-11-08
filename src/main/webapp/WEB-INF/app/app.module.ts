import {NgModule}      from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {RouterModule, Routes }   from '@angular/router';
import {FormsModule }    from '@angular/forms';
import { InMemoryWebApiModule } from 'angular-in-memory-web-api';

import {AppComponent}  from './app.component';
import {ViewComponent} from './components/view.component';
import {DashboardComponent} from './components/dashboard.component'
import {HighlightDirective} from './directive/highlight.directive'
import {UserService} from './services/user.service';
import {TitleComponent} from './components/title.component';
import {Detail}  from './components/detail.component';
import {HistoricalComponent} from './components/historical.component'
import {JobItemComponent} from './components/job-item.component';

import { InMemoryDataService }  from './mock/in-memory-data.service';

const routes: Routes = [
    {
        path: '',
        redirectTo: '/dashboard',
        pathMatch: 'full'
    },
    {
        path: 'dashboard',
        component: DashboardComponent
    },
    {
        path: 'view',
        component: ViewComponent
    }
];

@NgModule({
    imports:        [
                        BrowserModule,
                        FormsModule,
                        RouterModule.forRoot(routes),
                        InMemoryWebApiModule.forRoot(InMemoryDataService),
                    ],
                    
    exports:        [   
                        RouterModule 
                    ],
    
    providers:      [
                        UserService
                    ],
    
    declarations:   [
                        AppComponent, 
                        ViewComponent, 
                        JobItemComponent,
                        DashboardComponent, 
                        HistoricalComponent,
                        HighlightDirective,
                        TitleComponent
                    ],
                    
    bootstrap:      [   
                        AppComponent
                    ]
})
export class AppModule {}