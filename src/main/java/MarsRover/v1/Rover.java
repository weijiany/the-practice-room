package MarsRover.v1;

import MarsRover.v1.command.CommandParser;
import lombok.Data;

@Data
public class Rover {

    private int x;
    private int y;
    private Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move(String path) {
        CommandParser.parseOf(path).forEach(command -> command.exec(direction, this));
    }
}
