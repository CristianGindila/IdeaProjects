import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AlbumController {
    AlbumController(Connection con)
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


    public void create(String name, int artistId, int releaseYear){

        try
        {

            String query = "INSERT INTO `musicalbums`.`albums` (`name`, `artist_id`,`release_year`) VALUES (?, ?, ?);";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString   (1, name);
            preparedStmt.setInt(2, artistId);
            preparedStmt.setInt(3, releaseYear);

            preparedStmt.executeUpdate();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }
    public void findByArtist(int artistId){
        try {
            PreparedStatement statement =con.prepareStatement("SELECT * FROM musicalbums.albums where artist_id = ?");
            statement.setInt(1, artistId);
            ResultSet rs=statement.executeQuery();

            while (rs.next())
            {   int id = rs.getInt("id");
                String thisName = rs.getString("name");
                int artistid = rs.getInt("artist_id");
                int year = rs.getInt("release_year");

                // print the results
                System.out.format("%s, %s,  ,%s,%s\n", id, thisName,artistid, year);
            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public ResultSet gatData(){
        try {
            PreparedStatement statement =con.prepareStatement("SELECT * FROM musicalbums.albums");
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
