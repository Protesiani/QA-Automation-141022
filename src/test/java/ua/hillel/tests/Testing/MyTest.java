package ua.hillel.tests.Testing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyTest {
    @Test(dataProvider = "userData", groups = "login")
    public void dataTest(String userName, String pass, String role) {
        System.out.println("users: " + userName + ", " + pass + ", " +  role);
    }
    @DataProvider(name = "userData")
    public Object [][] userDataProvider(){
        Object[][] result = {
                {"Alex", "123", "admin"},
                {"Den", "567", "user"},
                {"Gary", "789", "guest"}
        };
        return result;
    }
    @Test(dataProvider = "userData", groups = "login")
    public void failTest(String userName, String pass, String role){
        System.out.println("users: " + userName + ", " + pass + ", " +  role);
        if(userName.equals("Den")){
            Assert.assertEquals(userName, "Gary ", "name value is incorrect");
        }
    }
    @Test(groups = "login")
    @Parameters({"userName", "pass", "role"})
    public void paramTest(String userName, String pass, String role){
        System.out.println("users: " + userName + ", " + pass + ", " +  role);
    }
}

