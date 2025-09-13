package BasicJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exe056_Map {

    private static Map<Integer,MyStudent> myStudentMap=new HashMap<>();
    public static void main(String[] args) {

       // Map map=new HashMap();

       // map.put(1,"Mukesh");
       // map.put(2,"Dhage");

        //System.out.println(map);

        Scanner sc = new Scanner(System.in);


        int ch;
        do {

            System.out.println("1. Create new student");
            System.out.println("2. Display Student Details");
            System.out.println("Enter your choice--");
            ch=sc.nextInt();

            switch (ch)
            {
                case 1:
                    createStudent(sc);
                    break;
                case 2:
                    displayStudentDetails(sc);
                    break;

                default:
                    System.out.println("Invalid choice!");


            }

        }while (ch!=3);
            sc.close();
    }

    private static void createStudent(Scanner sc)
    {
        System.out.println("Enter Roll No-");
        int RollNo;
        RollNo=sc.nextInt();
        sc.nextLine();
        if(myStudentMap.containsKey(RollNo))
        {
            System.out.println("Roll No already exist. Please enter another!!!");
            return;
        }
        String StudentName;
        System.out.println("Enter Student Name");
        StudentName=sc.nextLine();

        MyStudent mystudent=new MyStudent(RollNo,StudentName);
        myStudentMap.put(RollNo,mystudent);
        System.out.println("New Student Record Created Successfully !!!");
    }

    private static void displayStudentDetails(Scanner sc)
    {
        System.out.println("Enter Roll No--");
        int RollNo=sc.nextInt();

        MyStudent myStudent=myStudentMap.get(RollNo);
        if(myStudent==null)
        {
            System.out.println("Record Not Found!!!");
            return;
        }

        myStudent.display();
    }
}

class MyStudent
{
    int rollNo;
    String name;

    public  MyStudent(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void display()
    {
        System.out.println("Student Roll No== "+ rollNo);
        System.out.println("Student Name== "+name);
    }


}