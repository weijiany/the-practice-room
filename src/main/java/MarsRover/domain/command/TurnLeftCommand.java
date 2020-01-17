package MarsRover.domain.command;

import MarsRover.domain.Direction;
import MarsRover.domain.Rover;

public class TurnLeftCommand implements Command {

    @Override
    public void exec(Direction direction, Rover rover) {
        direction.turnLeft(rover);
    }
}
