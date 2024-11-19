package ma.wem.commandservice.feign;

import ma.wem.commandservice.model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "client-service")
public interface ClientRestClient {
    @GetMapping("/api/clients/{id}")
    Client getClientById(@PathVariable Long id);

    @GetMapping("/api/clients")
    PagedModel<Client> getAllClients();
}
