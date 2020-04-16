import java.sql.ResultSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Albums {
    LinkedList<HashMap<String,String>> list = new LinkedList<>();

    Albums(ResultSet rs)
    {try{ HashMap<String,String>data = new HashMap<String,String>();
        while (rs.next())
        {   data.clear();
            Integer id = rs.getInt("id");
            String thisName = rs.getString("name");
            Integer artist_id= rs.getInt("artist_id");
            Integer year= rs.getInt("release_year");
            data.put("ID",Integer.toString(id));
            data.put("Name", thisName);
            data.put("Artist ID", Integer.toString(artist_id));
            data.put("Year",Integer.toString(year));
            list.add(data);
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }

    @Override
    public String toString() {
        StringBuilder s= new StringBuilder();
        for (HashMap<String,String>index:list)
        {
            for (Map.Entry<String, String> entry : index.entrySet()) {
                s.append(entry.getKey()).append(" = ").append(entry.getValue()).append(" ");
            }
        }

        return s.toString();
    }
}
