package adt;
/**
 *
 * @author Yap Zhi Ying
 */
public interface SetInterface<T> {
     public boolean add(T element);
     public T getEntry(int position);
     public boolean remove(T anElement);
     public boolean checkSubset(SetInterface anotherSet);
     public void union(SetInterface anotherSet);
     public SetInterface intersection(SetInterface anotherSet);
     public boolean isEmpty();
     
}
