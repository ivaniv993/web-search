import {NgModule}      from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {RouterModule}  from '@angular/router';

import {AppComponent}  from './app.component';
import {Detail}  from './app.detail';

@NgModule({
    imports:        [
        BrowserModule,
        RouterModule.forRoot([
            { path: 'detail', component: Detail },
            { path: 'blabla', component: AppComponent }
        ])
    ],
    declarations:   [
        AppComponent,
        Detail
    ],
    bootstrap:      [AppComponent]
})
export class AppModule {}