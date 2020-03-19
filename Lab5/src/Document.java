import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

public class Document implements Serializable{
    String path;
    String link;
    int id;
    HashMap <String,String> data=new HashMap<>();

    public HashMap<String, String> getData() {
        return data;
    }

    public String getHashData()//return data from hashmap named data
    {   String str="";
        for (String name: data.keySet()){
            String key = name;
            String value = data.get(name);
            str=str + key + " " + value;
        }
        return str;
    }

    public String getActualData() throws IOException { //get data from the link or path
        if(path=="")
        {
            URL url = new URL(link);

            URLConnection con = url.openConnection();
            InputStream is =con.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String line = null;
            line = br.readLine();

            return line;
        }
        else
        {
                String data = null;
                try
                {   URL path = Document.class.getResource(this.path);
                    File file = new File(path.getFile());
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    data = br.readLine();
                    return data;
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                    return data;
                }
        }
    }

    public void setData(HashMap<String, String> data) {
        this.data = data;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    Document(String path,String link, int id , String title , String autor , String year)//initializarea uiui document
    {this.path=path;
    this.link=link;
    this.id=id;
    data.put("Titlu",title);
    data.put("Autor",autor);
    data.put("An",year);
    }

    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        if (path=="")
        {
            try {
                return "Link "+ link + " ID " + id + " data " + getData() + " Continut " + getActualData() ;
            } catch (IOException e) {
                System.out.println(e);
                return "Failed";
            }
        }
        else
        {
            try {
                return " Path "+ path + " ID " + id + " data " + getData() + " Continut " + getActualData() ;
            } catch (IOException e) {
                System.out.println(e);
                return "Failed";
            }
        }
    }

}
