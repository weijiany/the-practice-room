package MarsRover;

import MarsRover.domain.Direction;
import MarsRover.domain.Rover;
import MarsRover.domain.command.MoveCommand;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverUnitTest {

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
        rover.move(new MoveCommand());

        assertEquals(expected, rover);
    }
}