package MarsRover;

import MarsRover.domain.Rover;

public class MarsRoverController {

    public void move(String path, Rover rover) {
        CommandParser.parseOf(path).forEach(rover::move);
    }
}
