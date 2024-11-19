package ma.wem.commandservice;

import ma.wem.commandservice.dao.entities.Command;
import ma.wem.commandservice.dao.entities.ProductItem;
import ma.wem.commandservice.dao.repositories.CommandRepository;
import ma.wem.commandservice.dao.repositories.ProductItemRepository;
import ma.wem.commandservice.feign.ClientRestClient;
import ma.wem.commandservice.feign.ProductRestClient;
import ma.wem.commandservice.model.Client;
import ma.wem.commandservice.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Collection;
import java.util.Date;
import java.util.Random;
@EnableFeignClients
@SpringBootApplication
public class CommandServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CommandRepository commandRepository,
                                        ProductItemRepository productItemRepository,
                                        ClientRestClient clientRestClient,
                                        ProductRestClient productRestClient
    ) {
        return args -> {
            Collection<Client> clients=clientRestClient.getAllClients().getContent();
            Collection<Product> products=productRestClient.getAllProducts().getContent();

            clients.forEach(c->{
                Command command = Command.builder()
                        .commandDate(new Date())
                        .clientId(c.getId())
                        .build();
                commandRepository.save(command);
                products.forEach(p->{
                    ProductItem productItem=ProductItem.builder()
                            .command(command)
                            .productId(p.getId())
                            .quantity(1+new Random().nextInt(10))
                            .unitPrice(p.getPrice())
                            .build();
                    productItemRepository.save(productItem);
                });
            });

        };

    }

}
