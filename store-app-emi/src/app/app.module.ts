import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';
import { provideHttpClient, withFetch } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ClientsComponent } from './client-service/clients/clients.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HomePageComponent } from './home-page/home-page.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ClientListComponent } from './client-service/client-list/client-list.component';
import { AddClientComponent } from './client-service/add-client/add-client.component';
import { EditClientComponent } from './client-service/edit-client/edit-client.component';
import { ProductListComponent } from './product-service/product-list/product-list.component';
import { EmiStoreHomeComponent } from './emi-store-home/emi-store-home.component';
import { UpdateClientComponent } from './client-service/update-client/update-client.component';

@NgModule({
  declarations: [
    AppComponent,
    ClientsComponent,
    HomePageComponent,
    NavbarComponent,
    ClientListComponent,
    AddClientComponent,
    EditClientComponent,
    ProductListComponent,
    EmiStoreHomeComponent,
    UpdateClientComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule

  ],
  providers: [
    provideHttpClient(withFetch()), // Enable fetch APIs for HttpClient
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
