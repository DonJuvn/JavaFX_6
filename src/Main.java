import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Main {
    public static void main(String[] args){

        //COPYPAST
        /*
//        Student student = new Student("Arman", 19, "87548754875", 95);
//        System.out.println(student.getName());

//        System.out.println("old info: "+student);
//
//        student.setName("Aspan");
//        student.setAge(20);
//        student.setPhoneNumber("87546532");
//        student.setGrade(83);
//        System.out.println(student);

//        ArrayList<Student> studentArrayList = new ArrayList<>();
//        Student student1 = new Student("Arman", 18, "87548754875", 95);
//        Student student2 = new Student("Aiaru", 18, "87549625458", 56);
//        Student student3 = new Student("Nurzhan", 17, "87235694245", 78);
//
//        studentArrayList.add(student1);
//        studentArrayList.add(student2);
//        studentArrayList.add(student3);
//        System.out.println("old list: " + studentArrayList);

//        System.out.println(studentArrayList.get(0));

        //print with for
//        for (Student s: studentArrayList){
//            System.out.println(s);
//        }
//        Collections.sort(studentArrayList, new SortByAge());
//        System.out.println("Sorted by age(min-max): " + studentArrayList);
//
//        Collections.sort(studentArrayList, new SortByGrade());
//        System.out.println("Sorted by grade(min-max): " + studentArrayList);

//        Student s = getStudentByAge(studentArrayList, 18);
//        System.out.println(s);*/

        //GETSTUDENTBYAGE - COPYPAST
        /*    public static Student getStudentByAge(ArrayList<Student> list, int age){
        Student res = null;
        for (Student s: list){
            if(s.getAge() == age){
                res = s;
            }
        }
        return res;
    }*/




        //myExample - businessmen
        /*ArrayList<Businessman> businessmenArrayList = new ArrayList<>();
        Businessman businessman1 = new Businessman("Bernard Arnault", "141000000000$", "Paris", 43);
        Businessman businessman2 = new Businessman("Warren Buffett", "98000000000$", "Nebraska", 42);
        Businessman businessman3 = new Businessman("Elon Musk", "242000000000$", "Texas", 42);
        Businessman businessman4 = new Businessman("Gautam Adani", "125000000000$", "Gurgaon", 40);
        Businessman businessman5 = new Businessman("Bill Gates", "111000000000$", "Washington", 41);
        Businessman businessman6 = new Businessman("Jeff Bezos", "144000000000$", "Washington", 39);

        businessmenArrayList.add(businessman1);
        businessmenArrayList.add(businessman2);
        businessmenArrayList.add(businessman3);
        businessmenArrayList.add(businessman4);
        businessmenArrayList.add(businessman5);
        businessmenArrayList.add(businessman6);

        for (Businessman s: businessmenArrayList){
            System.out.println(s);
        }*/

    }
}

//COPYPAST Students
/*class Student{
    String name;
    int age;
    String phoneNumber;
    int grade;

    public Student(String name, int age, String phoneNumber, int grade){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", grade=" + grade +
                '}';
    }
}*/

//COPYPAST Sorting
/*
class SortByAge implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() == o2.getAge())
            return 0;
        if (o1.getAge() > o2.getAge())
            return 1;
        else
            return -1;
    }
}
class SortByGrade implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGrade() == o2.getGrade())
            return 0;
        if (o1.getGrade() > o2.getGrade())
            return 1;
        else
            return -1;
    }
}
class SortByName implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
    }
}
*/



//Businessmen
/*//class Businessman{
//
//    String name;
//    String wealth;
//    String homeTown;
//    int shoesSize;
//
//    public Businessman(String name, String wealth, String homeTown, int shoesSize){
//        this.name = name;
//        this.wealth = wealth;
//        this.homeTown = homeTown;
//        this.shoesSize = shoesSize;
//    }
//
//    public String getWealth() {
//        return wealth;
//    }
//
//    public void setWealth(String wealth) {
//        this.wealth = wealth;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getHomeTown() {
//        return homeTown;
//    }
//
//    public void setHomeTown(String homeTown) {
//        this.homeTown = homeTown;
//    }
//
//    public int getShoesSize() {
//        return shoesSize;
//    }
//
//    public void setShoesSize(int shoesSize) {
//        this.shoesSize = shoesSize;
//    }
//
//    @Override
//    public String toString() {
//        return "Businessman{" +
//                "name=" + name +
//                ", wealth='" + wealth + '\'' +
//                ", homeTown='" + homeTown + '\'' +
//                ", shoesSize=" + shoesSize +
//                '}';
//    }
//}*/















