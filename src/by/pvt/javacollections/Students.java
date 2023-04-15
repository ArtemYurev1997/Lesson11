package by.pvt.javacollections;

import java.util.Objects;
import java.util.Comparator;

public class Students implements Comparable<Students> {
    private String name;
    private String surname;
    private String birthday;
    private String city;
    private double averageMark;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Double.compare(students.averageMark, averageMark) == 0 &&  Objects.equals(name, students.name) && Objects.equals(surname, students.surname) && Objects.equals(birthday, students.birthday) && Objects.equals(city, students.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthday, city, averageMark);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", city='" + city + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }





    public Students(String name, String surname, String birthday, String city, double averageMark) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.city = city;
        this.averageMark = averageMark;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }


    @Override
    public int compareTo(Students o) {
        return getName().compareTo(o.getName());
    }

    static class ComparatorByAvgMark implements Comparator<Students> {

        @Override
        public int compare(Students o1, Students o2) {
            return  Double.compare(o1.getAverageMark(), o2.getAverageMark());
        }
    }
}

