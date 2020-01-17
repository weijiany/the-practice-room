package MarsRover;

import MarsRover.domain.Direction;
import MarsRover.domain.Rover;
import MarsRover.domain.command.MoveCommand;
import MarsRover.domain.command.TurnLeftCommand;
import MarsRover.domain.command.TurnRightCommand;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverUnitTest {

    private static Object[][] roverForMove() {
        return new Object[][] {
                {new Rover(0, 1, Direction.N), Direction.N},
                {new Rover(0, -1, Direction.S), Direction.S},
                {new Rover(1, 0, Direction.E), Direction.E},
                {new Rover(-1, 0, Direction.W), Direction.W}
        };
    }

    @ParameterizedTest
    @MethodSource("roverForMove")
    void should_moved_rover(Rover expected, Direction direction) {
        Rover rover = new Rover(0, 0, direction);
        rover.move(new MoveCommand());

        assertEquals(expected, rover);
    }

    private static Object[][] roverForTurnLeft() {
        return new Object[][] {
                {new Rover(0, 0, Direction.W), Direction.N},
                {new Rover(0, 0, Direction.N), Direction.E},
                {new Rover(0, 0, Direction.E), Direction.S},
                {new Rover(0, 0, Direction.S), Direction.W},
        };
    }

    @ParameterizedTest
    @MethodSource("roverForTurnLeft")
    void should_turn_left(Rover expected, Direction direction) {
        Rover rover = new Rover(0, 0, direction);
        rover.move(new TurnLeftCommand());

        assertEquals(expected, rover);
    }

    private static Object[][] roverForTurnRight() {
        return new Object[][] {
                {new Rover(0, 0, Direction.E), Direction.N},
                {new Rover(0, 0, Direction.S), Direction.E},
                {new Rover(0, 0, Direction.W), Direction.S},
                {new Rover(0, 0, Direction.N), Direction.W},
        };
    }

    @ParameterizedTest
    @MethodSource("roverForTurnRight")
    void should_turn_right(Rover expected, Direction direction) {
        Rover rover = new Rover(0, 0, direction);
        rover.move(new TurnRightCommand());

        assertEquals(expected, rover);
    }
}