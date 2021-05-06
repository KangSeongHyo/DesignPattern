package mediator;

import java.util.Objects;

public abstract class Colleague {
    Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    protected abstract void bidding(int paid);
    protected abstract void win(String product);
    protected abstract void lose(int paid);

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return Objects.equals(mediator, o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediator);
    }
}
