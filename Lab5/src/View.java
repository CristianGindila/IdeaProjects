import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class View {
     public void view(String filename)
    {
        try
        {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fis);
            Catalog catalog = (Catalog)in.readObject();
            fis.close();
            catalog.print();
        }

        catch(IOException ex)
        {
            System.out.println(ex);
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println(ex);
        }
    }
}
