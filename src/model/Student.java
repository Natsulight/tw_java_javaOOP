package model;

public class Student {

    private String idNo;

    private String names;

    private int age;

    private String gender;

    public Student() {
    }

    public Student(String idNo, String names, int age, String gender) {
        this.idNo = idNo;
        this.names = names;
        this.age = age;
        this.gender = gender;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
