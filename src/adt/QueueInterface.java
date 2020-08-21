
package adt;

/**
 *
 * @author Chan Jia Min 
 */

public interface QueueInterface<T> {

    public boolean enqueue(T newEntry);

    public T dequeue();

    public T peek();

    public boolean isEmpty();

    public boolean isFull();

    public boolean clear();
}
