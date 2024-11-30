package ma.wem.clientservice.service;

import ma.wem.clientservice.dao.entities.Client;

import java.util.List;

public interface ClientManager {
    public Client addClient(Client client);
    public boolean deleteClient(Client client);
    public Client updateClient(Client client);
    public List<Client> getAllClients();
    public Client getClientById(Long id);
    boolean deleteClientById(Long id);
}
