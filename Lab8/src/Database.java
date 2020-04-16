import java.sql.*;
public class Database {

    private static Database database = null;

    public Connection getConn() {
        return conn;
    }

    public void closeConnection() {
        try {
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }



    private Connection conn;
    public static Database getInstance()
    {
        if (database == null)
            database = new Database();

        return database;
    }

    private Database()
    {
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicalbums","dba","sql");
            conn=myConn;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
