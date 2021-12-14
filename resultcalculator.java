package com.company;
import java.util.Scanner;
// result calputer percentage
public class java06practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your subject 1 number out of 100 :");
        int  sub1= sc.nextInt();
        if (sub1<33) {
            System.out.println("failed in subject 1");
        }
        else if(sub1>=33) {
                System.out.println("Passed in subject 1");
            }
        else{
                System.out.println("failed");
            }

        System.out.print("Enter your subject 2 number out of 100:" );
        int sub2 = sc.nextInt();
        if (sub2<33) {
            System.out.println("failed in subject 2");
        }
        else if(sub2>=33) {
            System.out.println("Passed in subject 2");
        }
        else{
            System.out.println("failed");
        }

        System.out.print("Enter your subject 3 number out of 100:");
        int sub3= sc.nextInt();
        if (sub3<33) {
            System.out.println("failed in subject 3");
        }
        else if(sub3>=33) {
            System.out.println("Passed in subject 3");
        }
        else{
            System.out.println("failed");
        }

        System.out.print("Enter your subject 4 number out of 100:");
        int sub4= sc.nextInt();
        if (sub4<33) {
            System.out.println("failed in subject 4");
        }
        else if(sub4>=33) {
            System.out.println("Passed in subject 4");
        }
        else{
            System.out.println("failed");
        }

        System.out.print(" Enter your subject 5 number out of 100:");
        int sub5= sc.nextInt();
        if (sub5<33) {
            System.out.println("failed in subject 5");
        }
        else if(sub5>=33) {
            System.out.println("Passed in subject 5");
        }
        else{
            System.out.println("failed");
        }

        //NOW CALCULATING ALL MARKS

        int sum= sub1 + sub2 +sub3 +sub4+ sub5;
        System.out.println("Your total marks out of 500 is : " + sum );

        //pass or not
        if(sum>=160){
            System.out.println("You have passed");
        }
        else {
            System.out.println("try again you are fail");
        }
        // calculating percentage
        int per = sum /5;

        System.out.println("Your percentage is : " + per + "%");

    }
}
