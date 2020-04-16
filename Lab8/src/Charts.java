import java.sql.ResultSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Charts {
    LinkedList<HashMap<String,String>> list = new LinkedList<>();

    Charts(ResultSet rs)
    {try{ HashMap<String,String>data = new HashMap<String,String>();
        while (rs.next())
        {   data.clear();
            Integer id = rs.getInt("Id");
            String thisName = rs.getString("AlbumName");
            data.put("ID",Integer.toString(id));
            data.put("AlbumName", thisName);
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
