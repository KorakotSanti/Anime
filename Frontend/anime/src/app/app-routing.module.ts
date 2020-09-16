import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AnimeTableComponent } from './anime-table/anime-table.component';

const routes: Routes = [
  {path:'Anime', component:AnimeTableComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
