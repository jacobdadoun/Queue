package edu.touro.mco264;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    // Arrange
    private Queue myQueue = new Queue();
    private Object AssertionError;

    @org.junit.jupiter.api.Test
    void add(){
        assertTrue(myQueue.add("First in line"));
    }

    @org.junit.jupiter.api.Test
    void offer(){
        // Arrange
        myQueue.add("Index 0");
        myQueue.add("Index 1");
        myQueue.add("Index 2");
        myQueue.add("Index 3");
        myQueue.add("Index 4");
        myQueue.add("Index 5");
        myQueue.add("Index 6");
        myQueue.add("Index 7");
        myQueue.add("Index 8");
        myQueue.add("Index 9");
        // Act & Assert
        assertFalse(myQueue.offer("Index 10"));
        assertEquals(myQueue.peek(), "Index 0");
    }

    @org.junit.jupiter.api.Test
    void element(){
        // Arrange
        myQueue.add("First in line");
        myQueue.add("Second in line");
        myQueue.add("Third in line");
        // Act & Assert
        assertEquals("First in line", myQueue.element());
        myQueue.remove();
        assertEquals("Second in line", myQueue.element());
    }

    @org.junit.jupiter.api.Test
    void peek(){
        // Arrange
        myQueue.add("First in line");
        myQueue.add("Second in line");
        // Act & Assert: should retrieve the FIRST IN LINE.
        assertEquals("First in line", myQueue.peek());
    }

    @org.junit.jupiter.api.Test
    void poll(){
        // Arrange
        myQueue.add("First in line");
        myQueue.add("Second in line");
        myQueue.add("Third in line");
        // Act & Assert
        assertEquals("First in line", myQueue.poll());
        assertEquals("Second in line", myQueue.poll());
        assertEquals("Third in line", myQueue.poll());
        assertNull(myQueue.poll());
    }

    @org.junit.jupiter.api.Test
    void remove(){
        // Arrange
        myQueue.add("First in line");
        myQueue.add("Second in line");
        myQueue.add("Third in line");
        // Act & Assert
        assertEquals("First in line", myQueue.remove());
        assertEquals("Second in line",myQueue.remove());
        assertEquals("Third in line", myQueue.element());
        myQueue.remove();
        assertNull(myQueue.element());
    }

    @Test
    void testAll(){
        // Arrange
        myQueue.add("Index 0");
        myQueue.add("Index 1");
        myQueue.add("Index 2");
        myQueue.add("Index 3");
        myQueue.add("Index 4");
        myQueue.add("Index 5");
        myQueue.add("Index 6");
        myQueue.add("Index 7");
        myQueue.add("Index 8");
        myQueue.add("Index 9");
        // Act & Assert
        assertFalse(myQueue.offer("Index 10"));
        assertEquals("Index 0", myQueue.element());
        myQueue.poll();
        assertEquals("Index 1", myQueue.peek());
        myQueue.remove();
        assertEquals("Index 2", myQueue.remove());
    }
}
