// Complete the class according to the specifications in the writeup
// following proper CSE 11 style guidelines (eg complete ALL headers, 
// proper indentation, etc). Do not import any additional packages. Doing so 
// may fail the Gradescope autograder. Make sure your code compiles and runs 
// on Gradescope

/* 
 Title : CSE 11
 Main Class File: Queue.java 
 File: Tickeet.java,Queue.java,Assignment5.java,Autograder.java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

/**
 * Queue class represents a queue of support tickets.
 * It allows adding, removing, and accessing tickets in a FIFO manner.
 */

public class Queue {

    private int capacity;
    private int size; 
    private Ticket[] ticketQueue; 
    private boolean isLocked;

    //Printed when queue is empty 
    private static final String EMPTY_Q_ERROR = "queue is empty";

    //Printed when trying to add a ticket to a queue that has reached capacity
    private static final String LOCKED_Q_ERROR = "queue is locked!!";


    /**
     * Constructs a default Queue object with initial capacity of 0 and size of 0.
     */
    public Queue() {
        this.capacity=0;
        this.size=0;
        this.ticketQueue=null;
        this.isLocked= false;
    }

    /**
     * Constructs a Queue object with specified capacity.
     *
     * @param capacity the maximum number of tickets the queue can hold
     */

    public Queue(int capacity) {
       if(capacity< 0){
        this.capacity=0;
        this.size=0;
        this.ticketQueue= null;
        this.isLocked= false;
       }else{
        this.capacity=capacity;
        this.size=0;
        this.ticketQueue= new Ticket[capacity];
        this.isLocked= false;
       }
    }
    /**
     * Adds a ticket to the end of the queue.
     * If the queue is full or locked, prints an error message.
     *
     * @param ticket the ticket to be added to the queue
     */

    public void enqueue(Ticket ticket) {

        if (ticketQueue == null || isLocked) {
            System.out.println(LOCKED_Q_ERROR);
            return;
        }
        ticketQueue[size] = ticket;
        size++;
        if (size == capacity) {
            isLocked = true;
            return;
        }


    }
     /**
     * Retrieves the ticket at the front of the queue without removing it.
     * If the queue is empty, prints an error message.
     *
     * @return the ticket at the front of the queue, or null if the queue is empty
     */
    public Ticket peek() {
       if(this.size==0||this.ticketQueue==null){
            System.out.println(EMPTY_Q_ERROR);
            return null;
        }

        return this.ticketQueue[0];
    }
    /**
     * Removes and retrieves the ticket at the front of the queue.
     * If the queue is empty, prints an error message.
     *
     * @return the ticket at the front of the queue, or null if the queue is empty
     */
    public Ticket dequeue() {
        if(this.ticketQueue==null){
            System.out.println(EMPTY_Q_ERROR);
            return null;
        }
        Ticket rTicket= this.ticketQueue[0];
        for(int i=0; i< this.size-1; i++){
            this.ticketQueue[i]= this.ticketQueue[i+1];
        }
        this.ticketQueue[size-1]= null;
        this.size--;

        this.isLocked= false;
        return rTicket;

    }
    /**
     * Retrieves the current size of the queue.
     *
     * @return the number of tickets in the queue
     */
    public int size() {
        return this.size;
    }
    /**
     * Calculates the average wait time of all tickets in the queue based on the given current time.
     *
     * @param currentTime an array representing the current time [hour, minute, second]
     * @return the average wait time in minutes
     */
    public int avgWait(int[] currentTime) {
        if(this.size==0){
            return 0;
        }

        int totalWait= 0;
        for(int i=0; i<size; i++){
            totalWait+= ticketQueue[i].totalWait(currentTime);
        }
      
        return totalWait/size;

        

    }
    /**
     * Checks if the queue is locked (reached its capacity).
     *
     * @return true if the queue is locked, false otherwise
     */
    public boolean isLocked() {
        return isLocked;

    }
}