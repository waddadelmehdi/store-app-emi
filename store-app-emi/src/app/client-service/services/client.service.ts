import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Client} from '../model/client.model';

@Injectable({
  providedIn: 'root'
})
export class ClientService {
  private baseUrl = 'http://localhost:8888/client-service';

  constructor(private http:HttpClient) { }

  getClients(): Observable<any> {
    return this.http.get(this.baseUrl+"/clients");
  }

  createClient(client: Client): Observable<any> {
    return this.http.post<Client>(this.baseUrl+"/addClient", client);
  }

  updateClient(client: Client): Observable<any> {
    if (!client.id) {
      throw new Error('Client ID is required for updating.');
    }
    return this.http.put<Client>(`${this.baseUrl}/${client.id}`, client);
  }

  deleteClient(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`);
  }


  getClientById(id: number): Observable<Client> {
    return this.http.get<Client>(`${this.baseUrl}/${id}`); // Explicit type <Client>
  }
}
