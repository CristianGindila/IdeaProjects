import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Load {
    public Catalog load(String filename)
    {

        try
        {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fis);
            Catalog catalog = (Catalog)in.readObject();
            fis.close();
            return catalog;
        }

        catch(IOException ex)
        {
            System.out.println(ex);
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println(ex);
        }
        Catalog object1 = null;
        return  object1;
    }
}
