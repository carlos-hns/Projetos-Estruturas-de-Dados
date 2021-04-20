package lab.ordenacaocovid;

import java.util.Arrays;

public class Vector {

    private int size;
    private int capacity;
    private Object[] elements;

    public Vector(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.instantiateElements(capacity);
    }

    private void instantiateElements(int size) {
        this.elements = new Object[size];
    }

    private void updateCapacity() {
        this.capacity = this.elements.length;
    }

    private void increaseSize() {
        if (this.size == this.capacity) {
            Object[] newElements = new Object[this.capacity * 2];
            for (int i = 0; i < this.size; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
        updateCapacity();
    }

    public boolean add(Object element) {
        increaseSize();
        if (this.size < this.capacity) {
            this.elements[this.size++] = element;
            // Consegui adicionar
            return true;
        }
        // Não consegui adicionar
        return false;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return String.format("Vector{type='%s', elements=%s}", this.elements[0].getClass(), Arrays.toString(elements));
    }
}
