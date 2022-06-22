import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GradingSystem {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader scan =new BufferedReader(r);

        // Student's subjects
        String[] subjects = {"Intermediate Programming", "Data Communications And Networking 1", "Discrete Math", "Ethics", "Rizal", "Physical Education", "Science, Technology and Science", "NSTP"};

        int students = 50; // declare and init the number of students

        int[][] grade = new int[subjects.length][students]; // two-dimensional array grade (contains subject and the student)
        int[] average = new int[students]; // Average of the student
        int[] gradeSum = new int[students]; //Sum of the grade of the student
        String[] remarks = new String[students]; //Remarks of the student (Pass, or Failed)
        String name;	// Name of the student
        String course; // Course of the student

        // Loop the block with the number using the declared students
        for (int student = 0; student < students; student++) {
            System.out.println("Enter Student name: ");
            name = scan.readLine();

            System.out.println("Enter Course: ");
            course = scan.readLine();

            // Loop using the number of subjects (or 9 times)
            for (int i = 0; i < subjects.length; i++) {

                System.out.println("Enter student grade in " + subjects[i] + ": ");
                grade[i][student] = Integer.parseInt(scan.readLine()); // Get the grade of the student in that subject
                gradeSum[student] += grade[i][student]; // Sum of the grades of the student
                average[student] = gradeSum[student] / subjects.length; // Calculate student's average

                switch (average[student]){
                    case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100:
                        remarks[student] = "Excellent";
                        break;
                    case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89:
                        remarks[student] = "Very Good";
                        break;
                    case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69:
                        remarks[student] = "Fair";
                        break;
                    case 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59:
                        remarks[student] = "Pass";
                        break;
                    default:
                        remarks[student] = "Failed";
                }
            }
            // Output the student name
            System.out.println("Student Name: " + name);
            //Output the student's course
            System.out.println("Student Course: "+ course);
            // Output student's final grade
            System.out.println("Final Grade: "+ average[student]);
            // Output the student's remarks
            System.out.println("Remarks: " + remarks[student] + "\n\n\n");
        }
    }
}
