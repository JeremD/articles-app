import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-creer',
  templateUrl: './creer.component.html',
  styleUrls: ['./creer.component.css']
})
export class CreerComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  creer(): void {
    alert('ohno');
  }

}
