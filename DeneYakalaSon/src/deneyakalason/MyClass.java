/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneyakalason;

/**
 *
 * @author oyas
 */
public class MyClass {

    private int myVariable;

    public MyClass(int myVariable) throws MyException {
        setMyVariable(myVariable);
    }

    public int getMyVariable() {
        return myVariable;
    }

    public void setMyVariable(int myVariable) throws MyException {
        if(myVariable < 0){
            throw new MyException("0'dan küçük");
        }
        else{
        this.myVariable = myVariable;
        }
    }

}
