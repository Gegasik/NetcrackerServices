import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Injectable} from "@angular/core";
import {SessionModel} from "../modules/session/session.model";

@Injectable()
export class SessionService {
    constructor(private http: HttpClient) {
    }

    getAllSessions(): Observable<SessionModel[]> {
        return this.http.get<SessionModel[]>('http://localhost:8081/sessions');
    }

    // TODO другая вьюшка наверное
    saveSession(session: SessionModel): Observable<SessionModel> {
        return this.http.post<SessionModel>('/films', SessionModel);
    }

    deleteSessionById(sessionId: number): Observable<void> {
        return this.http.delete<void>('/films' + sessionId);
    }

    // TODO другая вьюшка наверное тоже
    getSessionById(sessionId: number): Observable<SessionModel> {
        return this.http.get<SessionModel>('films/' + sessionId);
    }
}