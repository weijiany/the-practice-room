package MarsRover.v1.command;

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
