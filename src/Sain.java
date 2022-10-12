import java.util.ArrayList;

public class Sain {
    public static void main(String [] args){
        //PROBLEMS task1 - Student
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student student1 = new Student(1, "Berikkazy", "Madi", "Mukhitzhnauly", 12, 8, 2004, "Aiteke bi 176", "87021874596", "IT", 2, "F");
        Student student2 = new Student(2, "Kopbosyn", "Ulbosyn", "Kurmangazykyzy", 25,7,2003, "Kazybek bi 23", "87725487856", "Math", 2, "G");
        Student student3 = new Student(3, "Mendigereyeva", "Ayana", "Ibraykyzy", 16, 3, 2004, "Tole bi 66", "87024587891", "IT", 3, "E");
        Student student4 = new Student(4, "Nurdauletov", "Zhomart", "Alpamysuly", 18, 10, 2005, "Pushkin 154", "87056428404", "Math", 1, "H");
        Student student5 = new Student(5, "Seksenbaev", "Miras", "Mukhitovich", 25, 3, 2005, "Balasagun 55", "87056408505", "Economics", 1, "D");
        Student student6 = new Student(6, "Zhigitbekov", "Kurmet", "Omaruly", 1, 12, 2004, "Junisaliev 187", "87785785664", "Math", 2, "H");
        Student student7 = new Student(7, "Dauylbai", "Sanzhar", "Hamzauly", 19, 9, 2004, "Lomonosov 81", "87086020560", "Management", 3, "A");
        Student student8 = new Student(8, "Zhumankul", "Nuradil", "Zhurtuly", 23, 6, 2003, "Edikova 10", "87766770267", "Math", 3, "G");
        Student student9 = new Student(9, "Sovetaly", "Daniyar", "Armanuly", 9, 9, 2005, "Junisaliev 36", "87084569512", "IT", 4, "E");
        Student student10 = new Student(10, "Pupkin", "Washington", "Ryskeldievich", 28, 2, 2004, "Jackson 53", "87754561238", "Translator", 2, "B");
        Student student11 = new Student(11, "Nurmuhammed", "Samat", "Komekbayuly", 21, 11, 2005, "Kurmangazy 28", "87015483269", "Math", 1, "G");
        Student student12 = new Student(12, "Koldasbayev", "Sultan", "Almazovich", 29, 11, 2004, "Aitieva 167", "87777598215", "Management", 3, "A");
        Student student13 = new Student(13, "Mazhitova", "Aruzhan", "Alievna", 18, 12, 2004, "Dauylbay 132", "87051257863", "IT", 2, "F");
        Student student14 = new Student(14, "Alpysbaev", "Almaz", "Ikramuly", 28, 2, 2005, "Kyrykbayeva 48", "87718565665", "Economics", 1, "D");
        Student student15 = new Student(15, "Omarova", "Merei", "Kadambayevna", 6, 10, 2004, "Jungle 85", "87124565321", "Economics", 1, "D");
        Student student16 = new Student(16, "Suyundukova", "Asel", "Pashovna", 15, 5, 2005, "Safari 70", "87236554912", "Management", 3, "A");
        Student student17 = new Student(17, "Kozhakmetov", "Dauren", "Rustamuly", 25, 4, 2005, "Arystanbaev 3", "87562354129", "Translator", 4, "B");
        Student student18 = new Student(18, "Putin", "Aslan", "Samatuly", 17, 4, 2005, "Suhambaeva 37", "87095063645", "Math", 1, "H");
        Student student19 = new Student(19, "Zhusupov", "Nurzat", "Erikuly", 12, 7, 2003, "Konaeva 6", "87775869635", "Math", 3, "G");
        Student student20 = new Student(20, "Magomedov", "Nurasyl", "Gabituly", 27, 9, 2004, "Vandam 106", "87756458945", "IT", 3, "E");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);
        studentArrayList.add(student6);
        studentArrayList.add(student7);
        studentArrayList.add(student8);
        studentArrayList.add(student9);
        studentArrayList.add(student10);
        studentArrayList.add(student11);
        studentArrayList.add(student12);
        studentArrayList.add(student13);
        studentArrayList.add(student14);
        studentArrayList.add(student15);
        studentArrayList.add(student16);
        studentArrayList.add(student17);
        studentArrayList.add(student18);
        studentArrayList.add(student19);
        studentArrayList.add(student20);

        //IT Faculty Students
        for (Student s : studentArrayList){
            if (s.getFaculty().equals("IT")) {System.out.println("IT faculty students: " + s);}
        }

        //Faculties
         for (Student s : studentArrayList){
            if (s.getFaculty().equals("IT")) {System.out.println("IT faculty students: " + s);}
        }

        for (Student s : studentArrayList){
            if (s.getFaculty().equals("Math")) {System.out.println("Math faculty students: " + s);}
        }

        for (Student s : studentArrayList){
            if (s.getFaculty().equals("Management")) {System.out.println("Management faculty students: " + s);}
        }

        for (Student s : studentArrayList){
            if (s.getFaculty().equals("Translator")) {System.out.println("Translator faculty students: " + s);}
        }

        for (Student s : studentArrayList) {
            if (s.getFaculty().equals("Economics")) {System.out.println("Economics faculty students: " + s);}
        }


        //WHATcourse?
        for (Student s : studentArrayList){
            if (s.getCourse() == 1) {System.out.println("1 course students: " + s);}
        }

        for (Student s : studentArrayList){
            if (s.getCourse() == 2) {System.out.println("2 course students: " + s);}
        }

        for (Student s : studentArrayList){
            if (s.getCourse() == 3) {System.out.println("3 course students: " + s);}
        }

        for (Student s : studentArrayList){
            if (s.getCourse() == 4) {System.out.println("4 course students: " + s);}
        }

        //AFTER 2004
         for (Student s : studentArrayList){
            if (s.getYearOfBirth() > 2004) {System.out.println("students born after 2004 : " + s);}
        }

        //Print all
        for (Student s : studentArrayList){
            System.out.println(s);
        }
    }
}

class Student {
    int id;
    String surname;
    String name;
    String middleName;
    int dayOfBirth;
    int monthOfBirth;
    int yearOfBirth;
    String adress;
    String phoneNum;
    String faculty;
    int course;
    String group;

    public Student(int id, String surname, String name, String middleName, int dayOfBirth, int monthOfBirth, int yearOfBirth,
                   String adress, String phoneNum, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.adress = adress;
        this.phoneNum = phoneNum;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dateOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int dateOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int dateOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", yearOfBirth=" + yearOfBirth +
                ", adress='" + adress + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
