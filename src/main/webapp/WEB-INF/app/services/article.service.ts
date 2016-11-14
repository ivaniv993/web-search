import { Injectable } from '@angular/core';
import { Headers, Http, RequestOptions, Response } from '@angular/http';

import {Observable} from 'rxjs/Observable';

import { Article } from '../dto/article';
import { Job } from '../dto/job';
import { ARTICLE_MOCK } from '../mock/mock-article';

// import 'rxjs/add/operator/toPromise';
// import 'rxjs/Rx';
import '../rxjs-operators'

@Injectable()
export class ArticleService {
    
    private articleUrl = 'app/articles';
    
    private MOCK_CONTACT = 'app/dashboard';
    
    private SERVER_CONTACT = 'http://localhost:8181/app/hello';
    
    
    
    constructor(private http : Http){}
    
    
    getMockArticle() : Promise<Article[]> {
        return Promise.resolve(ARTICLE_MOCK);
    }
    
    
    getArticles(): Promise< Job[] >{
        return this.http.get(this.SERVER_CONTACT)
                .toPromise()
                .then(response => response.json())
                .catch(this.handleError);          
    }
    
    getContact(): Observable< Job[] > {
        
        return this.http.get(this.SERVER_CONTACT)
                .map(this.extractData)
                .catch(this.handleError);    
    }
    
    private extractData( res: Response ){
        console.log("extract data")
        let body = res.json(); 
        return body || {};   
    }
    
    private handleError(error : Response | any){
        let errMsg : string;
        if (error instanceof Response) {
            const body = error.json() || '';
            const err = body.error || JSON.stringify(body);
            errMsg = `${error.status} - ${error.statusText || ''} ${err}`;
        } else {
            errMsg = error.message ? error.message : error.toString();
        }
        
        console.error(errMsg);
        return Observable.throw(errMsg);
    }
    
}

