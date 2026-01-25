package neetcode;

public class DynamicArray {
    private int[] elements;
    private int size;
    private int capacity;

    public DynamicArray() {
        this.capacity = 2;
        this.size = 0;
        this.elements = new int[capacity];
    }

    public void add(int element) {
        if (size == capacity) {
            resize();
        }
        elements[size] = element;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    public void insert(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == capacity) {
            resize();
        }
        // Shift elements to the right to make space
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    public void removeLast() {
        if (size > 0) {
            size--;
        }
    }

    public int getSize() {
        return size;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

    private void resize() {
        capacity *= 2;
        int[] newElements = new int[capacity];
        if (size >= 0) System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.add(10);
        array.add(20);
        array.add(30);
        System.out.println("Initial array:");
        array.print();

        System.out.println("After removing index 1:");
        array.removeAt(1);
        array.print();

        System.out.println("After inserting 15 at index 1:");
        array.insert(1, 15);
        array.print();

        System.out.println("Current size: " + array.getSize());
    }
}
