package MarsRover;

import MarsRover.domain.command.Command;
import MarsRover.domain.command.MoveCommand;
import MarsRover.domain.command.TurnLeftCommand;
import MarsRover.domain.command.TurnRightCommand;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public final class CommandParser {

    private CommandParser() {}

    public static List<Command> parseOf(String path) {
        return Arrays.stream(path.split(""))
                .map(CommandParser::getCommand)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private static Command getCommand(String instruct) {
        switch (instruct) {
            case "M":
                return new MoveCommand();
            case "L":
                return new TurnLeftCommand();
            case "R":
                return new TurnRightCommand();
            default:
                return null;
        }
    }
}
