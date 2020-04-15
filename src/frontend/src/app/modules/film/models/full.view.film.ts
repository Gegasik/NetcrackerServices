import {SessionModel} from "../../session/session.model";
import {CategoryModel} from "../../category/category.model";

export class FullViewFilm {
    idFilm: number;

    filmName: string;

    filmDescriptions: string;
    picture:File;

    sessions: SessionModel[];
    categories: CategoryModel[];
}