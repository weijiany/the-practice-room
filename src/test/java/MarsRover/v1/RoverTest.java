package MarsRover.v1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverTest {

    private static Object[][] roverForDirectionOnlyMoveOnce() {
        return new Object[][] {
                {new Rover(0, 1, Direction.N), Direction.N},
                {new Rover(0, -1, Direction.S), Direction.S},
                {new Rover(1, 0, Direction.E), Direction.E},
                {new Rover(-1, 0, Direction.W), Direction.W}
        };
    }

    @ParameterizedTest
    @MethodSource(value = "roverForDirectionOnlyMoveOnce")
    void should_moved_rover(Rover expected, Direction direction) {
        Rover rover = new Rover(0, 0, direction);
        rover.move("M");

        assertEquals(expected, rover);
    }

    private static Object[][] roverForDirectionTurnLeftAndOnlyMoveOnce() {
        return new Object[][] {
                {new Rover(-1, 0, Direction.W), Direction.N},
                {new Rover(0, 1, Direction.N), Direction.E},
                {new Rover(1, 0, Direction.E), Direction.S},
                {new Rover(0, -1, Direction.S), Direction.W}
        };
    }

    @ParameterizedTest
    @MethodSource(value = "roverForDirectionTurnLeftAndOnlyMoveOnce")
    void should_move_and_turn_left(Rover expected, Direction direction) {
        Rover rover = new Rover(0, 0, direction);
        rover.move("LM");

        assertEquals(expected, rover);
    }

    private static Object[][] roverForDirectionTurnRightAndOnlyMoveOnce() {
        return new Object[][] {
                {new Rover(1, 0, Direction.E), Direction.N},
                {new Rover(0, -1, Direction.S), Direction.E},
                {new Rover(-1, 0, Direction.W), Direction.S},
                {new Rover(0, 1, Direction.N), Direction.W}
        };
    }

    @ParameterizedTest
    @MethodSource(value = "roverForDirectionTurnRightAndOnlyMoveOnce")
    void should_move_and_turn_right(Rover expected, Direction direction) {
        Rover rover = new Rover(0, 0, direction);
        rover.move("RM");

        assertEquals(expected, rover);
    }

    @Test
    void should_move_with_multiple_command() {
        Rover rover = new Rover(0, 0, Direction.N);
        rover.move("MMLMMRMM");

        assertEquals(new Rover(-2, 4, Direction.N), rover);
    }
}