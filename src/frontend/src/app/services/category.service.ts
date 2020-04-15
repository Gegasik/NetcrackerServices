import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {CategoryModel} from "../modules/category/category.model";

@Injectable()
export class CategoryService {

    constructor(private http: HttpClient) {
    }

    getCategories(): Observable<CategoryModel[]> {
        return this.http.get<CategoryModel[]>('http://localhost:8081/categories');
    }

    // TODO другая вьюшка наверное
    saveCategory(category: CategoryModel): Observable<CategoryModel> {
        return this.http.post<CategoryModel>('/films', CategoryModel);
    }

    deleteCategory(categoryId: number): Observable<void> {
        return this.http.delete<void>('/films' + categoryId);
    }

    // TODO другая вьюшка наверное тоже

}