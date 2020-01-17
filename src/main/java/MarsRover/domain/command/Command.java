package MarsRover.domain.command;

import MarsRover.domain.Direction;
import MarsRover.domain.Rover;

public interface Command {
    void exec(Direction direction, Rover rover);
}
