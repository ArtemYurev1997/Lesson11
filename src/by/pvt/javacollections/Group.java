package by.pvt.javacollections;

import java.util.*;

public class Group {
    private int number;
    private List<Students> studentsList = new ArrayList<>();

    public Group(int number) {
        this.number = number;

    }

    public void addStudents(Students student) {
        studentsList.add(student);
    }

    public void removeStudents(Students student) {
        if(studentsList.contains(student)) {
            if(student.getAverageMark() < 4) {
                studentsList.remove(student);
            }
            else {
                System.out.println("Error");
            }
        }
    }

    public int countStudents() {
        return studentsList.size();
    }

    public double averageMarkOfGroup() {
        double a = 0;
        double sum = 0;
        for (Students students : getStudentsList()) {
            sum += students.getAverageMark();
            a = sum / countStudents();
        }
        return a;
    }

   public void collectionUp(Students o1, Students o2, Students o3) {
        List<Students> students = Arrays.asList(o1, o2, o3);
        Collections.sort(students, new Students.ComparatorByAvgMark());
        System.out.println(students);
    }
    public void collectionDown(Students o1, Students o2, Students o3) {
        List<Students> students = Arrays.asList(o1, o2, o3);
        Collections.sort(students, new Students.ComparatorByAvgMark().reversed());
        System.out.println(students);
    }


    @Override
    public String toString() {
        return "Group{" +
                "number=" + number +
                ", studentsList=" + studentsList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return number == group.number && Objects.equals(studentsList, group.studentsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, studentsList);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }
}
