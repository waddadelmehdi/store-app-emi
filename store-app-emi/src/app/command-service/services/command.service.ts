import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CommandService {

  private baseUrl = 'http://localhost:8888/command-service/commands';
  constructor(private http:HttpClient) { }
  getCommands():Observable<any>{
    return this.http.get(this.baseUrl);
  }
}
