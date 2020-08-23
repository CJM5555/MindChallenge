/**
 *
 * @author Chin Yin Shen
 */
package adt;
import java.util.Iterator;

public interface ListInterface<T> {
   
    public boolean add(T newEntry);

    public T remove();
  
    public T remove(int position);
 
    public void clear();
  
    public T getEntry(int position);
  
    public boolean contains(T anEntry);
  
    public int numElement();

    public boolean isEmpty();

    public int getPosition(T anEntry);
  
    public Iterator<T> getIterator();
}
