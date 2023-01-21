import org.testng.annotations.*;

public class AnnotationExecutionFlow {
    @Test
public void testing(){
    System.out.println("This method is Test method");
}
    @BeforeTest
    public void beforeTest(){
        System.out.println("This method is before Test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("This method is after Test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("This method is before Class");
    }
    @AfterClass
    public void afterClass (){
        System.out.println("This method is after Class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This method is before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("This method is after method");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This method is before Suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("This method is after Suite");
    }
    @BeforeGroups
    public void beforeGroup(){
        System.out.println("This method is before Group");
    }
    @AfterGroups
    public void afterGroup(){
        System.out.println(" This method is after Group");
    }
}
