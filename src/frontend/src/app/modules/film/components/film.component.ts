import {SimpleViewFilm} from "../models/simple.view.film";
import {Component} from "@angular/core";
import {FilmService} from "../../../services/film.service";


@Component({
    selector: 'films',
    templateUrl: './film.component.html'
})
export class FilmComponent {
    constructor(private filmService: FilmService) {
    }
     simpleViewfilms: SimpleViewFilm[];
    simpleViewFilm:SimpleViewFilm;
    public loadFilms(): void {
        // Get data from BillingAccountService
        this.filmService.getFilms().subscribe(films => {
            // Parse json response into local array
            this.simpleViewfilms = films as SimpleViewFilm[];
            // Check data in console
            console.log(this.simpleViewfilms);// don't use console.log in angular :)
        });
    }
    public saveFilm():void{
        this.filmService.saveFilm(this.simpleViewFilm);
    }
}