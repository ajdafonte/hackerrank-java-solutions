package pt.caires.hackerrank.datastructures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//You are given a list of student information: ID, FirstName, and CGPA.
//    Your task is to rearrange them according to their CGPA in decreasing order.
//    - If two student have the same CGPA, then arrange them according to their first name in alphabetical order.
//    - If those two students also have the same first name, then order them according to their ID.
//    - No two students have the same ID.
class Student {

    private final int id;
    private final String fname;
    private final double cgpa;

    Student(final int id, final String fname, final double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    int getId() {
        return id;
    }

    String getFname() {
        return fname;
    }

    double getCgpa() {
        return cgpa;
    }

}


public class JavaSort {

    static final Comparator<Student> STUDENT_COMPARATOR = (student1, student2) -> {
        int compareByCgpa = Double.compare(student2.getCgpa(), student1.getCgpa());
        if (compareByCgpa == 0) {
            int compareByFirstName = student1.getFname().compareTo(student2.getFname());
            if (compareByFirstName == 0) {
                return Integer.compare(student1.getId(), student2.getId());
            } else {
                return compareByFirstName;
            }
        }
        return compareByCgpa;
    };

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        final List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            final int id = in.nextInt();
            final String fname = in.next();
            final double cgpa = in.nextDouble();

            final Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort(STUDENT_COMPARATOR);

        for (final Student st : studentList) {
            System.out.println(st.getFname());
        }
    }

}

