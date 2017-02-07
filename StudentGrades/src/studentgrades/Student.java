/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgrades;

/**
 *
 * @author oyas
 */
public abstract class Student implements Comparable<Student>{
    private String name;
    private int studentId;
    private int grade;
    
    public abstract double rankPoint();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", studentId=" + studentId + ", grade=" + grade + ", rankPoint=" + rankPoint()+'}';
    }
    
    
    
    
    
    
}
