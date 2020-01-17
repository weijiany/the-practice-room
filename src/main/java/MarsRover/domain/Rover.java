package MarsRover.domain;

import MarsRover.domain.command.Command;
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

    public void move(Command command) {
        command.exec(direction, this);
    }
}
