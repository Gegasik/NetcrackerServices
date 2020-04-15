import {NgModule} from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {FilmComponent} from "./film.component";
import {FilmService} from "../../../services/film.service";


@NgModule({
    declarations: [
        FilmComponent,
    ],
    imports: [
        BrowserModule,
        RouterModule,
        FormsModule,
        HttpClientModule,

    ],

    providers: [FilmService],
    exports: [FilmComponent]
})
export class FilmModule {
}
