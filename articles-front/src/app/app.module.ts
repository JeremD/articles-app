import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListerComponent } from './lister/lister.component';
import { CreerComponent } from './creer/creer.component';

@NgModule({
  declarations: [
    AppComponent,
    ListerComponent,
    CreerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
