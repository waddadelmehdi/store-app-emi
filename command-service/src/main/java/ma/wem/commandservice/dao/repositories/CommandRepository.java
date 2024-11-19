package ma.wem.commandservice.dao.repositories;

import ma.wem.commandservice.dao.entities.Command;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandRepository extends JpaRepository<Command,Long> {
    Command findCommandById(Long id);
}
