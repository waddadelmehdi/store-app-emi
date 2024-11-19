package ma.wem.clientservice;

import ma.wem.clientservice.dao.entities.Client;
import ma.wem.clientservice.dao.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(ClientRepository clientRepository){
        return args -> {
            clientRepository.save(Client.builder()
                    .name("Ali").email("ali@gmail.com")
                    .build());
            clientRepository.save(Client.builder()
                    .name("Karim").email("kr@gmail.com")
                    .build());
            clientRepository.save(Client.builder()
                    .name("Sara").email("sr@gmail.com")
                    .build());
            clientRepository.save(Client.builder()
                    .name("Sanae").email("sn@gmail.com")
                    .build());

            clientRepository.findAll().forEach(c->{
                System.out.println("==================");
                System.out.println(c.getId());
                System.out.println(c.getName());
                System.out.println(c.getEmail());
                System.out.println("===================");
            });
        };
    }


}



