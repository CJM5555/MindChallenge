/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;
import java.util.Iterator;

public interface PlayerListInterface<T> {
   
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
