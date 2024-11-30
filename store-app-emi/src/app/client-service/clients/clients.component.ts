import {Component, computed, OnInit, Signal, signal} from '@angular/core';
import {Client} from '../model/client.model';
import {Observable} from 'rxjs';
import {ClientService} from '../services/client.service';
import {FormBuilder} from '@angular/forms';
import {Router} from 'express';
import {provideHttpClient} from '@angular/common/http';

@Component({
  selector: 'app-clients',
  templateUrl: './clients.component.html',
  styleUrl: './clients.component.css'
})

export class ClientsComponent implements OnInit{

  clients:Client[]=[]
  ngOnInit(): void {
    this.clientService.getClients().subscribe(data => {
      this.clients = [data];

    });
  }

  constructor(private clientService : ClientService) {
  }


}
