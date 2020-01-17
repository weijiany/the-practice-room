package MarsRover.domain.command;

import MarsRover.domain.Direction;
import MarsRover.domain.Rover;

public class TurnRightCommand implements Command {

    @Override
    public void exec(Direction direction, Rover rover) {
        direction.turnRight(rover);
    }
}
