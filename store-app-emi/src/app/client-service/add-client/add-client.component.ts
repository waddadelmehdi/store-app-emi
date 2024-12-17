import { Component } from '@angular/core';
import {Client} from '../model/client.model';
import {ClientService} from '../services/client.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-client',
  templateUrl: './add-client.component.html',
  styleUrl: './add-client.component.css'
})
export class AddClientComponent {
  client: Client = new Client();
  constructor(private clientService: ClientService, private router: Router) {}
  addClient(): void {
    this.clientService.createClient(this.client).subscribe(() => {
      this.router.navigate(['/list-clients']);
    });
  }


}
