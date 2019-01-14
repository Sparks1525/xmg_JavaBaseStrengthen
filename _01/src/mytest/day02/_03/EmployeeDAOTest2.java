package mytest.day02._03;

import org.junit.*;


public class EmployeeDAOTest2 {

    @BeforeClass
    public static void staticInit() throws Exception{
        System.out.println("静态初始化");
    }

    @AfterClass
    public static void staticDestory() throws Exception{
        System.out.println("静态销毁操作....");
    }

    @Before
    public void init() throws Exception{
        System.out.println("初始化....");
    }

    @After
    public void destory() throws Exception{
        System.out.println("销毁操作....");
    }

    @org.junit.Test
    public void testSave() throws Exception{
        System.out.println("EmployeeDAOTest.testSave()");
    }

    @Test
    public void testDelete() throws Exception{
        System.out.println("EmployeeDAOTest.testDelete()");
    }

}
