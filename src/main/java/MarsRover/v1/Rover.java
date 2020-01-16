package MarsRover.v1;

import lombok.Data;

import java.util.Arrays;

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

    public Rover move(String path) {
        Arrays.stream(path.split("")).forEach(command -> {
            if ("M".equals(command)) {
                direction.move(this);
            }
        });
        return this;
    }
}
