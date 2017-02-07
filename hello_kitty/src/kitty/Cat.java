/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitty;

/**
 *
 * @author oyas
 */
public class Cat implements Comparable<Cat> {   
    
    private String name;
    private String color;
    private int age;
    public static final int NUMBER_OF_FEET = 4;

    public Cat(String name, String color, int age) throws AgeUnderZeroException {
        setAge(age);
        this.name=name;
        this.color = color;
        
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public void setColor(String color) {
        this.color = color;
    }*/

    public void setAge(int age) throws AgeUnderZeroException {
        if(age < 0) {
        throw new AgeUnderZeroException("The age should be bigger than 0");
        }else{
            this.age=age;
        }
    }

    public void sayMeow() {
        System.out.println("Meow, my name is " + getName());
        printHowManyEyes();
    }
    
    public String toString() {
        return "The cat " + getName() + " has " + getColor() + 
               " color and " + getAge() + " years old.";
    }
    
    public void printHowManyEyes(){
        System.out.print("Two ");
    }

    @Override
    public int compareTo(Cat t) {
        return Integer.compare(this.getAge(),t.getAge());
    }

}
