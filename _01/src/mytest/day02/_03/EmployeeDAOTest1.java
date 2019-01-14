package mytest.day02._03;

import junit.framework.TestCase;

public class EmployeeDAOTest1 extends TestCase {

    @Override
    protected void setUp() throws Exception {
        System.out.println("初始化...");
    }

    @Override
    protected void tearDown() throws Exception {
        System.out.println("销毁...");
    }

    public void testSave() throws Exception{
        System.out.println("EmployeeDAOTest1.testSave()");
    }

    public void testDelete() throws Exception{
        System.out.println("EmployeeDAOTest1.testDelete");
    }
}
