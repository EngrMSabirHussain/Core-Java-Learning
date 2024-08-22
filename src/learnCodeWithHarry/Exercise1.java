package learnCodeWithHarry;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    /*
    Write a program to calculate percentage of a given student in CBSE board exam.
    Marks from 5 subjects must be taken as input from the keyboard.(marks are out of 100)
    plus point: write dynamic code that run in all cases
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        int totalSubject =0;
        while (!flag) {
            try {
                System.out.print("How many subject in you Exam: ");
                totalSubject = input.nextInt();
                flag = true;
            }catch (Exception e){
                System.out.println("Please enter valid input\n\n");
                input.next();
            }
            float marksSum = takeInputFromUser(totalSubject);
            float parcentage = (marksSum/(totalSubject*100))*100;
            System.out.println("Result Percentage: "+parcentage+"%");
        }
    }
    public static float takeInputFromUser(int value){
        boolean flag = false;
        float sum =0;
        Scanner input = new Scanner(System.in);
        ArrayList<Float> marks = new ArrayList<>();
        for(int i=0;i<value;i++){
            flag = false;
            while (!flag) {
                try {
                    System.out.print("Subject "+(i+1)+": ");
                    float subjectMark = input.nextFloat();
                    if(subjectMark >= 0 && subjectMark <= 100){
                        marks.add(subjectMark);
                        sum+=subjectMark;
                        flag = true;
                    }else {
                        System.out.println("Subject Marks not valid");
                        flag = false;
                    }
                }catch (Exception e){
                    System.out.println("Please enter valid input\n\n");
                    flag = false;
                    input.next();
                }
            }
        }
        System.out.println("Subject Marks: "+marks);
        return sum;
    }
}