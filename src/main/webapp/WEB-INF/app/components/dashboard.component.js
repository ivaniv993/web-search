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
var http_1 = require('@angular/http');
require('rxjs/add/operator/map');
var article_service_1 = require('../services/article.service');
var DashboardComponent = (function () {
    function DashboardComponent(articleService, http) {
        this.articleService = articleService;
        this.http = http;
        this.title = 'Dashboard component';
        this.job1 = 'Job description 1';
        this.job2 = 'Job description 2';
        this.job3 = 'Job description 3';
        this.job4 = 'Job description 4';
    }
    DashboardComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.articleService.getContact()
            .subscribe(function (jobs) { return _this.jobs = jobs; }, function (error) { return _this.errorMessage = error; });
        this.articleService.getMockArticle().then(function (articles) { return _this.articles = articles; });
    };
    DashboardComponent = __decorate([
        core_1.Component({
            selector: 'dashboard',
            template: "\n    <div class=\"main container \">\n      <div class=\"main-column\">\n        <div *ngFor=\"let job of jobs\">\n          <job-item [name]=\"job.firstName\"></job-item>\n        </div> \n      </div>\n      <div class=\"main-column column\" >\n        <div *ngFor=\"let article of articles\">\n          <historical [article]=\"article\"></historical>\n        </div>\n      </div>\n    </div>\n  "
        }), 
        __metadata('design:paramtypes', [article_service_1.ArticleService, http_1.Http])
    ], DashboardComponent);
    return DashboardComponent;
}());
exports.DashboardComponent = DashboardComponent;
//# sourceMappingURL=dashboard.component.js.map