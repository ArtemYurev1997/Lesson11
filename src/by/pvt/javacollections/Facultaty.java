package by.pvt.javacollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Facultaty {
    private String nameFaculty;
    private List<Group> listOfGroup = new ArrayList<>();
    private IsActive isNotActive;

    public Facultaty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public void addGroup(Group group) {
        listOfGroup.add(group);
    }


    @Override
    public String toString() {
        return "Facultaty{" +
                "nameFaculty='" + nameFaculty + '\'' +
                ", listOfGroup=" + listOfGroup +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facultaty facultaty = (Facultaty) o;
        return Objects.equals(nameFaculty, facultaty.nameFaculty) && Objects.equals(listOfGroup, facultaty.listOfGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFaculty, listOfGroup);
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public List<Group> getListOfGroup() {
        return listOfGroup;
    }

    public void setListOfGroup(List<Group> listOfGroup) {
        this.listOfGroup = listOfGroup;
    }

    public void isNotActive() {
        for (Group group : getListOfGroup()) {
            if (group.countStudents() < 20) {
                System.out.println(IsActive.NOTACTIVE);
            }
            else {
                System.out.println(IsActive.ACTIVE);
            }
        }
    }

    public void transferStudents(Group oldGroup, Group newGroup){
        for (Group group : getListOfGroup()) {
            if (group.countStudents() < 2) {
                newGroup.getStudentsList().addAll(oldGroup.getStudentsList());
                getListOfGroup().remove(oldGroup);
            }
        }
       System.out.println(newGroup);
    }

}
