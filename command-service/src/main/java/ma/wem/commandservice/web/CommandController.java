package ma.wem.commandservice.web;

import ma.wem.commandservice.dao.entities.Command;
import ma.wem.commandservice.dao.repositories.CommandRepository;
import ma.wem.commandservice.dao.repositories.ProductItemRepository;
import ma.wem.commandservice.feign.ClientRestClient;
import ma.wem.commandservice.feign.ProductRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandController {
    @Autowired
    private  CommandRepository commandRepository;
    @Autowired
    private  ProductItemRepository productItemRepository;
    @Autowired
    private  ClientRestClient clientRestClient;
    @Autowired
    private  ProductRestClient productRestClient;



    @GetMapping(path = "/command/{id}")
    public Command getCommand(@PathVariable Long id) {
        Command command = commandRepository.findById(id).get();
        command.setClient(clientRestClient.getClientById(command.getClientId()));
        command.getProductItems().forEach(productItem -> {
            productItem.setProduct(productRestClient.getProductById(productItem.getProductId()));
        });
        return command;


    }


}
