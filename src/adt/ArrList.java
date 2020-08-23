/*
 *
 * @author Chin Yin Shen 
 */
package adt;
import java.io.*;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class ArrList<T> implements ListInterface<T> , Serializable {

    private T[] array;
    private int numElement;
    private static final int DEFAULT_CAP = 5;
   

    //constructor
    public ArrList() {
        this(DEFAULT_CAP);
        //this - call other constructor in this class with parameter
    }

    public ArrList(int initialCap) {
        numElement = 0;
        array = (T[]) new Object[initialCap];
        
    }

  
    @Override
    public boolean add(T newEntry) {
         //check if array is full or not. if full, expand the array
        if(isArrayFull())
            doubleArrayCap(); //method to double the size of the array
        
        array[numElement] = newEntry;
        numElement++;
        
        return true;
    }

    public T remove(){
        T result = null;
        
        if(!isEmpty()){
            result = array[numElement-1];
            numElement--;
        }
        return result;
    }

    @Override
    public T remove(int position) {
        T result = null;

        if ((position >= 1) && (position <= numElement)) {
            result = array[position - 1];

            if (position < numElement) {
                removeGap(position);
            }
            numElement--;
        }

        return result;
    }
    
    @Override
    public void clear() {
        numElement = 0;
    }
    
    private void removeGap(int position) {
        int lastIndex = numElement - 1;

        for (int i = position - 1; i < lastIndex; i++) {
            array[i] = array[i + 1];
        }
    }


    @Override
    public T getEntry(int position) {

        if ((position >= 1) && (position <= numElement)) {
            return array[position - 1];
        } else {

            return null;
        }
    }

    @Override
    public boolean contains(T anEntry) {

        for (int i = 0; (i < numElement); i++) {
            if (anEntry.equals(array[i])) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int getPosition(T anEntry){
         
        for (int i = 0; (i < numElement); i++) {
            if (anEntry.equals(array[i])) {
                return i+1;
            }
        }
        return 0;
    }

    @Override
    public int numElement() {
        return numElement;
    }

    @Override
    public boolean isEmpty() {
        return numElement == 0;
    }
    
    
    private boolean isArrayFull() {
        return numElement == array.length;
    }
    
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < numElement; ++i) {
            str += array[i] + "\n";
        }
        return str;
    }

    private void doubleArrayCap() {
        T[] oldArray = array;
        int oldLength = oldArray.length;

        //double the size the array capacity
        array = (T[]) new Object[2 * oldLength];
        
        for (int i = 0; i < numElement; i++) {
            array[i] = oldArray[i];
        }
        //System.arraycopy(oldArray, 0, array, 0, numElement); ----alternative 
    }
    
    
    @Override
    public Iterator<T> getIterator() {
        return new ArrListIterator();
    }
    
    private class ArrListIterator implements Iterator<T>{
        private int nextIndex;
        

        private ArrListIterator() {
            nextIndex = 0;
           
        }

        @Override
        public boolean hasNext() {
            return nextIndex < numElement;
        }

        @Override
        public T next() {
            if (hasNext()) {
                
                T nextEntry = array[nextIndex];
                nextIndex++; // advance iterator

                return nextEntry;
            } else {
                throw new NoSuchElementException("Illegal call to next(); iterator is after end of list.");
            }
        }
        
       

    }

    
}


