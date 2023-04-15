package by.pvt.javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    Students vasya = new Students("Vasya", "Fomin", "21.03.1998", "Minsk", 8.6);
    Students ivan = new Students("Ivan", "Gromov", "05.05.1999", "Grodno", 8.4);
    Students alexei = new Students("Alexei", "Minin", "29.01.1998", "Mogilev", 3.7);

    Group group1 = new Group(1);
    group1.addStudents(vasya);
        System.out.println(group1);
    Group group2 = new Group(2);
    group2.addStudents(vasya);
    group2.addStudents(ivan);
    group2.addStudents(alexei);
    group2.addStudents(ivan);
        System.out.println(group2);
       System.out.println("*******************************");

    Facultaty facultaty = new Facultaty("Physical");
    facultaty.addGroup(group1);
    facultaty.addGroup(group2);
    System.out.println(facultaty);
    System.out.println("*****************");

        System.out.println(group1.averageMarkOfGroup());
        System.out.println(group2.averageMarkOfGroup());
        System.out.println("*****************");
        group1.collectionUp(vasya, ivan, alexei);
        group1.collectionDown(vasya, ivan, alexei);
        System.out.println("*****************");
        facultaty.transferStudents(group1, group2);
        System.out.println("*****************");
        System.out.println(group2.countStudents());
        System.out.println("*****************");
        facultaty.isNotActive();
        System.out.println("*****************");
        group2.removeStudents(alexei);
        group2.removeStudents(vasya);
        group2.removeStudents(ivan);
        System.out.println(group2);
        System.out.println("*****************");

    }
}
