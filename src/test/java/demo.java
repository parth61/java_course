import org.testng.Assert;
import org.testng.annotations.*;

//@Test
public class demo {
    @Test(groups = "smoke", priority = 2)
    public void openChrome() {
        System.out.println("Open Chrome Test Method");
    }
    @Test(priority = 1)
    void setUp() {
        System.out.println("Set Up Test Method");
    }

    @Test
    public void assertMethod(){
        Assert.assertEquals(true, true, "Incorrect");
        System.out.println("Assert Method ");
        Assert.assertFalse(false, "False Assert");
        System.out.println("False Assert");
        Assert.assertTrue(true, "True Assert");
        System.out.println("True Assert");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass");
    }

    @AfterGroups(groups = "sanity")
    public void afterGroups(){
        System.out.println("AfterGroups");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }
    @BeforeGroups(groups = "smoke")
    public void beforeGroups(){
        System.out.println("BeforeGroups");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }
}
