package com.software_development.lesson4;

public class Student {

    public static void main(String[] args) {
        Student [] students = new Student[10];
        students[0] = new Student("Mordas", 5, new int[]{7, 6, 8, 7, 9});
        students[1] = new Student("Petrikevich", 4, new int[]{10, 10, 10, 10,10});
        students[2] = new Student("Watson", 10, new int[]{7, 6, 8, 7, 9});
        students[3] = new Student("Davidson", 3, new int[]{10, 9, 9, 9, 9});
        students[4] = new Student("Esenin", 1, new int[]{7, 10, 8, 7, 9});
        students[5] = new Student("Onegin", 4, new int[]{7, 6, 8, 7, 9});
        students[6] = new Student("Stalin", 7, new int[]{7, 6, 8, 7, 9});
        students[7] = new Student("Lermontov", 8, new int[]{7, 6, 10, 7, 9});
        students[8] = new Student("Pushkin", 3, new int[]{7, 6, 8, 10, 9});
        students[9] = new Student("Krey", 1, new int[]{7, 6, 10, 7, 9});

        showExcellentStudent(students);
    }

    private String surname;
    private int groupNumber;
    private int [] grade;

    private Student(String surname, int groupNumber, int [] grade){
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    private static void showExcellentStudent(Student[] students){
        for (Student student : students){
            int minGrade = 10;
            for (int grades : student.grade) {
                if (grades < minGrade) {
                    minGrade = grades;
                }
            }
                if (minGrade >= 9){
                    System.out.println("Smart student: " + student.surname + " Group: " + student.groupNumber);
                }
        }
    }

}
