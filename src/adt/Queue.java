
package adt;

/**
 *
 * @author Chan Jia Min 
 */

public class Queue<T> implements QueueInterface<T> {

    private T[] array;
    private int frontIndex;
    private int rearIndex;
    private static final int DEFAULT_INITIAL_CAPACITY = 5;

    public Queue() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public Queue(int initialCapacity) {
        array = (T[]) new Object[initialCapacity + 1];
        frontIndex = 0;
        rearIndex = initialCapacity;
    }

    public boolean enqueue(T newEntry) {
        if (isFull()) {
            return false;
        } 
        else {
            rearIndex = (rearIndex + 1) % array.length;
            array[rearIndex] = newEntry;
            return true;
        }
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } 
        else {
            return array[frontIndex];
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        } 
        else {
            T object = array[frontIndex];
            array[frontIndex] = null;
            frontIndex = (frontIndex + 1) % array.length;
            return object;
        }
    }

    public boolean isEmpty() {
        return frontIndex == ((rearIndex + 1) % array.length);
    }

    public boolean clear() {

        if (isEmpty()) {
            //Nothing to clear
            return false;
        } 
        else {
            //Clear all references to object
            for (int index = frontIndex; index != rearIndex; index = (index + 1) % array.length) {
                array[index] = null;
            }
            array[rearIndex] = null;
            
            //Initialize index
            frontIndex = 0;
            rearIndex = array.length - 1;
            return true;
        }
    }

    public boolean isFull() {
        return frontIndex == ((rearIndex + 2) % array.length);
    }
}