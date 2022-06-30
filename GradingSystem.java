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
                    case 90: 
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                        remarks[student] = "Excellent";
                        break;
                    
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 89:
                        remarks[student] = "Very Good";
                        break;
                        
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    
                 
                        remarks[student] = "Fair";
                        break;
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
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
