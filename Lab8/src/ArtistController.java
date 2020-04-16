import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ArtistController {

    ArtistController(Connection con)
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


    public void create(String name, String country){
        try
        {
            String query = "INSERT INTO `musicalbums`.`artists` (`name`, `country`) VALUES (?, ?);";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString   (1, name);
            preparedStmt.setString(2, country);

            preparedStmt.executeUpdate();

        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
    public void findByName(String name){
        try {
            PreparedStatement statement =con.prepareStatement("SELECT * FROM musicalbums.artists where name = ?");
            statement.setString(1, name);
            ResultSet rs=statement.executeQuery();

            while (rs.next())
            {
                int id = rs.getInt("id");
                String thisName = rs.getString("name");
                String country = rs.getString("country");

                // print the results
                System.out.format("%s, %s, %s\n", id, thisName, country);
            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public ResultSet getData(){
        try {
            PreparedStatement statement =con.prepareStatement("SELECT * FROM musicalbums.artists");
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
