package testngassignment;

import org.testng.annotations.Test;
public class TestClass2 {
    @Test (priority = 2)
    public void newtest1() {
        System.out.println("Test case 1 of class 2");
    }
    @Test (groups = {"group1"}, priority = 4)
    public void newtest2() {
        System.out.println("Test case 2 of class 2");
    }
    @Test (priority = 3)
    public void newtest3() {
        System.out.println("Test case 3 of class 2");
    }
}
