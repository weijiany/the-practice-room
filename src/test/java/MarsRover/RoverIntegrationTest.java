package MarsRover;

import MarsRover.domain.Direction;
import MarsRover.domain.Rover;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RoverIntegrationTest {

    private static Object[][] roverForDirectionTurnLeftAndOnlyMoveOnce() {
        return new Object[][] {
                {new Rover(-1, 0, Direction.W), Direction.N},
                {new Rover(0, 1, Direction.N), Direction.E},
                {new Rover(1, 0, Direction.E), Direction.S},
                {new Rover(0, -1, Direction.S), Direction.W}
        };
    }

    @ParameterizedTest
    @MethodSource("roverForDirectionTurnLeftAndOnlyMoveOnce")
    void should_move_and_turn_left(Rover expected, Direction direction) {
        MarsRoverController controller = new MarsRoverController();
        Rover rover = new Rover(0, 0, direction);
        controller.move("LM", rover);

        assertThat(rover).isEqualTo(expected);
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
    @MethodSource("roverForDirectionTurnRightAndOnlyMoveOnce")
    void should_move_and_turn_right(Rover expected, Direction direction) {
        MarsRoverController controller = new MarsRoverController();
        Rover rover = new Rover(0, 0, direction);
        controller.move("RM", rover);

        assertThat(rover).isEqualTo(expected);
    }

    @Test
    void should_move_with_multiple_command() {
        MarsRoverController controller = new MarsRoverController();
        Rover rover = new Rover(0, 0, Direction.N);
        controller.move("MMLMMRMM", rover);

        assertThat(rover).isEqualTo(new Rover(-2, 4, Direction.N));
    }
}
