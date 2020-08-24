
package adt;

/**
 *
 * @author Chan Jia Min 
 */

public class Queue<T> implements QueueInterface<T> {

    private T[] array;      //To store the data object
    private int frontIndex; //To store queue front index
    private int rearIndex;  //To store queue back(rear) index
    private static final int DEFAULT_INITIAL_CAPACITY = 5;  //Default capacity

    public Queue() {
        //Construct queue with default initial capacity if no params
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public Queue(int initialCapacity) {
        //Initialize array to store object, front and rear index
        array = (T[]) new Object[initialCapacity + 1];
        frontIndex = 0;
        rearIndex = initialCapacity;
    }

    public boolean enqueue(T newEntry) {
        if (isFull()) {
            return false;  //Cannot add newEnrty if full
        } 
        else {
            rearIndex = (rearIndex + 1) % array.length;
            array[rearIndex] = newEntry; //Add to back of queue
            return true;
        }
    }

    public T peek() {
        if (isEmpty()) {
            return null;   //Nothing to retrieve
        } 
        else {
            return array[frontIndex]; //Return object at front
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;   //Nothing to retrieve
        } 
        else {
            T object = array[frontIndex];  //Retrieve object
            array[frontIndex] = null;      //Remove object
            frontIndex = (frontIndex + 1) % array.length; //Update front index
            return object;
        }
    }

    public boolean isEmpty() {
        //Determines whether array is empty
        return frontIndex == ((rearIndex + 1) % array.length);
    }

    public boolean clear() {

        if (isEmpty()) {
            return false;  //Nothing to clear
        } 
        else {
            //Clear all references to object
            for (int index = frontIndex; index != rearIndex;
                 index = (index + 1) % array.length) {
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
        //Determines whether array is full
        return frontIndex == ((rearIndex + 2) % array.length);
    }
}