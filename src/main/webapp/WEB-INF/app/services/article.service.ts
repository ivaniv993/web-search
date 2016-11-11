import { Injectable } from '@angular/core';
import { Headers, Http, RequestOptions, Response } from '@angular/http';

import {Observable} from 'rxjs/Observable';

import { Article } from '../dto/article';
import { Job } from '../dto/job';
import { ARTICLE_MOCK } from '../mock/mock-article';

import 'rxjs/add/operator/toPromise';
import 'rxjs/Rx';

@Injectable()
export class ArticleService {
    
    private articleUrl = 'app/articles';
    
    private contactUrl = 'http://localhost:8181/hello'
    
    
    constructor(private http : Http){}
    
    
    getMockArticle() : Promise<Article[]> {
        return Promise.resolve(ARTICLE_MOCK);
    }
    
    
    getArticles(): Promise< Article[] >{
        return this.http.get(this.articleUrl)
                .toPromise()
                .then(response => response.json().data as Article[])
                .catch(this.handleError);          
    }
    
    getContact(): Observable< Job[] > {
        
        return this.http.get(this.contactUrl)
                .map(this.extractData)
                .catch(this.handleError);    
    }
    
    private extractData( res: Response ){
        console.log("extract data")
        let body = res.json(); 
        return body.data || {};   
    }
    
    private handleError(error: any): Promise<any> {
        console.error('An error occurred', error); // for demo purposes only
        return Promise.reject(error.message || error);
    }
    
}

