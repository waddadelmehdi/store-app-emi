package ma.wem.commandservice.service;

import ma.wem.commandservice.dao.entities.Command;

import java.util.List;

public interface CommandManager {
    public Command addCommand(Command command);
    public boolean deleteCommand(Command command);
    public Command updateCommand(Command command);
    public List<Command> getAllCommand();
    public Command getCommandById(Long id);
}
