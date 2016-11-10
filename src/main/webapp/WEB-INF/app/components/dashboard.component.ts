import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';

import {ArticleService} from '../services/article.service';
import {Article} from '../dto/article';

@Component({
  selector: 'dashboard',
  template: `
    <div class="main container ">
      <div class="main-column">
        <div *ngFor="let job of jobs">
          <job-item [name]="job.firstName"></job-item>
        </div> 
      </div>
      <div class="main-column column" >
        <div *ngFor="let article of articles">
          <historical [article]="article"></historical>
        </div>
      </div>
    </div>
  `
})
export class DashboardComponent implements OnInit{
    title = 'Dashboard component';
    
    job1 = 'Job description 1'
    job2 = 'Job description 2'
    job3 = 'Job description 3'
    job4 = 'Job description 4'
    
    private articles : Article[];  
    private objects : any[];
    
    
    
    
    constructor( private articleService : ArticleService, private http: Http ){}
    
    ngOnInit() : void {
      
      this.articleService.getContact()
          .then( objects => this.objects = objects);   
      
      this.articleService.getMockArticle().then( articles => this.articles = articles);
    }
 }