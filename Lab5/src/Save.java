import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Save {
    public void save(Catalog catalog , String filename)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(filename+".txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(catalog);
            out.flush();
            fos.close();
        }

        catch(IOException ex)
        {
            System.out.println(ex);
        }
    }
}
