package BasicJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Exe_057_FlightBooking {

    static String journeyDate;
    static flightBooking flightBooking;
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("---Welcome TO AIR INDIA---");
        System.out.println("Enter your Journey Date (mm/dd/yyy)-- ");

        journeyDate=  journeyDate(sc);
         flightBooking=new flightBooking(journeyDate);

        int ch;
        do{

            System.out.println("1. Please Book your Ticket");
            System.out.println("2. Please view Detils");
            System.out.println("Please Enter Your Choice");
            ch=sc.nextInt();
            sc.nextLine();

            switch (ch)
            {
                case 1:
                    bookTicket(sc);
                    break;

                case 2:
                    viewDetails();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }while (ch!=3);
    }

    private static void bookTicket(Scanner sc)
    {
        System.out.println("Do you want to book ticket for Adult or Child");
        System.out.println("For Adult press 'A' and for Child press 'C'--");
        String memnber = sc.nextLine();
        //sc.nextLine();

        if(memnber.equalsIgnoreCase("A"))
       {
           System.out.println("Please Enter Number OF Adult");
           int NumOfAdult=sc.nextInt();
           sc.nextLine();
           flightBooking.setNumOfAdult(NumOfAdult);
       } else if (memnber.equalsIgnoreCase("C")) {
           System.out.println("Please Enter Number Of Child");
           int NumOfChild=sc.nextInt();
           sc.nextLine();
           flightBooking.setNumOfChild(NumOfChild);

       }
       else {
           System.out.println("Invalid Selection");
       }
    }

    private static void viewDetails()
    {
       // flightBooking flightBooking=new flightBooking(journeyDate);
        flightBooking.displayDetails();

    }

    private static String journeyDate(Scanner sc)
    {
        String journeyDate=sc.nextLine();

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setLenient(false);
        try {
            Date date=simpleDateFormat.parse(journeyDate);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy");
        }


        return journeyDate;
    }
}

class flightBooking
{
    String journeyDate;
    int NumOfAdult;
    int NumOfChild;

    public flightBooking(String journeyDate) {
        this.journeyDate = journeyDate;
    }

    public flightBooking(String journeyDate, int numOfAdult, int numOfChild) {
        this.journeyDate = journeyDate;
        NumOfAdult = numOfAdult;
        NumOfChild = numOfChild;
    }

    public String getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(String journeyDate) {
        this.journeyDate = journeyDate;
    }

    public int getNumOfAdult() {
        return NumOfAdult;
    }

    public void setNumOfAdult(int numOfAdult) {
        NumOfAdult = numOfAdult;
    }

    public int getNumOfChild() {
        return NumOfChild;
    }

    public void setNumOfChild(int numOfChild) {
        NumOfChild = numOfChild;
    }

    void displayDetails()
    {
        System.out.println("Your Journey Date is== "+journeyDate);
        System.out.println("You have booked Tickets for "+NumOfAdult+" Adults");
        System.out.println("You have booked Tickets for "+NumOfChild+" Childs");
    }
}
