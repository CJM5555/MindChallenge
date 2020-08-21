 package adt;
/**
 *
 * @author Yap Zhi Ying
 */
public class Set<T> implements SetInterface<T> {
    T[] setArray;
    int capacity;
    private static final int DEFAULT_INITIAL_CAPACITY=20;
    
    public Set(){
        this(DEFAULT_INITIAL_CAPACITY);
    }
    
    public Set(int initialCapacity){
        capacity = 0;
        setArray = (T[]) new Object[initialCapacity];
    }
     public boolean add(T element){
         for(int i=0; i<capacity; i++){
             if(setArray[i].equals(element))
                return false;
         }
         if(arrayFull())
             doubleArray();
        setArray[capacity]=element;
        capacity++;
        return true;
     }
     
     public T getEntry(int position){
         return setArray[position];
     }
     
    public boolean remove(T anElement){
        for(int i=0; i<capacity;i++){
            if(setArray[i].equals(anElement)){
                removeSet(i);
                capacity--;
                return true;
                
            }
        }
        return false;    
    }
    
    public boolean checkSubset(SetInterface anotherSet){
        if(anotherSet instanceof Set){
            Set setA= (Set) anotherSet;             
            if(setA.capacity>this.capacity)
                return false; 
            for(int i=0;i<setA.capacity;i++){
                boolean found = false;
                for(int j=0; j<capacity &&!found; j++){
                    if(setA.setArray[i].equals(setArray[j])){
                        found=true;
                    }
                }
                if(!found)
                    return false; 
            } 
        }
        return true;
    } 
    
    public void union(SetInterface anotherSet){
        if(anotherSet instanceof Set){
            Set setA= (Set) anotherSet;  
            for(int i=0; i<setA.capacity;i++){
                add((T) setA.setArray[i]);
            }
        }
    }
   
    public SetInterface intersection(SetInterface anotherSet){
        SetInterface<T> finalSet = new Set<T>();
        if(anotherSet instanceof Set){
            Set setA= (Set) anotherSet;
            for(int i=0;i<setA.capacity;i++){
            boolean found=false;
            for(int j=0;j<capacity;j++){
            if(setA.setArray[i].equals(setArray[j])){
                found = true;
                finalSet.add((T) setA.setArray[i]);
                    }
                }
            }
        }
        return finalSet;
    }     
    
    public boolean isEmpty(){
    return capacity==0;    
    }
    
    private void removeSet(int index){
        for(int i=index; i<capacity;i++){
            setArray[i]= setArray[i+1];
        }
    }
    
    private boolean arrayFull(){
         return capacity==setArray.length;
    }
   
    private void doubleArray(){
        T[] oldArray=setArray;
        int oldCapacity = oldArray.length;
        setArray=(T[]) new Object[oldCapacity*2];
        for(int i=0; i<capacity; i++){
            setArray[i]=oldArray[i];
        }
    }
    
    public String toString(){
        String output="";
        for(int i=0; i<capacity;i++){
        output += setArray[i];
        }
        return output;
    }
}
