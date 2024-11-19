package ma.wem.commandservice.dao.entities;

import jakarta.persistence.*;
import lombok.*;
import ma.wem.commandservice.model.Client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString @Builder
public class Command {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date commandDate;
    private long clientId;
    @OneToMany(mappedBy = "command")
    private List<ProductItem> productItems= new ArrayList<>();
    @Transient
    private Client client;
}
