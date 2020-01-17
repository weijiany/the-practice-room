package MarsRover;

import MarsRover.domain.Direction;
import MarsRover.domain.Rover;
import MarsRover.domain.command.BackCommand;
import MarsRover.domain.command.MoveCommand;
import MarsRover.domain.command.TurnLeftCommand;
import MarsRover.domain.command.TurnRightCommand;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static MarsRover.domain.Direction.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverUnitTest {

    private static Object[][] roverForMove() {
        return new Object[][] {
                {new Rover(0, 1, N), N},
                {new Rover(0, -1, S), S},
                {new Rover(1, 0, E), E},
                {new Rover(-1, 0, W), W}
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
                {new Rover(0, 0, W), N},
                {new Rover(0, 0, N), E},
                {new Rover(0, 0, E), S},
                {new Rover(0, 0, S), W},
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
                {new Rover(0, 0, E), N},
                {new Rover(0, 0, S), E},
                {new Rover(0, 0, W), S},
                {new Rover(0, 0, N), W},
        };
    }

    @ParameterizedTest
    @MethodSource("roverForTurnRight")
    void should_turn_right(Rover expected, Direction direction) {
        Rover rover = new Rover(0, 0, direction);
        rover.move(new TurnRightCommand());

        assertEquals(expected, rover);
    }

    @Test
    void should_move_back() {
        Rover rover = new Rover(0, 0, N);
        rover.move(new BackCommand());

        assertEquals(new Rover(0, -1, N), rover);
    }
}