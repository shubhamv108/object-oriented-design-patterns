package builder;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSequenceBuilder<AbstractSequenceBuilder, Object> implements ISequenceBuilder<AbstractSequenceBuilder, Object> {

    private final List<Object> list = new ArrayList<>();

    @Override
    public List<Object> build() {
        return this.list;
    }

    @Override
    public AbstractSequenceBuilder and() {
        this.reset();
        return (AbstractSequenceBuilder) this;
    }

    public void add(final Object object) {
        this.list.add(object);
    }

    protected void reset() {

    }
}
