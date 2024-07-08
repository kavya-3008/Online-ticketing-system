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
 * Assignment5 class contains unit tests for Ticket, Queue, and Autograder classes.
 * It checks various functionalities of these classes.
 */

public class Assignment5 {
    /**
     * Performs unit tests for Ticket, Queue, and Autograder classes.
     * 
     * @return true if all tests pass, false otherwise
     */
    public static boolean unitTests() {

        // Ticket.java test cases

        // Ticket test case 1 
        Ticket ticket = new Ticket(); 
        ticket.setStudentName("Jon Snow");
        if (!ticket.getStudentName().equals("Jon Snow")) {
            System.out.println("Ticket test case 1 failed!"); 
            return false; 
        }

        // Ticket test case 2 
        int[] timeStamp = {16,20,34}; 
        int[] currentTime = {18,14,55};
        ticket = new Ticket("Jon Snow", timeStamp, "B250A", 
                              "I need help debugging a problem", true); 
        
        if (ticket.totalWait(currentTime) != 114) {
            System.out.println("Ticket test case 2 failed!"); 
            return false; 
        }
        // Ticket test case 3
        Ticket ticket3 = new Ticket(); 
        ticket3.setDebugging(true);
        if (!ticket3.isDebugging()) {
            System.out.println("Ticket test case 3 failed!"); 
            return false; 
        }
        
        // TODO: Ticket test case 4
        Ticket ticket4 = new Ticket("Alice", new int[]{12, 15, 30}, "Hallway", 
                            "Need help with Java assignment", false);
        int[] currentTime2 = {12, 20, 0};
        if (ticket4.totalWait(currentTime2) != 5) {
            System.out.println("Ticket test case 4 failed!");
            return false; }                  
        // TODO: Ticket test case 5

        Ticket ticket5 = new Ticket("Harry", new int[]{11, 10, 9}, "In front of 250", 
                            "Need help with Java assignment", false);
        if (!ticket5.getStudentName().equals("Harry") || 
            ticket5.getTimeStamp()[0] != 11 || 
            ticket5.getTimeStamp()[1] != 10 || 
            ticket5.getTimeStamp()[2] != 9 || 
            !ticket5.getLocation().equals("In front of 250") || 
            !ticket5.getDescription().equals("Need help with Java assignment") || 
            ticket5.isDebugging()) {
            System.out.println("Ticket test case 5 failed!");
            return false;
}

        // Queue.java test cases

        // Queue test case 1
        Queue cse11 = new Queue(5);
        Ticket st1 = new Ticket("Bob Button", new int[]{11,25,33},"Basement",
                                "How to get started", false);
        Ticket st2 = new Ticket("Sponge Bob", new int[]{13,24,46},
                                "Under the sea", "I need help debugging Gary",
                                true);
        cse11.enqueue(st1);
        cse11.enqueue(st2);  
        
        if (cse11.peek() != st1) {
            System.out.println("Queue test case 1-1 failed!"); 
            return false; 
        }
        if (cse11.size() != 2) {
            System.out.println("Queue test case 1-2 failed!"); 
            return false; 
        }
        // Queue test case 2
       Queue queue2 = new Queue(4);
       Ticket ticket2_1 = new Ticket("Harry styles", new int[]{10, 0, 0}, "New York",
                                    "Need help making album", true);
       Ticket ticket2_2 = new Ticket("Taylor swift", new int[]{11, 0, 0}, "Los Angeles",
                                    "want to meet harry", false);
       Ticket ticket2_3 = new Ticket("Kavya", new int[]{12, 0, 0}, "San diego",
                                    "Want to see harry and taylor", false);
       Ticket ticket2_4= new Ticket("Pushti", new int[]{13,0,0}, "San diego", 
                                    "loves kavya", false)  ;
        queue2.enqueue(ticket2_1);                          
        queue2.enqueue(ticket2_2);
        queue2.enqueue(ticket2_3);
        queue2.enqueue(ticket2_4);
        queue2.dequeue();
        queue2.dequeue();
        queue2.dequeue();

        if (queue2.peek() != ticket2_4) {
            System.out.println("Queue test case 2 failed!");
            return false;
        }


        // TODO: Queue test case 3

        Queue queue3 = new Queue(4);
        Ticket ticket3_1 = new Ticket("Robb Stark", new int[]{9, 0, 0}, "Winterfell",
                                    "Need help with battle tactics", true);
        Ticket ticket3_2 = new Ticket("Joffrey Baratheon", new int[]{10, 0, 0}, "Kings Landing",
                                    "Need help with ruling", false);
        Ticket ticket3_3 = new Ticket("Robert Baratheon", new int[]{11, 0, 0}, "Kings Landing",
                                    "Need help with hunting", false);
        Ticket ticket3_4 = new Ticket("Kavya", new int[]{12, 0, 0}, "San diego",
                                    "Want to see harry and taylor", false);  
        queue3.enqueue(ticket3_1);
        queue3.enqueue(ticket3_2);
        queue3.enqueue(ticket3_3);
        queue3.enqueue(ticket3_4);
        queue3.dequeue();
        queue3.dequeue();
        queue3.dequeue();

        if (queue3.size() != 1) {
            System.out.println("Queue test case 3 failed!");
            return false;
        }
        // TODO: Queue test case 4
        Queue queue4 = new Queue(5);
        Ticket ticket4_1 = new Ticket("Tywin Lannister", new int[]{8, 0, 0}, "Casterly Rock",
                                    "Need help with ruling", false);
        Ticket ticket4_2 = new Ticket("Margaery Tyrell", new int[]{9, 0, 0}, "Highgarden",
                                    "Need help with politics", false);
        Ticket ticket4_3 = new Ticket("Stannis Baratheon", new int[]{10, 0, 0}, "Dragonstone",
                                    "Need help with war strategy", true);
        Ticket ticket4_4= new Ticket("Harry", new int[]{11,0,0}, "london", "Doesnt like kavya", false);
        queue4.enqueue(ticket4_1);
        queue4.enqueue(ticket4_2);
        queue4.enqueue(ticket4_3);
        queue4.enqueue(ticket4_4);
        queue4.dequeue();
        queue4.dequeue();
        queue4.dequeue();

        int[] currentTime4 = {12, 0, 0};
        if (queue4.avgWait(currentTime4) != 60) {
            System.out.println("Queue test case 4 failed!");
            return false;
        }


        //Autogrrader.java test cases 

        // Autograder test case 1
        Autograder cse11AG = new Autograder("CSE11", 20); 
        Ticket st3 = new Ticket("Sponge Bob", new int[]{14,24,46},
                                "Under the sea", "I need help debugging Gary", 
                                true);
        cse11AG.submitTicket(st3); 

        if (cse11AG.isQueueLocked()) {
            System.out.println("Autogrdaer test case 1-1 failed!"); 
            return false; 
        }
        if (cse11AG.getAvgWait(new int[]{15,24,55}) != 60) {
            System.out.println("Autogrdaer test case 1-2 failed!"); 
            return false; 
        }
        String output= "Student Name: Sponge Bob\n" +
                       "Submitted at: 14:24\n" +
                       "Location: Under the sea\n" +
                       "Description: I need help debugging Gary";
        if (!cse11AG.viewNextTicket().equals(output)) {
            System.out.println("Autogrdaer test case 1-3 failed!"); 
            return false; 
        }
        Ticket st4 = new Ticket("Patrick Star", new int[]{13,59,02}, 
                                "Bikini Bottom",
                                "Can you help me find sponge Bob?", false);
        cse11AG.submitTicket(st4);
        if (!cse11AG.resolveNextTicket().equals(output)) {
            System.out.println("Autogrdaer test case 1-4 failed!"); 
            return false; 
        }

        //Print Autograder
        cse11AG.getAutograderDetails(new int[]{16,17,18});

        // TODO: Autograder test case 2
        Autograder autograder1 = new Autograder("CSE11", 3);
        Ticket ticket1_1 = new Ticket("Jon Snow", new int[]{14, 00, 00}, "The Wall",
                                    "Need help with Night King", true);
        Ticket ticket1_2 = new Ticket("Sansa Stark", new int[]{15, 00, 00}, "Winterfell",
                                    "Need help with managing the North", false);
        Ticket ticket1_3 = new Ticket("Arya Stark", new int[]{16, 00, 00}, "Braavos",
                                    "Need help with sword fighting techniques", false);
        autograder1.submitTicket(ticket1_1);
        autograder1.submitTicket(ticket1_2);
        autograder1.submitTicket(ticket1_3);

     

        if (!autograder1.isQueueLocked()) {
            System.out.println("Autograder test case 2 failed: Queue should be locked!");
            return false;
        }
        
      
        if (autograder1.getAvgWait(new int[]{17, 0, 0}) !=120) {
            System.out.println("Autograder test case 2 failed: Incorrect average wait time!" +autograder1.getAvgWait(new int[]{17, 0, 0}) );
            return false;
        }

  
        String expectedTicketDetails1 = "Student Name: Jon Snow\n" +
                                        "Submitted at: 14:0\n" +
                                        "Location: The Wall\n" +
                                        "Description: Need help with Night King"; 
        String viewedTicket1 = autograder1.viewNextTicket();
        if (!viewedTicket1.equals(expectedTicketDetails1)) {
            System.out.println("Autograder test case 2 failed: Incorrect next ticket details!"+ viewedTicket1);
            return false;
        }

        String resolvedTicket1 = autograder1.resolveNextTicket();
        
        String expectedResolvedTicket1 = "Student Name: Jon Snow\n" +
                                        "Submitted at: 14:0\n" +
                                        "Location: The Wall\n" +
                                        "Description: Need help with Night King" ;
        if (!resolvedTicket1.equals(expectedResolvedTicket1)) {
            System.out.println("Autograder test case 2 failed: Incorrect resolved ticket details!");
            return false;
        }
       
        
        // TODO: Autograder test case 3

        Autograder cse11_k = new Autograder("CSE11", 10); 
        Ticket stk = new Ticket("Kavya", new int[]{13,0,0},
                                "Sd", "I need help debugging ", 
                                true);
        cse11_k.submitTicket(stk); 

        if (cse11_k.isQueueLocked()) {
            System.out.println("Autogrdaer test case queue 3 failed!"); 
            return false; 
        }
        if (cse11_k.getAvgWait(new int[]{14,0,0}) != 60) {
            System.out.println("Autogrdaer test case time 3 failed!"); 
            return false; 
        }
        String output_k= "Student Name: Kavya\n" +
                       "Submitted at: 13:0\n" +
                       "Location: Sd\n" +
                       "Description: I need help debugging ";
        if (!cse11_k.viewNextTicket().equals(output_k)) {
            System.out.println("Autogrdaer test case 3 view failed!"); 
            return false; 
        }
        String resolvedTicketk = cse11_k.resolveNextTicket();
        
        String expectedResolvedTicketk = "Student Name: Kavya\n" +
                                        "Submitted at: 13:0\n" +
                                        "Location: Sd\n" +
                                        "Description: I need help debugging " ;
        if (!resolvedTicketk.equals(expectedResolvedTicketk)) {
            System.out.println("Autograder test case 3 resolved failed");
            return false;
        }

        // TODO: Autograder test case 4
        Autograder au4= new Autograder("CSE 11", 3);
        Ticket tick_4= new Ticket ("Kavya", new int[]{12,0,0}, "Sd", "Need help", true);
        au4.submitTicket(tick_4);

        if (au4.isQueueLocked()) {
            System.out.println("Autogrdaer test case queue 4 failed!"); 
            return false; 
        }

        if (au4.getAvgWait(new int[]{14,0,0}) != 120) {
            System.out.println("Autogrdaer test case time 4 failed!"); 
            return false; 
        }

        au4.resolveNextTicket();
        Ticket tickett4_2 = new Ticket("Tyrion Lannister", new int[]{12, 30, 0}, "King's Landing",
                                "Need help with politics", false);
        Ticket tickett4_3 = new Ticket("Cersei Lannister", new int[]{13, 0, 0}, "Red Keep",
                                "Need help with power struggle", false);
        au4.submitTicket(tickett4_2);
        au4.submitTicket(tickett4_3);

        String output_4= "Student Name: Tyrion Lannister\n" +
                       "Submitted at: 12:30\n" +
                       "Location: King's Landing\n" +
                       "Description: Need help with politics";
        if (!au4.viewNextTicket().equals(output_4)) {
            System.out.println("Autogrdaer test case 4 view failed! " + au4.viewNextTicket()); 
            return false; 
        }

        String output_5= "Student Name: Tyrion Lannister\n" +
                       "Submitted at: 12:30\n" +
                       "Location: King's Landing\n" +
                       "Description: Need help with politics";
        if (!au4.resolveNextTicket().equals(output_5)) {
            System.out.println("Autogrdaer test case 4 view failed! "); 
            return false; 
        }
        
      
        return true; 
    }

    /**
 * The main method of the Assignment5 class.
 * 
 * @param args The command line arguments passed to the program.
 * @return returns statements if all tests pass or fail.
 */
    public static void main(String[] args) {
        // Perform unitTests 
        if (unitTests()) {
            System.out.println("All unit tests passed.\n");
        } else {
            System.out.println("ERROR: Failed test.\n");
            return;
        }
    }
}
