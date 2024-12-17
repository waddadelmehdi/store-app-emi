import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ClientService } from '../services/client.service';
import { Client } from '../model/client.model';

@Component({
  selector: 'app-edit-client',
  templateUrl: './edit-client.component.html',
  styleUrls: ['./edit-client.component.css'],
})
export class EditClientComponent implements OnInit {
  client: Client = new Client();
  isLoading: boolean = true;  // Add this line to track loading state

  constructor(
    private clientService: ClientService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    const id = this.route.snapshot.params['id']; // Extract 'id' from the route

    // Set isLoading to true before fetching data
    this.clientService.getClientById(id).subscribe(
      (data: Client) => {
        this.client = data;
        this.isLoading = false;  // Set isLoading to false when data is loaded
      },
      (error) => {
        console.error('Error fetching client:', error);
        this.isLoading = false;  // Set isLoading to false even in case of error
      }
    );
  }

  updateClient(): void {
    this.clientService.updateClient(this.client).subscribe(
      () => {
        console.log('Client updated successfully');
        this.router.navigate(['/clients']); // Navigate back to the client list
      },
      (error) => {
        console.error('Error updating client:', error);
      }
    );
  }
}
