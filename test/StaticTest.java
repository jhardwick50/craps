
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class StaticTest {
    @Test
    public void test(){
       TestClass one = new TestClass();
       TestClass two = new TestClass();
       
       one.setInstanceVariable("bill");
       two.setInstanceVariable("jason");
       
       String oneName = one.getInstanceVariable();
       System.out.println(oneName);
       System.out.println(one.getInstanceVariable());
       
       
       System.out.println(two.getInstanceVariable());
       
       TestClass.setStaticVariable("bill");
       TestClass.setStaticVariable("jason");
       
       System.out.println(TestClass.getStaticVariable());
       
       TestClass.someThing();
       TestClass.someThing = "";
    }
    
    
}
