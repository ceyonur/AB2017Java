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
public class VisualArtStudent extends Student {

    private final double DEPARTMENT_COEFFICIENT = 0.6;

    public VisualArtStudent(String name, int id, int grade) {
        setName(name);
        setStudentId(id);
        setGrade(grade);
    }

    @Override
    public double rankPoint() {
        return DEPARTMENT_COEFFICIENT * getGrade();

    }
    
     @Override
    public int compareTo(Student t) {
        /*if(this.rankPoint() > t.rankPoint()){
        return 1;
        }
        else if(this.rankPoint() < t.rankPoint()){
            return -1;
        }
        else{
            return 0;
        }*/
        return Double.compare(this.rankPoint(), t.rankPoint());
    }
}
