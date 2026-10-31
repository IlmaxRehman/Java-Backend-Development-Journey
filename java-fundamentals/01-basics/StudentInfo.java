public class StudentInfo {
    public static void main(String[] args) {
        //primitive data types
        int age = 21;
        char grade = 'A';
        double cgpa = 8.5;
        boolean isEnrolled = true;

        //referance type
        String name = "Akshat bewakoof";

        //widening conversion 

        int marks = 62;
        double convertedMarks = marks;

        //narrowing conversion 
        double percentage = 33.3;
        int wholePercentage = (int) percentage;

        //display info

         System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + grade);
        System.out.println("Enrolled: " + isEnrolled);

        System.out.println("Converted Marks: " + convertedMarks);
        System.out.println("Whole Percentage: " + wholePercentage);


    }
}