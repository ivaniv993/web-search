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
var HistoricalComponent = (function () {
    function HistoricalComponent() {
        this.name = '';
        this.author = '';
        this.status = false;
    }
    __decorate([
        core_1.Input(), 
        __metadata('design:type', Object)
    ], HistoricalComponent.prototype, "name", void 0);
    __decorate([
        core_1.Input(), 
        __metadata('design:type', Object)
    ], HistoricalComponent.prototype, "author", void 0);
    __decorate([
        core_1.Input(), 
        __metadata('design:type', Date)
    ], HistoricalComponent.prototype, "date", void 0);
    __decorate([
        core_1.Input(), 
        __metadata('design:type', Boolean)
    ], HistoricalComponent.prototype, "status", void 0);
    HistoricalComponent = __decorate([
        core_1.Component({
            selector: 'historical',
            templateUrl: './app/components/historical.html',
        }), 
        __metadata('design:paramtypes', [])
    ], HistoricalComponent);
    return HistoricalComponent;
}());
exports.HistoricalComponent = HistoricalComponent;
//# sourceMappingURL=historical.component.js.map