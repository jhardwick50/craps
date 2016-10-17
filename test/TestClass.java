/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class TestClass {
    private String instanceVariable;
    
    private static String staticVariable;
    
    public static String someThing;

    public static String getStaticVariable() {
        return staticVariable;
    }

    public static void setStaticVariable(String staticVariable) {
        TestClass.staticVariable = staticVariable;
    }

    public String getInstanceVariable() {
        return instanceVariable;
    }

    public void setInstanceVariable(String instanceVariable) {
        this.instanceVariable = instanceVariable;
    }
    
    public static void someThing(){
        System.out.println("did something");
    }
}
