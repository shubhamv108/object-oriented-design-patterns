package pipesfilters;

import java.util.ArrayList;
import java.util.List;

public class PipelineProcessor<T> extends AbstractProcessor<T> {

    private List<AbstractProcessor<T>> processors = new ArrayList<>();

    @Override
    public T process(T t) {
        for (AbstractProcessor<T> processor : processors)
            t = processor.process(t);
        return t;
    }

    public void registerProcessor (AbstractProcessor<T> processor) {
        if (null != processor) processors.add(processor);
    }
}
