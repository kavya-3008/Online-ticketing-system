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
 * Autograder class represents an autograding system for a course.
 * It manages a queue of support tickets submitted by students and provides methods
 * to interact with the queue such as submitting, resolving, and viewing tickets.
 */

public class Autograder{
    private String course;
    private Queue queue;

    /**
     * Constructs a default Autograder object with null course name and an empty queue.
     */

    public Autograder() {
        this.course=null;
        this.queue= new Queue();
    }
    /**
     * Constructs an Autograder object with specified course name and queue capacity.
     *
     * @param course       the name of the course associated with the autograder
     * @param queueCapacity the capacity of the queue for handling support tickets
     */
    public Autograder(String course, int queueCapacity) {
        this.course= course;
        this.queue= new Queue(queueCapacity);

    }
    /**
     * Submits a ticket to the autograder's queue.
     *
     * @param ticket the ticket to be submitted
     */
    public void submitTicket(Ticket ticket) {
        queue.enqueue(ticket);
        
    }
    /**
     * Resolves and retrieves details of the next ticket in the queue.
     *
     * @return details of the resolved ticket
     */
    public String resolveNextTicket() {
        Ticket nextTicket= queue.dequeue();
        return getTicketDetails( nextTicket);
    }
    /**
     * Retrieves details of the next ticket in the queue without removing it.
     *
     * @return details of the next ticket in the queue
     */
    public String viewNextTicket() {
        Ticket newTicket= queue.peek();
        return getTicketDetails(newTicket);
        
    }
    /**
     * Checks if the queue associated with the autograder is locked.
     *
     * @return true if the queue is locked, false otherwise
     */
    public boolean isQueueLocked() {
        return queue.isLocked();
    }
    /**
     * Calculates and retrieves the average wait time for tickets in the queue based on the current time.
     *
     * @param currentTime an array representing the current time [hour, minute, second]
     * @return the average wait time in minutes
     */
    public int getAvgWait(int[] currentTime) {
        return queue.avgWait(currentTime);
    }


     ///////////////////////////////////////////////////
     //  ****  DO NOT CHANGE THE METHODS BELOW!! ***
     ///////////////////////////////////////////////////

     /**
     * Retrieves details of a given ticket.
     *
     * @param ticket the ticket for which details are requested
     * @return details of the ticket
     */
    public String getTicketDetails(Ticket ticket) {
        return ("Student Name: " + ticket.getStudentName()+ "\n" +
                "Submitted at: " + ticket.getTimeStamp()[0] + ":" + 
                ticket.getTimeStamp()[1] + "\n" +
                "Location: " + ticket.getLocation() + "\n" +
                "Description: " + ticket.getDescription());
    }
    /**
     * Retrieves details about the autograder and the current state of the queue.
     *
     * @param currentTime an array representing the current time [hour, minute, second]
     */
    public void getAutograderDetails(int[] currentTime) {
        System.out.println("Welcome to " + this.course + " Autograder!" + "\n"+
                           "Tickets in the queue: " + queue.size());
        if (this.queue.isLocked()){
            System.out.println("Queue is locked!!");
            return;
        } else {
            System.out.println("Queue is open! Average wait for a new ticket is"
                               + " " + getAvgWait(currentTime) + " minutes.");
        }
    }

}