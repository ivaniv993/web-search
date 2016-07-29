import { provideRouter, RouterConfig }  from '@angular/router';
import { DashboardComponent } from './dashboard.component';

const routes: RouterConfig = [
  {
    path: 'dashboard',
    component: DashboardComponent
  }
];

export const appRouterProviders = [
  provideRouter(routes)
];
