package MarsRover.domain;

import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum  Direction {
    N(0) {
        @Override
        public void move(Rover rover) {
            rover.setY(rover.getY() + 1);
        }
    },
    E(1) {
        @Override
        public void move(Rover rover) {
            rover.setX(rover.getX() + 1);
        }
    },
    S(2) {
        @Override
        public void move(Rover rover) {
            rover.setY(rover.getY() - 1);
        }
    },
    W(3) {
        @Override
        public void move(Rover rover) {
            rover.setX(rover.getX() - 1);
        }
    };

    @Getter
    private int value;

    Direction(int value) {
        this.value = value;
    }

    private static Map<Integer, Direction> intForDirection =
            Arrays.stream(Direction.values()).collect(Collectors.toMap(Direction::getValue, direction -> direction));

    public abstract void move(Rover rover);

    public void turnLeft(Rover rover) {
        rover.setDirection(intForDirection.get((rover.getDirection().value + 3) % 4));
    }

    public void turnRight(Rover rover) {
        rover.setDirection(intForDirection.get((rover.getDirection().value + 1) % 4));
    }
}
