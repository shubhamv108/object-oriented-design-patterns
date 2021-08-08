package iterator.implementations;

import iterator.IContainer;
import iterator.IIterator;

public abstract class AbstractCollection<Object> implements IContainer<Object> {

    protected java.lang.Object[] collection;
    protected int size;

    protected AbstractCollection(final java.lang.Object[] collection) {
        this.collection = collection;
    }

    public void add(final Object object) {
        throw new UnsupportedOperationException();
    }

    public void remove(final int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IIterator<Object> iterator() {
        return new CollectionIterator<Object>();
    }

    /**
     * The iterator object will maintain the state of the iteration,
     * keeping track of the current item and having a way of identifying what elements are next to be iterated.
     */
    private class CollectionIterator<Object> implements IIterator<Object> {

        private int nextPosition;

        @Override
        public boolean hasNext() {
            return collection != null && this.nextPosition < size;
        }

        @Override
        public Object next() {
//            return this.hasNext() ? (Object) collection[this.nextPosition++] : null;
            return (Object) collection[this.nextPosition++];
        }

        @Override
        public void remove() {
            AbstractCollection.this.remove(--this.nextPosition);
        }
    }

}
