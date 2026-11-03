class Student{
    int age;
}


public class PassByValuePractice {

    static void changeNumber(int num){
        num = 50;
    }

    static void studentAge(Student s){
        
        s.age = 24;
    }

    public static void main(String[] args){
        int number = 10;
        changeNumber(number);
        System.out.println(number);

        Student student = new Student();

        student.age = 25;
        studentAge(student);
        System.out.println(student.age);
    }
    
}
