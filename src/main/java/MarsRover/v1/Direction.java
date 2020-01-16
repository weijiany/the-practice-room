package MarsRover.v1;

public enum  Direction {
    N {
        @Override
        public void move(Rover rover) {
            rover.setY(rover.getY() + 1);
        }
    },
    S {
        @Override
        public void move(Rover rover) {
            rover.setY(rover.getY() - 1);
        }
    },
    E {
        @Override
        public void move(Rover rover) {
            rover.setX(rover.getX() + 1);
        }
    },
    W {
        @Override
        public void move(Rover rover) {
            rover.setX(rover.getX() - 1);
        }
    };

    public abstract void move(Rover rover);
}
