package testngassignment;

import org.testng.annotations.Test;
public class TestClass1 {
    @Test (groups = {"group1"}, priority = 4)
    public void test1() {
        System.out.println("Test case 1 of class 1");
    }
    @Test (priority = 0)
    public void test2() {
        System.out.println("Test case 2 of class 1");
    }
    @Test (groups = {"group1"}, priority = 5)
    public void test3() {
        System.out.println("Test case 3 of class 1");
    }
}
