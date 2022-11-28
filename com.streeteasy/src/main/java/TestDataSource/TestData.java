package TestDataSource;

import base.BasePage;
import org.testng.annotations.DataProvider;

import java.sql.SQLException;

public class TestData extends BasePage {


    @DataProvider
    public Object [][] getData()
    {
        Object[][] data = new Object[3][2]; //  it will test 3 times, and 2 is for 2 data will need, username and password.

        data[0][0]= "mngr456301";
        data[0][1]= "YdytYha";

        data[1][0]= "mngr456301";
        data[1][1]= "YdytYha";

        data[2][0]= "mngr456301";
        data[2][1]= "YdytYha";
        return data;
    }



    // Data Retrive from Mysql
    @DataProvider
    public Object[][] datafromDatabase() throws SQLException
    {
        String sqlQuery = "SELECT * FROM Guru99TestData.Users;";
        Object[][] data = db.executeSelectQueryForDataSet(sqlQuery);
        return  data;
    }


    //Data Retrive from Excell

    @DataProvider
    public Object[][] dataFromExcell()
    {
        String [][] data;
        data = excel.readStringArrays("Sheet1");
        return data;
    }

}
