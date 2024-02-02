import java.util.*;
import java.io.*;    // for File
import java.nio.file.*;
import java.util.stream.*;
import java.nio.charset.StandardCharsets;

public class COCalendar {
   public static void main(String[] args) throws FileNotFoundException {
      System.out.println("What date would you like to look at?");
      prompt();
   } // end of main
   
   public static void prompt() throws FileNotFoundException {
      Calendar cal = Calendar.getInstance(); // get calendar (Off by 1 month)
      Scanner input = new Scanner(System.in); // get scanner
      File f = new File("calendarEvents.txt"); // input scanner and file
      Scanner sc = new Scanner(f);
         Path path = Paths.get("calendarEvents.txt");
         byte[] bytes = null;
         try {
   	      bytes = Files.readAllBytes(path);
         } catch (IOException ex) {
         } 

      
      // beginning prompt: ask for date
      System.out.println("Menu:");
      System.out.println("\"Enter\" to enter a date and display corresponding calendar");
      System.out.println("\"Today\" to get today's date and calendar"); 
      System.out.println("\"Event\" to view events");
      System.out.println("\"Art\" to view art");
      System.out.println("\"Quit\" to quit program");
      String w = input.next();
      char e = w.charAt(0);
      char g = w.charAt(1);

      // if/else
      if (g == 'v') {
         boolean answer = true;
         while (answer) {
            if (f.exists()) {
            String s1 = new String(bytes, StandardCharsets.UTF_8);
            int month = sc.nextInt();
            char h = sc.next().charAt(0);
            int day = sc.nextInt();
            String events = sc.nextLine();
            
            if (month == 1 && day == 1) {
               eventArray(month, day, events);
               answer = false;

            } else if (month == 1 && day == 15) {
               eventArray(month, day, events);
               answer = false;
   
            } else if (month == 2 && day == 19) {
               eventArray(month, day, events);
               answer = false;

            } else if (month == 5 && day == 28) {
               eventArray(month, day, events);
               answer = false;

            } else if (month == 7 && day == 4) {
               eventArray(month, day, events);
               answer = false;
   
            } else if (month == 9 && day == 3) {
               eventArray(month, day, events);
               answer = false;
   
            } else if (month == 10 && day == 8) {
               eventArray(month, day, events);
               answer = false;
   
            } else if (month == 11 && day == 12) {
               eventArray(month, day, events);
               answer = false;
   
            } else if (month == 11 && day == 22) {
               eventArray(month, day, events);
               answer = false;
   
            } else if (month == 12 && day == 25) {
               eventArray(month, day, events);
               answer = false;
            } // end of if/else
         } else {
            System.out.println("\nEnter event date: (MM / DD \"event name\") ");
            int month = input.nextInt();
            char h = input.next().charAt(0);
            int day = input.nextInt();
            String events = input.nextLine();
         
            if (month == 1 && day == 1) {
               eventArray(month, day, events);
               answer = false;

            } else if (month == 1 && day == 15) {
               eventArray(month, day, events);
               answer = false;
   
            } else if (month == 2 && day == 19) {
               eventArray(month, day, events);
               answer = false;

            } else if (month == 5 && day == 28) {
               eventArray(month, day, events);
               answer = false;

            } else if (month == 7 && day == 4) {
               eventArray(month, day, events);
               answer = false;
   
            } else if (month == 9 && day == 3) {
               eventArray(month, day, events);
               answer = false;
   
            } else if (month == 10 && day == 8) {
               eventArray(month, day, events);
               answer = false;
   
            } else if (month == 11 && day == 12) {
               eventArray(month, day, events);
               answer = false;
   
            } else if (month == 11 && day == 22) {
               eventArray(month, day, events);
               answer = false;
   
            } else if (month == 12 && day == 25) {
               eventArray(month, day, events);
               answer = false;
   
            } else {
               System.out.println("Error: a holiday was not entered, try again");
               } // end of if /else
            } // end of if/else
         } // end of while
            
      } else {
         if (e == 'e' || e == 'E') { // PRINT SELECTED DATE
            System.out.println("\nPlease enter date: (mm / dd)");
            int month = input.nextInt();
            char h = input.next().charAt(0);
            int day = input.nextInt();
            getDate(month, day);
           
         } else if (e == 't' || e == 'T') { // PRINT ACTUAL DATE
            String dog = "dog";
            if ((cal.get(Calendar.MONTH) + 1) == 1 || (cal.get(Calendar.MONTH) + 1) == 3 || (cal.get(Calendar.MONTH) + 1) == 5 || 
               (cal.get(Calendar.MONTH) + 1) == 7 || (cal.get(Calendar.MONTH) + 1) == 8 || (cal.get(Calendar.MONTH) + 1) == 10 || 
               (cal.get(Calendar.MONTH) - 11) == 12) {
               art(1); // print art
               for (int a = 1; a < 15; a++) {
                  System.out.print("\t");
               } System.out.printf("%d%n", (cal.get(Calendar.MONTH) + 1));
            cal1((Calendar.MONTH) + 1, 2, dog); // print calendar 1
            // Print date
            System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1));
            System.out.println("Day: " + cal.get(Calendar.DATE));
            System.out.println("Is there anything else you would like to see?");
            prompt();
            } else if ((cal.get(Calendar.MONTH) + 1) == 4 || (cal.get(Calendar.MONTH) + 1) == 6 || 
               (cal.get(Calendar.MONTH) + 1) == 9 || (cal.get(Calendar.MONTH) + 1) == 11) {
               art(1); // print art
               for (int a = 1; a < 15; a++) {
                  System.out.print("\t");
               } System.out.printf("%d%n", (cal.get(Calendar.MONTH) + 1));
               cal1((Calendar.MONTH) + 1, 2, dog); // print calendar 2
               // Print date
               System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1));
               System.out.println("Day: " + cal.get(Calendar.DATE));
               System.out.println("Is there anything else you would like to see?");
               prompt();
            } else if ((cal.get(Calendar.MONTH) + 1) == 2) {
               art(1); // print art
               for (int a = 1; a < 15; a++) {
                  System.out.print("\t");
               } System.out.printf("%d%n", (cal.get(Calendar.MONTH) + 1));
               cal1((Calendar.MONTH) + 1, 2, dog); // print calendar 3
               // Print date
               System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1));
               System.out.println("Day: " + cal.get(Calendar.DATE));
               System.out.println("Is there anything else you would like to see?");
               prompt();
            }
         } else if (e == 'q' || e == 'Q') { // QUIT
            System.out.println("Have a nice day!");
         
         } else if (e == 'a' || e == 'A') { // ART
            art(1);
            System.out.println("Is there anything else you would like to see?");
            prompt();
         
         } else { // DID NOT SELECT AN OPTION
            System.out.println("ERROR: please follow the instructions\n");
            prompt();
         } // end of if/else
      } // end of if/else char second letter
   } // end of prompt
   
   public static void eventArray(int month, int day, String evName) throws FileNotFoundException {
      Scanner input = new Scanner(System.in);
      // if month has 31 days *Jan, March, May, July, August, Oct, Dec
      if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || 
         month == 10 || month == 12) {
         int[][] event = new int [11][31];
         art(1); // print art
            for (int a = 1; a < 15; a++) {
               System.out.print("\t");
            } System.out.printf("%d%n", month);
            cal1(month, day, evName); // print calendar 1
            // Print date
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
            System.out.println();
            System.out.println("Is there anything else you would like to see?");
            System.out.println("\"back\" to go back to menu");
            System.out.println("\"next\" to display next month");
            System.out.println("\"prev\" to display previous month");
            System.out.println("\"quit\" to quit program");
            char e = input.next().charAt(0);
            
            if (e == 'n') {
               if (month == 12) {
                  getDate(month - 11, day);
               } else if (month < 12) {
                  getDate(month + 1, day);
            }} else if (e == 'p') {
               if (month == 1) {
                  getDate(month + 11, day);
               } else {
                  getDate(month - 1, day);
            }} else if (e == 'q') { 
               System.out.println("Have a nice day!");
            } else {
               prompt();
            } // end of if/else
               
      // if month has 30 days
      } else if (month == 4 || month == 6 || month == 9 || month == 11) {
         int[][] event = new int[11][30];
         art(1); // print art
            for (int a = 1; a < 15; a++) {
               System.out.print("\t");
            } System.out.printf("%d%n", month);
            cal1(month, day, evName); // print calendar 1
            // Print date
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
            System.out.println();
            System.out.println("Is there anything else you would like to see?");
            System.out.println("\"back\" to go back to menu");
            System.out.println("\"next\" to display next month");
            System.out.println("\"prev\" to display previous month");
            System.out.println("\"quit\" to quit program");
            char e = input.next().charAt(0);
            
            if (e == 'n') {
               if (month == 12) {
                  getDate(month - 11, day);
               } else if (month < 12) {
                  getDate(month + 1, day);
            }} else if (e == 'p') {
               if (month == 1) {
                  getDate(month + 11, day);
               } else {
                  getDate(month - 1, day);
            }} else if (e == 'q') { 
               System.out.println("Have a nice day!");
            } else {
               prompt();
            } // end of if/else
               
      // if February
      } else if (month == 2) {
         int[][] event = new int [11][29];
         art(1); // print art
            for (int a = 1; a < 15; a++) {
               System.out.print("\t");
            } System.out.printf("%d%n", month);
            cal1(month, day, evName); // print calendar 1
            // Print date
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
            System.out.println();
            System.out.println("Is there anything else you would like to see?");
            System.out.println("\"back\" to go back to menu");
            System.out.println("\"next\" to display next month");
            System.out.println("\"prev\" to display previous month");
            System.out.println("\"quit\" to quit program");
            char e = input.next().charAt(0);
         
            if (e == 'n') {
               if (month == 12) {
                  getDate(month - 11, day);
               } else if (month < 12) {
                  getDate(month + 1, day);
            }} else if (e == 'p') {
               if (month == 1) {
                  getDate(month + 11, day);
               } else {
                  getDate(month - 1, day);
            }} else if (e == 'q') { 
               System.out.println("Have a nice day!");
            } else {
               prompt();
            } // end of if/else

         } else { // DID NOT SELECT AN OPTION
            System.out.println("ERROR: please follow the instructions\n");
            prompt();
      } // end of if/else
      
   } // end of eventArray
   
   public static void getDate(int month, int day) throws FileNotFoundException {
      Scanner input = new Scanner(System.in);
      String dog = "dog";
         if (month == 1 || month == 2 || month == 3 || month == 4 || 
         month == 5 || month == 6 || month == 7 || month == 8 || 
         month == 9 || month == 10 || month == 11 || month == 12) {
            art(1); // print art
            for (int a = 1; a < 15; a++) {
               System.out.print("\t");
            } System.out.printf("%d%n", month);
            cal1(month, 2, dog); // print calendar 1
            // Print date
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
            System.out.println();
         } else {
            System.out.println("Error: must enter a month 1-12, try again\n");
            prompt();
         } // end of nested if/else
         System.out.println("Is there anything else you would like to see?");
         System.out.println("\"back\" to go back to menu");
         System.out.println("\"next\" to display next month");
         System.out.println("\"prev\" to display previous month");
         System.out.println("\"quit\" to quit program");
         char e = input.next().charAt(0);
         
         if (e == 'n') {
            if (month == 12) {
               getDate(month - 11, day);
            } else if (month < 12) {
               getDate(month + 1, day);
         }} else if (e == 'p') {
            if (month == 1) {
               getDate(month + 11, day);
            } else {
               getDate(month - 1, day);
         }} else if (e == 'q') { 
            System.out.println("Have a nice day!");
         } else {
            prompt();
         } // end of if/else
   } // end of getDate
   
   public static void art(int p) {
      // ART FOR 2021
      System.out.println("\t 22222222 \t\t\t\t    0000 \t\t\t\t\t 22222222 \t\t\t\t\t 11111");
      System.out.println("\t22     222 \t\t\t\t   00  00 \t\t\t\t\t22     222 \t\t\t\t\t11  11");
      System.out.println("\t2     222 \t\t\t\t  00    00 \t\t\t\t\t2     222 \t\t\t\t\t1   11");
      System.out.println("\t     222 \t\t\t\t 00      00\t\t\t\t\t     222 \t\t\t\t\t    11");
      System.out.println("\t    222 \t\t\t\t   00        00\t\t\t\t\t 222 \t\t\t\t\t       11");
      System.out.println("\t   222 \t\t\t\t    00      00\t\t\t\t\t   222 \t\t\t\t\t       11");
      System.out.println("\t  222 \t\t\t\t     00    00\t\t\t\t\t  222 \t\t\t\t\t       11");
      System.out.println("\t 222 \t\t\t\t         00  00 \t\t\t\t\t 222 \t\t\t\t\t          11");
      System.out.println("\t2222222222 \t\t\t\t    0000 \t\t\t\t\t2222222222 \t\t\t\t\t111111111");
      System.out.println();
   } // end of art
   
   public static void cal1(int month, int day, String evName) {
      // for months: 3 March
      //input scanner and initialize reused variables
      Scanner input = new Scanner(System.in);
      int e = 1;
      int d = 1;
      int f;
      int g;
      
      // day names
      System.out.println("\tSunday\t  Monday\t\t  Tuesday\t Wednesday\t  Thursday\t   Friday\t  Saturday");
      // beginning week 1 border 
      for (d = 1; d < 85; d++) { 
         System.out.print("=");
      } System.out.println();      
      // calendar dates
      // express location of 1st of month
      if (month == 8) { // Sunday
      for (f = 1; f < 8; f++) { 
         System.out.printf("|\t\t\t%d ", f);
      } 
      } else if (month == 2 || month == 3 || month == 11) { // Monday
      System.out.print("|\t\t\t  ");
      for (f = 1; f < 7; f++) { 
         System.out.printf("|\t\t\t%d ", f);
      }
      } else if (month == 6) { // Tuesday
      for (int h = 1; h < 3; h++) {
         System.out.print("|\t\t\t  ");
      } for (f = 1; f < 6; f++) { 
         System.out.printf("|\t\t\t%d ", f);
      }
      } else if (month == 9 || month == 12) { // Wednesday
      for (int h = 1; h < 4; h++) {
         System.out.print("|\t\t\t  ");
      } for (f = 1; f < 5; f++) { 
         System.out.printf("|\t\t\t%d ", f);
      }
      } else if (month == 4 || month == 7) { // Thursday
      for (int h = 1; h < 5; h++) {
         System.out.print("|\t\t\t  ");
      } for (f = 1; f < 4; f++) { 
         System.out.printf("|\t\t\t%d ", f);
      }
      } else if (month == 1 || month == 10) { // Friday
      for (int h = 1; h < 6; h++) {
         System.out.print("|\t\t\t  ");
      } for (f = 1; f < 3; f++) { 
         System.out.printf("|\t\t\t%d ", f);
      }
      } else if (month == 5) { // Saturday
      for (int h = 1; h < 7; h++) {
         System.out.print("|\t\t\t  ");
      } for (f = 1; f < 2; f++) { 
         System.out.printf("|\t\t\t%d ", f);
      }
      }  System.out.print("|\n"); 
      // sides of border
      if (evName == "dog") {
         for (e = 1; e < 9; e++) { 
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
      } /* implementing events/holidays */       
      else {
         if (day == 1 && month == 1) { // new years
         System.out.print("|");
         for (e = 1; e < 6; e++) { 
            System.out.print("\t\t\t  |");
         } System.out.print(" " + evName);
         for (int w = 1; w < (11 - evName.length()); w++) {
            System.out.print(" ");
         } System.out.print("|\t\t\t  |");
         System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         } // end of New Year's
         
         else if (day == 3 && month == 9) { // labor day
         System.out.print("|");
         for (e = 1; e < 6; e++) { 
            System.out.print("\t\t\t  |");
         } System.out.print(" " + evName);
         for (int w = 1; w < (11 - evName.length()); w++) {
            System.out.print(" ");
         } System.out.print("|\t\t\t  |");
         System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         } // end of labor day
         
         else {
         for (e = 1; e < 9; e++) { 
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         }
         
         } // end of events first week
      // closing first week border
      
      for (d = 1; d < 85; d++) { 
         System.out.print("=");
      } System.out.println();
      
      // open week 2
      // dates continued
      if (month == 8) { // Sunday
      for (g = 8; g < 10; g++) { 
         System.out.printf("|\t\t\t%d ", g);
      } for (int h = 10; h < 15; h++) {
         System.out.printf("|\t\t\t%d", h); 
      } 
      } else if (month == 2 || month == 3 || month == 11) { // Monday
      for (g = 7; g < 10; g++) { 
         System.out.printf("|\t\t\t%d ", g);
      } for (int h = 10; h < 14; h++) {
         System.out.printf("|\t\t\t%d", h);
      }
      } else if (month == 6) { //Tuesday
      for (g = 6; g < 10; g++) { 
         System.out.printf("|\t\t\t%d ", g);
      } for (int h = 10; h < 13; h++) {
         System.out.printf("|\t\t\t%d", h);
      }
      } else if (month == 9 || month == 12) { // Wednesday
      for (g = 5; g < 10; g++) { 
         System.out.printf("|\t\t\t%d ", g);
      } for (int h = 10; h < 12; h++) {
         System.out.printf("|\t\t\t%d", h);
      }
      } else if (month == 4 || month == 7) { // Thursday
      for (g = 4; g < 10; g++) { 
         System.out.printf("|\t\t\t%d ", g);
      } for (int h = 10; h < 11; h++) {
         System.out.printf("|\t\t\t%d", h);
      }
      } else if (month == 1 || month == 10) { // Friday
      for (g = 3; g < 10; g++) { 
         System.out.printf("|\t\t\t%d ", g);
      }
      } else if (month == 5) { // Saturday
      for (g = 2; g < 9; g++) { 
         System.out.printf("|\t\t\t%d ", g);
      }
      } System.out.print("|\n");
      
      // border sides
      if (evName == "dog") {
      for (e = 1; e < 9; e++) { 
         System.out.print("|\t\t\t  ");
      } System.out.println();
      for (e = 1; e < 9; e++) {
         System.out.print("|\t\t\t  ");
      } System.out.println();
      for (e = 1; e < 9; e++) {
         System.out.print("|\t\t\t  ");
      } System.out.println();
      for (e = 1; e < 9; e++) {
         System.out.print("|\t\t\t  ");
      } System.out.println();
      
      } else {
         if (day == 4 && month == 7) { // independence day
         System.out.print("|");
         System.out.print(" " + evName);
         for (int w = 1; w < (10 - evName.length()); w++) {
            System.out.print(" ");
         } System.out.print("|");
         for (e = 1; e < 6; e++) { 
            System.out.print("\t\t\t  |");
         }
         System.out.print("\t\t\t  |");
         System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         } // end of independence day
         else if (day == 8 && month == 10) { // colombus day
         System.out.print("|");
         for (e = 1; e < 6; e++) { 
            System.out.print("\t\t\t  |");
         } System.out.print(" " + evName);
         for (int w = 1; w < (11 - evName.length()); w++) {
            System.out.print(" ");
         } System.out.print("|\t\t\t  |");
         System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         } // end of colombus day
         
         else if (day == 12 && month == 11) { // veterans day
         System.out.print("|");
         for (e = 1; e < 6; e++) { 
            System.out.print("\t\t\t  |");
         } System.out.print(" " + evName);
         for (int w = 1; w < (11 - evName.length()); w++) {
            System.out.print(" ");
         } System.out.print("|\t\t\t  |");
         System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         } // end of veterans day
         
         else {
         for (e = 1; e < 9; e++) { 
         System.out.print("|\t\t\t  ");
      } System.out.println();
      for (e = 1; e < 9; e++) {
         System.out.print("|\t\t\t  ");
      } System.out.println();
      for (e = 1; e < 9; e++) {
         System.out.print("|\t\t\t  ");
      } System.out.println();
      for (e = 1; e < 9; e++) {
         System.out.print("|\t\t\t  ");
      } System.out.println();
      } // end of if/else
      
      } // end of events week 2
      
      // closing week 2
      for (d = 1; d < 85; d++) { 
         System.out.print("=");
      } System.out.println();
      
      // open week 3
      // dates continued
      if (month == 8) { // Sunday
      for (int i = 15; i < 22; i++) { 
         System.out.printf("|\t\t\t%d", i);
      }  
      } else if (month == 2 || month == 3 || month == 11) { // Monday
      for (int i = 14; i < 21; i++) { 
         System.out.printf("|\t\t\t%d", i);
      }
      } else if (month == 6) { //Tuesday
      for (int i = 13; i < 20; i++) { 
         System.out.printf("|\t\t\t%d", i);
      }
      } else if (month == 9 || month == 12) { // Wednesday
      for (int i = 12; i < 19; i++) { 
         System.out.printf("|\t\t\t%d", i);
      }
      } else if (month == 4 || month == 7) { // Thursday
      for (int i = 11; i < 18; i++) { 
         System.out.printf("|\t\t\t%d", i);
      }
      } else if (month == 1 || month == 10) { // Friday
      for (int i = 10; i < 17; i++) { 
         System.out.printf("|\t\t\t%d", i);
      }
      } else if (month == 5) { // Saturday
      g = 9;
      System.out.printf("|\t\t\t%d ", g);
      for (int h = 10; h < 16; h++) {
         System.out.printf("|\t\t\t%d", h);
      }
      } System.out.print("|\n");
      // border sides
      if (evName == "dog") {
      for (e = 1; e < 9; e++) { 
         System.out.print("|\t\t\t  ");
      } System.out.println();
      for (e = 1; e < 9; e++) {
         System.out.print("|\t\t\t  ");
      } System.out.println();
      for (e = 1; e < 9; e++) {
         System.out.print("|\t\t\t  ");
      } System.out.println();
      for (e = 1; e < 9; e++) {
         System.out.print("|\t\t\t  ");
      } System.out.println();
      
      } else {
         if (day == 15 && month == 1) { // MLK
         System.out.print("|");
         for (e = 1; e < 6; e++) { 
            System.out.print("\t\t\t  |");
         } System.out.print(" " + evName);
         for (int w = 1; w < (11 - evName.length()); w++) {
            System.out.print(" ");
         } System.out.print("|\t\t\t  |");
         System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         // end of mlk
         
         } // president's day
         else if (day == 19 && month == 2) { 
         System.out.print("|");
         for (e = 1; e < 6; e++) { 
            System.out.print("\t\t\t  |");
         } System.out.print(" " + evName);
         for (int w = 1; w < (11 - evName.length()); w++) {
            System.out.print(" ");
         } System.out.print("|\t\t\t  |");
         System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         
         } // end president's day
         else {
         for (e = 1; e < 9; e++) { 
         System.out.print("|\t\t\t  ");
      } System.out.println();
      for (e = 1; e < 9; e++) {
         System.out.print("|\t\t\t  ");
      } System.out.println();
      for (e = 1; e < 9; e++) {
         System.out.print("|\t\t\t  ");
      } System.out.println();
      for (e = 1; e < 9; e++) {
         System.out.print("|\t\t\t  ");
      } System.out.println();
      } // end of if else
      } // end of events week 3
         
      // closing week 3
      for (d = 1; d < 85; d++) { 
         System.out.print("=");
      } System.out.println();
      
      // open week 4
      // dates continued  
     if (month == 8) { // Sunday
      for (int j = 22; j < 29; j++) { 
         System.out.printf("|\t\t\t%d", j);
      }  
      } else if (month == 2 || month == 3 || month == 11) { // Monday
      for (int j = 21; j < 28; j++) { 
         System.out.printf("|\t\t\t%d", j);
      }
      } else if (month == 6) { //Tuesday
      for (int j = 20; j < 27; j++) { 
         System.out.printf("|\t\t\t%d", j);
      }
      } else if (month == 9 || month == 12) { // Wednesday
      for (int j = 19; j < 26; j++) { 
         System.out.printf("|\t\t\t%d", j);
      }
      } else if (month == 4 || month == 7) { // Thursday
      for (int j = 18; j < 25; j++) { 
         System.out.printf("|\t\t\t%d", j);
      }
      } else if (month == 1 || month == 10) { // Friday
      for (int j = 17; j < 24; j++) { 
         System.out.printf("|\t\t\t%d", j);
      }
      } else if (month == 5) { // Saturday
      for (int j = 16; j < 23; j++) { 
         System.out.printf("|\t\t\t%d", j);
      }
     } System.out.print("|\n"); 
      // border sides
      if (evName == "dog") {
     for (e = 1; e < 9; e++) { 
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     
     } else {
      if (day == 22 && month == 11) { // Thanksgiving
         System.out.print("|");
         System.out.print("\t\t\t  |");
         System.out.print(" " + evName);
         for (int w = 1; w < (11 - evName.length()); w++) {
            System.out.print(" ");
         } System.out.print("|");
         for (e = 1; e < 6; e++) { 
            System.out.print("\t\t\t  |");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         
         } // Christmas
         else if (day == 25 && month == 12) { 
         System.out.print("|");
         for (e = 1; e < 7; e++) { 
            System.out.print("\t\t\t  |");
         } System.out.print(" " + evName);
         for (int w = 1; w < (11 - evName.length()); w++) {
            System.out.print(" ");
         } System.out.print("|");
         System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         
         } // end of christmas
         else {
         for (e = 1; e < 9; e++) { 
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     } // end of if/else
         } // end events week 4
         
     // closing week 4
     for (d = 1; d < 85; d++) { 
        System.out.print("=");
     } System.out.println();
     
     // final open week 5 
     // dates continued
     if (month == 1 || month == 10) { // Jan, Oct
     for (int k = 24; k < 31; k++) { 
         System.out.printf("|\t\t\t%d", k);  
      } System.out.print("|\n"); 
     } else if (month == 2) { // February
     int k = 28;
         System.out.printf("|\t\t\t%d", k);  
      for (f = 1; f < 7; f++)
         System.out.print("|\t\t\t  ");
      System.out.print("|\n");
     } else if (month == 3) {
     for (int k = 28; k < 32; k++) { 
         System.out.printf("|\t\t\t%d", k);  
     } for (int k = 1; k < 4; k++) {
         System.out.print("|\t\t\t  ");
      } System.out.print("|\n");
     } else if (month == 4) {
     for (int k = 25; k < 31; k++) { 
         System.out.printf("|\t\t\t%d", k);  
     } System.out.print("|\t\t\t  ");
      System.out.print("|\n");
     } else if (month == 5) {
     for (int k = 23; k < 30; k++) { 
         System.out.printf("|\t\t\t%d", k);  
     } System.out.print("|\n");
     } else if (month == 6) {
     for (int k = 27; k < 31; k++) { 
         System.out.printf("|\t\t\t%d", k);  
     } for (int k = 1; k < 4; k++) {
         System.out.print("|\t\t\t  ");
      } System.out.print("|\n");
     } else if (month == 7) {
     for (int k = 25; k < 32; k++) { 
         System.out.printf("|\t\t\t%d", k);  
      } System.out.print("|\n");
     } else if (month == 8) {
     for (int k = 29; k < 32; k++) { 
         System.out.printf("|\t\t\t%d", k);  
     } for (int k = 1; k < 5; k++) {
         System.out.print("|\t\t\t  ");
      } System.out.print("|\n");
     } else if (month == 9) {
     for (int k = 26; k < 31; k++) { 
         System.out.printf("|\t\t\t%d", k);  
     } System.out.print("|\t\t\t  ");
     System.out.print("|\t\t\t  ");
      System.out.print("|\n");
     } else if (month == 11) {
     for (int k = 28; k < 31; k++) { 
         System.out.printf("|\t\t\t%d", k);  
     } for (int k = 1; k < 5; k++) {
         System.out.print("|\t\t\t  ");
      } System.out.print("|\n");
     } else if (month == 12) {
     for (int k = 26; k < 32; k++) { 
         System.out.printf("|\t\t\t%d", k);  
     } System.out.print("|\t\t\t  ");
      System.out.print("|\n");
     }
      // border sides
      if (evName == "dog") {
     for (e = 1; e < 9; e++) { 
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     
     } else {
      if (day == 28 && month == 5) { // memorial day
         System.out.print("|");
         for (e = 1; e < 6; e++) { 
            System.out.print("\t\t\t  |");
         } System.out.print(" " + evName);
         for (int w = 1; w < (11 - evName.length()); w++) {
            System.out.print(" ");
         } System.out.print("|\t\t\t  |");
         System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         for (e = 1; e < 9; e++) {
            System.out.print("|\t\t\t  ");
         } System.out.println();
         
         } else {
         for (e = 1; e < 9; e++) { 
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
         }
         }
         
     // closing week 5
     for (d = 1; d < 85; d++) { 
        System.out.print("=");
     } System.out.println(); 
     
     // weeks 6, Jan, May, Oct
     if (month == 1 || month == 10) {
     int k = 31;
      System.out.printf("|\t\t\t%d", k);
     for (int h = 1; h < 7; h++) {
      System.out.print("|\t\t\t  ");
     } System.out.print("|\n");
     for (e = 1; e < 9; e++) { 
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     // closing week 6
     for (d = 1; d < 85; d++) { 
        System.out.print("=");
     } System.out.println();
     
     } else if (month == 5) {
     for (int k = 31; k < 33; k++) {
      System.out.printf("|\t\t\t%d", k);
     } for (int k = 1; k < 6; k++) {
      System.out.print("|\t\t\t  ");
     } System.out.print("|\n");
     for (e = 1; e < 9; e++) { 
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     for (e = 1; e < 9; e++) {
        System.out.print("|\t\t\t  ");
     } System.out.println();
     // closing week 6
     for (d = 1; d < 85; d++) { 
        System.out.print("=");
     } System.out.println();
     }
   } // closing Cal1
   
} // end of COCalendar class  