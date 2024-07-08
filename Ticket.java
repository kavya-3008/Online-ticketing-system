// Complete the class according to the specifications in the writeup
// following proper CSE 11 style guidelines (eg complete ALL headers, 
// proper indentation, etc). Do not import any additional packages. Doing so 
// may fail the Gradescope autograder. Make sure your code compiles and runs 
// on Gradescope

/* 
 Title : CSE 11
 Main Class File: Ticket.java 
 File: Tickeet.java,Queue.java,Assignment5.java,Autograder.java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */


/**
 * Ticket class represents a support ticket submitted by a student.
 * Each ticket contains information such as student name, timestamp, location, description,
 * and whether debugging is required or not.
 */

public class Ticket {

    private static final int TIME_FORMAT = 3; 
    private static final int MIN_IN_HOUR = 60; //number of minutes in an hour

    private String studentName; 
    private int[] timeStamp;
    private String location;
    private String description;
    private boolean debugging;  

    /**
     * Constructs a default constrcutor Ticket object with null or default values.
     */

    public Ticket() { 
        this.studentName= null;
        this.timeStamp=new int[]{0,0,0};
        this.location=null;
        this.description= null;
        this.debugging= false;
    }
    /**
     * Constructs a Ticket object with specified attributes.
     *
     * @param studentName  the name of the student submitting the ticket
     * @param timeStamp    an array representing the time when the ticket was submitted
     * @param location     the location associated with the ticket
     * @param description  a  description of the issue reported in the ticket
     * @param debugging    a boolean indicating whether debugging assistance is requested or not
     */

    public Ticket(String studentName, 
                  int[] timeStamp,
                  String location,
                  String description, 
                  boolean debugging) {
            this.studentName = studentName;
            this.timeStamp = new int[TIME_FORMAT];
            for(int i=0; i<timeStamp.length; i++){
                this.timeStamp[i]= timeStamp[i];
            };
                
            // System.arraycopy(timeStamp, 0, this.timeStamp, 0, TIME_FORMAT); // Deep copy timeStamp
            this.location = location;
            this.description = description;
            this.debugging = debugging;
    }
    /**
     * Retrieves the name of the student associated with the ticket.
     *
     * @return the name of the student
     */

    public String getStudentName() { 
        return this.studentName; 
    }
    /**
     * Retrieves a copy of the timestamp associated with the ticket.
     *
     * @return an array representing the timestamp [hour, minute, second]
     */
    public int[] getTimeStamp() {  
        int[] copyArr= new int[TIME_FORMAT];
        System.arraycopy(this.timeStamp,0, copyArr,0, TIME_FORMAT);
        
        return copyArr;
    }
    /**
     * Retrieves the location associated with the ticket.
     *
     * @return the location of the ticket
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Retrieves the description of the issue reported in the ticket.
     *
     * @return the description of the issue
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Checks if debugging assistance is requested for the ticket.
     *
     * @return true if debugging assistance is requested, false otherwise
     */
    
    public boolean isDebugging() {
        return this.debugging;
    }
    /**
     * Sets the name of the student associated with the ticket.
     *
     * @param studentName the name of the student
     */
    public void setStudentName(String studentName) {
        this.studentName= studentName;

    }
    /**
     * Sets the timestamp associated with the ticket.
     *
     * @param timeStamp an array representing the timestamp [hour, minute, second]
     */
    public void setTimeStamp(int[] timeStamp) {
        this.timeStamp= new int[TIME_FORMAT];
        for(int i=0; i<timeStamp.length; i++){
                this.timeStamp[i]= timeStamp[i];
            };
    }
    /**
     * Sets the location associated with the ticket.
     *
     * @param location the location of the ticket
     */
    public void setLocation(String location) {
        this.location= location;
    }
    /**
     * Sets the description of the issue reported in the ticket.
     *
     * @param description the description of the issue
     */
    public void setDescription(String description) {
        this.description= description;
    }
    /**
     * Sets whether debugging assistance is requested for the ticket.
     *
     * @param debugging true if debugging assistance is requested, false otherwise
     */
    public void setDebugging(boolean debugging) {
        this.debugging= debugging;
    }
    /**
     * Calculates the total waiting time since the ticket was submitted until the specified current time.
     *
     * @param currentTime an array representing the current time [hour, minute, second]
     * @return the total waiting time in minutes
     */
    public int totalWait(int[] currentTime) {
        int ans= 0;
        ans+=(currentTime[0]- this.timeStamp[0])*MIN_IN_HOUR;
        ans+=(currentTime[1]- this.timeStamp[1]);
        return ans;
    }
}
