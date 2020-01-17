package MarsRover.domain.command;

import MarsRover.domain.Direction;
import MarsRover.domain.Rover;

public class BackCommand implements Command {

    @Override
    public void exec(Direction direction, Rover rover) {
        direction.back(rover);
    }
}
