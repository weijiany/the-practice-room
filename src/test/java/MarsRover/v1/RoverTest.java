package MarsRover.v1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class RoverTest {

    @ParameterizedTest
    @EnumSource(Direction.class)
    void should_moved_rover(Direction direction) {
        Rover rover = new Rover(0, 0, direction);
        Rover then = rover.move("M");

        Assertions.assertEquals(then, rover);
    }
}