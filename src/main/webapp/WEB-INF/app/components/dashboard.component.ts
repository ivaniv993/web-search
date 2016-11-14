import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import '../rxjs-operators';

import {ArticleService} from '../services/article.service';
import {Article} from '../dto/article';
import {Job} from '../dto/job';

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
    
    private errorMessage : string;
    private articles : Article[];  
    private jobs : Job[];
    
    constructor( private articleService : ArticleService, private http: Http ){}
    
    ngOnInit() : void {
      
      this.articleService.getContact()
      .subscribe(
        jobs => this.jobs = jobs,
        error => this.errorMessage = <any>error
      )
      
      // this.articleService
      //   .getArticles()
      //   .then(r => this.jobs = r);
          
      
      this.articleService.getMockArticle().then( articles => this.articles = articles);
    }
 }