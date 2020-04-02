package by.epam.jwd.controller.command;

import by.epam.jwd.controller.command.student_impl.JoinGroup;
import by.epam.jwd.controller.command.student_impl.PassTest;
import by.epam.jwd.controller.command.teacher_impl.AddTest;
import by.epam.jwd.controller.command.teacher_impl.ChangeTest;
import by.epam.jwd.controller.command.teacher_impl.DeleteTest;
import by.epam.jwd.controller.command.teacher_impl.FormGroup;
import by.epam.jwd.controller.command.user_impl.SignIn;
import by.epam.jwd.controller.command.user_impl.SignOut;
import by.epam.jwd.controller.command.user_impl.SignUp;
import by.epam.jwd.controller.command.user_impl.WrongCommand;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();
    private final String COMMAND_PARAM = "command";

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

    public Command getCommand(HttpServletRequest request) {
        String commandParameter = request.getParameter(COMMAND_PARAM);
        Command command = repository.get(commandParameter);

        if (command == null) {
            command = new WrongCommand();
        }

        return command;
    }
}
