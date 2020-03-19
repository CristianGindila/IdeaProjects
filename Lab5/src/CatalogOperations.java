import java.io.*;

public class CatalogOperations{
    public void save(Catalog catalog , String filename)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(filename);
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
    public void view(String filaname)
    {

    }
}
