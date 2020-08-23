import { DataService } from './../services/data.service';
import { Article } from './../models/Article';
import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-lister',
  templateUrl: './lister.component.html',
  styleUrls: ['./lister.component.css']
})
export class ListerComponent implements OnInit {

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

  lister(): void {
  }

}
