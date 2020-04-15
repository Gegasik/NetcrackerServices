import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {UserModel} from "../modules/user/user.model";
import {Injectable} from "@angular/core";

@Injectable()
export class UserService {
    constructor(private http: HttpClient) {
    }

    getUsers(): Observable<UserModel[]> {
        return this.http.get<UserModel[]>('http://localhost:8081/users');
    }

    // TODO другая вьюшка наверное
    saveCinemaHall(user: UserModel): Observable<UserModel> {
        return this.http.post<UserModel>('/films', user);
    }

    deleteCinemaHall(user: number): Observable<void> {
        return this.http.delete<void>('/films' + user);
    }

    // TODO другая вьюшка наверное тоже
    getCinemaHallById(userModel: number): Observable<UserModel> {
        return this.http.get<UserModel>('films/' + UserModel);
    }
}