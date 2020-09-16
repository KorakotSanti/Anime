import { Component, OnInit } from '@angular/core';
import { Anime } from '../anime';
import { AnimeTableService } from './anime-table.service';

@Component({
  selector: 'app-anime-table',
  templateUrl: './anime-table.component.html',
  styleUrls: ['./anime-table.component.css']
})
export class AnimeTableComponent implements OnInit {
  errorMessage:string;
  animeList:Anime[];

  constructor(private animeService:AnimeTableService) { }

  ngOnInit(): void {
    this.animeService.getAnime()
    .subscribe(res=>this.animeList=res, err=>this.errorMessage=<any>err.message);
  }

}
