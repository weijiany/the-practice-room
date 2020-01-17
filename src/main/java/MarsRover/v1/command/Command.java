package MarsRover.v1.command;

import MarsRover.v1.Direction;
import MarsRover.v1.Rover;

public interface Command {
    void exec(Direction direction, Rover rover);
}
