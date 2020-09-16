import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Anime } from '../anime';
@Injectable()
export class AnimeTableService {
    constructor(private http:HttpClient){}

    getAnime():Observable<Anime[]>{
       return this.http.get<Anime[]>("http://localhost:8765/anime/title");
    }
}