import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AnimeTableComponent } from './anime-table/anime-table.component';
import { AnimeTableService } from './anime-table/anime-table.service';
import { MainComponent } from './main/main.component';

@NgModule({
  declarations: [
    AppComponent,
    AnimeTableComponent,
    MainComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [AnimeTableService],
  bootstrap: [AppComponent]
})
export class AppModule { }
