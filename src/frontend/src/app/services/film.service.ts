import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {SimpleViewFilm} from "../modules/film/models/simple.view.film";
import {Injectable} from "@angular/core";

@Injectable()
export class FilmService {
    constructor(private http: HttpClient) {
    }

    getFilms(): Observable<SimpleViewFilm[]> {
        return this.http.get<SimpleViewFilm[]>('http://localhost:8081/films');

    }

    // TODO другая вьюшка наверное
    saveFilm(simpleViewFilm: SimpleViewFilm): Observable<SimpleViewFilm> {
        return this.http.post<SimpleViewFilm>('/films', SimpleViewFilm);
    }

    deleteFilm(simpleViewFilmId: number): Observable<void> {
        return this.http.delete<void>('/films' + simpleViewFilmId);
    }

    // TODO другая вьюшка наверное тоже
    getFilmById(simpleViewFilm: number): Observable<SimpleViewFilm> {
        return this.http.get<SimpleViewFilm>('films/' + simpleViewFilm);
    }
}
