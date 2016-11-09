import { Injectable } from '@angular/core';
import { Headers, Http } from '@angular/http';

import { Article } from '../dto/article';
import { ARTICLE_MOCK } from '../mock/mock-article';

import 'rxjs/add/operator/toPromise';

@Injectable()
export class ArticleService {
    
    private articleUrl = 'app/articles';
    
    
    constructor(private http : Http){}
    
    
    getMockArticle() : Promise<Article[]> {
        return Promise.resolve(ARTICLE_MOCK);
    }
    
    
    getArticles(): Promise< Article[] >{
        return this. http.get(this.articleUrl)
                .toPromise()
                .then(response => response.json().data as Article[])
                .catch(this.handleError);          
    }
    
    
    private handleError(error: any): Promise<any> {
        console.error('An error occurred', error); // for demo purposes only
        return Promise.reject(error.message || error);
    }
    
}

