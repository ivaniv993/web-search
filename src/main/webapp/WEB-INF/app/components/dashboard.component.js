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
var DashboardComponent = (function () {
    function DashboardComponent() {
        this.title = 'Dashboard component';
        this.histName = 'Historical';
        this.job1 = 'Job description 1';
        this.job2 = 'Job description 2';
        this.job3 = 'Job description 3';
        this.job4 = 'Job description 4';
    }
    DashboardComponent = __decorate([
        core_1.Component({
            selector: 'dashboard',
            template: "\n    <div class=\"main container \">\n      <div class=\"column main-column\">\n          <job-item [name]=\"job1\"></job-item>\n          <job-item [name]=\"job2\"></job-item>\n          <job-item [name]=\"job3\"></job-item>\n          <job-item [name]=\"job4\"></job-item>\n        \n      </div>\n      <div class=\"column historyscroll\">\n        <historical [name]=\"histName\"></historical>\n        <historical [name]=\"histName\"></historical>\n        <historical [name]=\"histName\"></historical>\n        <historical [name]=\"histName\"></historical>\n        <historical [name]=\"histName\"></historical>\n        \n      </div>\n    </div>\n  "
        }), 
        __metadata('design:paramtypes', [])
    ], DashboardComponent);
    return DashboardComponent;
}());
exports.DashboardComponent = DashboardComponent;
//# sourceMappingURL=dashboard.component.js.map