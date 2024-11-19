package ma.wem.commandservice.service;

import ma.wem.commandservice.dao.entities.Command;
import ma.wem.commandservice.dao.repositories.CommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommandService implements CommandManager{
    @Autowired
    private CommandRepository commandRepository;
    @Override
    public Command addCommand(Command command) {
        try {
            return commandRepository.save(command);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean deleteCommand(Command command) {
        try {
            commandRepository.delete(command);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public Command updateCommand(Command command) {
        try {
            return commandRepository.save(command);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Command> getAllCommand() {
        return commandRepository.findAll();
    }

    @Override
    public Command getCommandById(Long id) {
        return commandRepository.findCommandById(id);
    }
}
