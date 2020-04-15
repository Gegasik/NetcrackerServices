import {SessionModel} from "../session/session.model";

export class UserModel {
    idUser: number;
    userName: string;
    userEmail: string;
    userPassword: string;
    sessions: SessionModel[];
}