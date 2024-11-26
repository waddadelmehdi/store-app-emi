import {Component, computed, OnInit, Signal, signal} from '@angular/core';
import {Client} from '../model/client.model';

@Component({
  selector: 'app-clients',
  templateUrl: './clients.component.html',
  styleUrl: './clients.component.css'
})
export class ClientsComponent implements OnInit{

  clients= signal<Client[]>([]) ;
    ngOnInit(): void {
        throw new Error('Method not implemented.');
    }


}
