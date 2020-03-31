package by.epam.jwd.controller.command;

import by.epam.jwd.controller.command.studentImpl.JoinGroup;
import by.epam.jwd.controller.command.studentImpl.PassTest;
import by.epam.jwd.controller.command.teacherImpl.AddTest;
import by.epam.jwd.controller.command.teacherImpl.ChangeTest;
import by.epam.jwd.controller.command.teacherImpl.DeleteTest;
import by.epam.jwd.controller.command.teacherImpl.FormGroup;
import by.epam.jwd.controller.command.userImpl.SignIn;
import by.epam.jwd.controller.command.userImpl.SignOut;
import by.epam.jwd.controller.command.userImpl.SignUp;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    public CommandProvider() {
        repository.put(CommandName.SIGN_IN, new SignIn());
        repository.put(CommandName.SING_UP, new SignUp());
        repository.put(CommandName.SIGN_OUT, new SignOut());
        repository.put(CommandName.PASS_TEST, new PassTest());
        repository.put(CommandName.JOIN_GROUP, new JoinGroup());
        repository.put(CommandName.ADD_TEST, new AddTest());
        repository.put(CommandName.CHANGE_TEST, new ChangeTest());
        repository.put(CommandName.DELETE_TEST, new DeleteTest());
        repository.put(CommandName.FORM_GROUP, new FormGroup());
    }

    public Command getCommand(CommandName commandName) {
        return repository.get(commandName);
    }
}
