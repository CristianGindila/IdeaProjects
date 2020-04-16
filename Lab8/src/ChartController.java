import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ChartController {
    ChartController(Connection con)
    {
        this.con=con;
    }
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    Connection con;

    public void create(String name){
        try
        {
            String query = "INSERT INTO `musicalbums`.`charts` (`AlbumName`) VALUES (?);";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString   (1, name);

            preparedStmt.executeUpdate();

        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    public ResultSet getData(){
        try {
            PreparedStatement statement =con.prepareStatement("SELECT * FROM musicalbums.charts order by AlbumName asc");
            ResultSet rs=statement.executeQuery();

            return rs;

        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
