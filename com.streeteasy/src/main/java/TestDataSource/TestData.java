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

    @DataProvider
    public Object[][] getDataFromDatabase() throws SQLException {
        Object[][] data ;
        DataBaseutils dataBaseutils = new DataBaseutils();
        String server = "localhost";
        int portNumber = 3306;
        String database = "Guru99TestData";
        String usernam = "root";
        String password = "Silme123@";
        dataBaseutils.openConnection(server,portNumber,database, usernam, password);
        String sqlQuery = "SELECT * FROM Guru99TestData.Users;";
        data = dataBaseutils.executeSelectQuery(sqlQuery);
        dataBaseutils.closeConnection();
        return data;
    }
}
