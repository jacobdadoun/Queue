package edu.touro.mco264;

import java.util.List;
import java.util.NoSuchElementException;

public class Queue{

    private int iP;
    private int dP;
    private int maxCapacity = 10;
    private List<String> backingStore = new CircularArrayList();

    // Inserts the specified element into this queue
    // if it is possible to do so immediately without
    // violating capacity restrictions, returning true
    // upon success and throwing an IllegalStateException
    // if no space is currently available.
    public boolean add(String str){
        if(iP < maxCapacity){
            backingStore.add(str);
            iP++;
            return true;
        }
        else{
            // If the element cannot be added at this time
            // due to capacity restrictions...
            if(backingStore.size() >= maxCapacity){
                throw new IllegalStateException();
            }
            return false;
        }
    }

    public boolean offer(String str){
        if(iP < maxCapacity){
            backingStore.add(str);
            return true;
        }
        else{
            return false;
        }
    }

    // Retrieves, but does not remove, the head of this queue.
    // This method differs from peek only in that it throws an
    // exception if this queue is empty.
    public String element(){
        if(backingStore.isEmpty()){
            throw new NoSuchElementException();
        }
        return backingStore.get(dP);
    }

    // Retrieves, but does not remove, THE HEAD of
    // this queue, or returns null if this queue is empty.
    public String peek(){
        if(backingStore.isEmpty()){
            return null;
        }
        return backingStore.get(dP);
    }

    // Retrieves and removes THE HEAD of this queue,
    // or returns null if this queue is empty.
    // Returns: the head of this queue, or null if
    // this queue is empty.
    public String poll(){
        if(backingStore.isEmpty()){
            return null;
        }
        String removedElement = backingStore.get(dP);
        dP++;
        return removedElement;
    }

    // Retrieves and removes the head of this queue.
    // This method DIFFERS FROM POLL only in that it
    // throws an exception if this queue is empty.
    public String remove(){
        if(backingStore.isEmpty()){
            throw new NoSuchElementException();
        }
        String removedElement = backingStore.get(dP);
        dP++;
        return removedElement;
    }
}
