//Lee Phey Jiet
package adt;
import java.util.Iterator;
import java.io.*;

public class SortedList<T extends Comparable<T>> implements SortedListInterface<T>,Serializable {
    //private T[] rankList;
    private T[] rankList;
    private int length;
    private static final int DEFAULT_CAPACITY = 10;
    
    public SortedList() {
        this(DEFAULT_CAPACITY);
    }

    public SortedList(int initialCapacity) {
        length = 0;
        rankList = (T[]) new Comparable[initialCapacity];
    }
    
    @Override
    public boolean add(T newRecord) {
        int i = -1;
        
        while(++i < length && newRecord.compareTo(rankList[i]) > 0);
        
        makeRoom(i+1);
        rankList[i] = newRecord;
        length++;
        
        return true;
    }
    
    @Override
    public boolean remove(T anEntry) {
        if(length!=0){
            for(int i=0; i<length && rankList[i].compareTo(anEntry)<0; i++){
                if(rankList[i].equals(anEntry)){
                    removeGap(i+1);
                    length--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean contains(T anEntry) {
        boolean found = false;
        for (int i = 0; !found && (i < length); i++) {
          if (anEntry.equals(rankList[i])) {
            found = true;
          }
        }
        return found;
    }

    @Override
    public void clear() {
        length = 0;
    }
    
    @Override
    public int getLength() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }


    private class SortedArrayIterator implements Iterator<T>{
        int currentIndex=0;

        @Override
        public boolean hasNext() {
            return currentIndex<length;
        }

        @Override
        public T next() {
            T currentElement=null;
            if(hasNext()){
                currentElement=rankList[currentIndex];
                currentIndex++;
            }
            return currentElement;
        }
    }
    
    private boolean isFull() {
        return length == rankList.length;
    }
    
    private void doubleArray() {
        T[] oldList = rankList;
        int oldSize = oldList.length;

        rankList = (T[]) new Object[2 * oldSize];

        for (int index = 0; index < oldSize; index++) {
          rankList[index] = oldList[index];
        }
    }
    
    private void makeRoom(int newPosition) {
        int newIndex = newPosition - 1;
        int lastIndex = length - 1;

        for (int index = lastIndex; index >= newIndex; index--) {
          rankList[index + 1] = rankList[index];
        }
    }
    
    private void removeGap(int givenPosition) {
        int removedIndex = givenPosition - 1;
        int lastIndex = length - 1;

        for (int i = removedIndex; i < lastIndex; i++) {
          rankList[i] = rankList[i + 1];
        }
    }
    
    public String toString() {
        String outputStr="";
        
        if(length==0){
            outputStr = "Record not found.\n";
        }
        else{
            for (int i=0; i<length; i++) {
              outputStr += rankList[i] + "\n";
            }
        }
            
        return outputStr;
    }
}