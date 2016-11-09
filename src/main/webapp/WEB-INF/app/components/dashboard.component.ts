import { Component, OnInit } from '@angular/core';
import {ArticleService} from '../services/article.service';
import {Article} from '../dto/article';

@Component({
  selector: 'dashboard',
  template: `
    <div class="main container ">
      <div class="column main-column">
          <job-item [name]="job1"></job-item>
          <job-item [name]="job2"></job-item>
          <job-item [name]="job3"></job-item>
          <job-item [name]="job4"></job-item>
        
      </div>
      <div class="column historyscroll" >
        <div *ngFor="let article of articles">
          <historical [article]="article"></historical>
        </div>
      </div>
    </div>
  `
})
export class DashboardComponent implements OnInit{
    title = 'Dashboard component';
    histName = 'Historical';
    
    
    job1 = 'Job description 1'
    job2 = 'Job description 2'
    job3 = 'Job description 3'
    job4 = 'Job description 4'
    
    private articles : Article[];  
    
    
    constructor( private articleService : ArticleService ){}
    
    ngOnInit() : void {
      this.articleService.getMockArticle().then( articles => this.articles = articles);
    }
 }