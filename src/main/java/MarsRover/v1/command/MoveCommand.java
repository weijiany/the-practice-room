package MarsRover.v1.command;

import MarsRover.v1.Direction;
import MarsRover.v1.Rover;

public class MoveCommand implements Command {

    @Override
    public void exec(Direction direction, Rover rover) {
        direction.move(rover);
    }
}
