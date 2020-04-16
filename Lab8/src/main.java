public class main {
    public static void main(String[] args)
    {
        Database x = Database.getInstance();
        ArtistController a=new ArtistController(x.getConn());
        //a.create("DOC3","Romania2");
        a.findByName("DOC2");
        AlbumController b=new AlbumController(x.getConn());
        //b.create("Scapati de sub control",1,2010);
        b.findByArtist(1);
        ChartController c=new ChartController(x.getConn());
       // c.create(("Scapati de sub control"));
        Charts d = new Charts(c.getData());
        System.out.println(d);
        Artists e=new Artists(a.getData());
        System.out.println(e);
        Albums f = new Albums(b.gatData());
        System.out.println(f);
        x.closeConnection();

    }
}
