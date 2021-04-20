package lab.ordenacaocovid.utils;

import java.util.Arrays;

public class Vector<T> {

    private int size;
    private int capacity;
    private T[] elements;

    public Vector(int capacity) throws IllegalArgumentException {
        if (capacity <= 0) throw new IllegalArgumentException("Invalid amount, must be > 0.");
        this.size = 0;
        this.capacity = capacity;
        this.instantiateElements(capacity);
    }

    @SuppressWarnings("unchecked")
    private void instantiateElements(int capacity) {
        this.elements = (T[]) new Object[capacity];
    }

    private void updateCapacity() {
        this.capacity = this.elements.length;
    }

    @SuppressWarnings("unchecked")
    private void increaseSize() {
        if (this.size == this.capacity) {
            T[] newElements = (T[]) new Object[this.capacity * 2];
            for (int i = 0; i < this.size; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
        updateCapacity();
    }

    public void add(T element) throws Exception {
        increaseSize();
        if (this.size < this.capacity) {
            this.elements[this.size++] = element;
        }
        throw new Exception("Failure on add item.");
    }

    public T findWithIndex(int index) throws ArrayIndexOutOfBoundsException {
        if(index < 0 || index > this.size) throw new ArrayIndexOutOfBoundsException("Índice inválido.");
        return elements[index];
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return String.format("Vector{type='%s', elements=%s}", this.elements[0].getClass(), Arrays.toString(elements));
    }
}
