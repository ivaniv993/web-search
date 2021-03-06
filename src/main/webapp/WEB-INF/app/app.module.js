"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require('@angular/core');
var platform_browser_1 = require('@angular/platform-browser');
var router_1 = require('@angular/router');
var forms_1 = require('@angular/forms');
var http_1 = require('@angular/http');
// import {InMemoryWebApiModule}   from 'angular-in-memory-web-api';
var app_component_1 = require('./app.component');
var view_component_1 = require('./components/view.component');
var dashboard_component_1 = require('./components/dashboard.component');
var title_component_1 = require('./components/title.component');
var historical_component_1 = require('./components/historical.component');
var job_item_component_1 = require('./components/job-item.component');
var highlight_directive_1 = require('./directive/highlight.directive');
var user_service_1 = require('./services/user.service');
var article_service_1 = require('./services/article.service');
// import {InMemoryDataService}    from './in-memory-data.service';
var routes = [
    {
        path: '',
        redirectTo: '/dashboard',
        pathMatch: 'full'
    },
    {
        path: 'dashboard',
        component: dashboard_component_1.DashboardComponent
    },
    {
        path: 'view',
        component: view_component_1.ViewComponent
    }
];
var AppModule = (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        core_1.NgModule({
            imports: [
                platform_browser_1.BrowserModule,
                forms_1.FormsModule,
                http_1.HttpModule,
                http_1.JsonpModule,
                router_1.RouterModule.forRoot(routes)
            ],
            exports: [
                router_1.RouterModule
            ],
            providers: [
                article_service_1.ArticleService,
                user_service_1.UserService
            ],
            declarations: [
                app_component_1.AppComponent,
                view_component_1.ViewComponent,
                job_item_component_1.JobItemComponent,
                dashboard_component_1.DashboardComponent,
                historical_component_1.HistoricalComponent,
                highlight_directive_1.HighlightDirective,
                title_component_1.TitleComponent
            ],
            bootstrap: [
                app_component_1.AppComponent
            ]
        }), 
        __metadata('design:paramtypes', [])
    ], AppModule);
    return AppModule;
}());
exports.AppModule = AppModule;
//# sourceMappingURL=app.module.js.map