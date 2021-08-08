package iterator.implementations.collections;

import iterator.implementations.AbstractCollection;

public class ArrayList<Object> extends AbstractCollection<Object> {

    public ArrayList() {
        this(8);
    }

    public ArrayList(final int capacity) {
        super(new java.lang.Object[capacity]);
    }

    @Override
    public void add(final Object object) {
        if (this.collection.length == this.size) {
            this.increaseCapacity();
        }
        this.collection[size++] = object;
    }

    @Override
    public void remove(final int index) {
        if (index >= this.size)
            throw new ArrayIndexOutOfBoundsException(index);
        for (int idx = index; idx < size-1; idx++)
            this.collection[idx] = this.collection[idx+1];
        this.collection[--size] = null;
    }

    private final void increaseCapacity() {
        java.lang.Object[] arrCopy = new java.lang.Object[this.collection.length * 2];
        for (int i = 0; i < this.collection.length; i++)
            arrCopy[i] = this.collection[i];
        this.collection = arrCopy;
    }

}
