import org.testng.annotations.*;

public class demo {
    @Test(groups = "smoke")
    public void openChrome() {
        System.out.println("Test Method");
    }
    @Test(groups = "sanity")
    public void setUp() {
        System.out.println("Second Test Method");
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
