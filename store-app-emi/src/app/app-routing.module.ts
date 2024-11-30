import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ClientsComponent} from './client-service/clients/clients.component';
import {ClientListComponent} from './client-service/client-list/client-list.component';
import {HomePageComponent} from './home-page/home-page.component';
import {AddClientComponent} from './client-service/add-client/add-client.component';
import {EditClientComponent} from './client-service/edit-client/edit-client.component';
import {ProductListComponent} from './product-service/product-list/product-list.component';
import {CommandListComponent} from './command-service/command-list/command-list.component';

const routes: Routes = [
  { path :"clients", component : ClientsComponent},
  { path :"list-clients", component : ClientListComponent},
  { path :"add-client", component : AddClientComponent},
  { path :"edit-client", component : EditClientComponent},
  { path :"list-products", component : ProductListComponent},
  { path :"list-commands", component : CommandListComponent},
  { path :"home", component : HomePageComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
