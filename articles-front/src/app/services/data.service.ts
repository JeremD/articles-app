import { Article } from './../models/Article';
import { environment } from '../../environments/environment';
import { Injectable } from '@angular/core';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { Subject } from 'rxjs/internal/Subject';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  URL_BACKEND = environment.backendUrl;

  nouvelArticle: Article;
  subjetArticle = new Subject<Article>();

  constructor(private http: HttpClient) { }

  /**
   * Lister tous les articles
   */
  listerArticle(): Observable<Article> {
    return this.http.get<Article>(`${this.URL_BACKEND}`);
  }

  /**
   * Abonnement Article
   */
  sabonnerArticle(): Observable<Article> {
    return this.subjetArticle.asObservable();
  }

  /**
   * Récupération Article
   */
  selectionner(selectArticle: Article): void {
    this.subjetArticle.next(selectArticle);
  }

}
