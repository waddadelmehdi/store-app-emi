package ma.wem.clientservice.web;

import ma.wem.clientservice.dao.entities.Client;
import ma.wem.clientservice.service.ClientManager;
import ma.wem.clientservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientManager clientManager;

    @GetMapping("/clients")
    public List<Client> getClients() {
        return clientManager.getAllClients();
    }
    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client) {
        return clientManager.addClient(client);
    }
    @PutMapping("/updateClient")
    public Client updateClient(@RequestBody Client client) {
        return clientManager.updateClient(client);
    }
    @DeleteMapping("/deleteClient")
    public void deleteClient(@RequestBody Client client) {
        clientManager.deleteClient(client);
    }
    @GetMapping("/clients/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientManager.getClientById(id);
    }
}
