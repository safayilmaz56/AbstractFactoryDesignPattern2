public class SqlConnection extends Connection{
    @Override
    public boolean connect() {
        System.out.println("SqlConnection baglantisi kuruluyor");
        return true;
    }

    @Override
    public boolean disConnect() {
        System.out.println("SqlConnection baglantisi kesiliyor");
        return true;
    }


    //public String state = "Open";
}
