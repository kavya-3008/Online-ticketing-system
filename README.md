# Online Autograder System

## Overview
This repository contains all the necessary Java files for Assignment 5 of CSE 11: Introduction to Programming and Computational Problem Solving at UCSD. The project involves implementing an autograder system that manages a queue of support tickets, similar to those used during office hours for course assistance.

## Learning Goals
- Implement classes with comprehensive getters and setters.
- Write robust unit tests using objects and instance methods to ensure functionality.

## Components
- **Ticket Class**: Represents the properties of a support ticket.
- **Queue Class**: Manages the tickets in a FIFO (First-In-First-Out) manner.
- **Autograder Class**: Interfaces with the queue to handle ticket submissions and resolutions.

## Repository Structure
- `Ticket.java`: Defines the properties and methods of a support ticket.
- `Queue.java`: Implements the queue logic for ticket management.
- `Autograder.java`: Provides the functionality to interact with the ticket queue system.
- `Assignment5.java`: Contains main methods and unit tests for the system.

## Autograder System
The autograder system automates the process of ticket management through several key functionalities:
- **Ticket Submission**: Allows students to submit tickets detailing their issues.
- **Ticket Resolution**: Facilitates the resolution and removal of tickets from the queue.
- **Queue Management**: Supports viewing and managing the queue's status and contents.

## Setup and Execution
To run this project locally:
1. Clone this repository:
   ```
   git clone https://github.com/your-username/cse11-sp24-assignment5.git
   ```
2. Compile the Java files within the `assignment5` folder:
   ```
   javac *.java
   ```
3. Execute the main program to run tests:
   ```
   java Assignment5
   ```

## Autograder Testing
The system's robustness is ensured through unit tests that simulate various scenarios involving ticket submissions, queue operations, and autograder interactions. These tests help verify the functionality and reliability of the system under different conditions.

## License
This project is provided for educational use and is not licensed for commercial use.
