import { DataService } from './../services/data.service';
import { Article } from './../models/Article';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription, Observable } from 'rxjs';

@Component({
  selector: 'app-lister',
  templateUrl: './lister.component.html',
  styleUrls: ['./lister.component.css']
})
export class ListerComponent implements OnInit, OnDestroy {

  articlesList: Article;
  articleSub: Subscription;

  constructor(private ServiceArticle: DataService) { }

  ngOnInit(): void {
    this.articleSub = this.ServiceArticle.sabonnerArticle().subscribe(
      article => this.articlesList = article,
      err => console.error(err),
      () => { }
    );
  }

  lister(): Observable<Article> {
    return this.ServiceArticle.listerArticle();
  }

  ngOnDestroy(): void {
    this.articleSub.unsubscribe();
  }

}
