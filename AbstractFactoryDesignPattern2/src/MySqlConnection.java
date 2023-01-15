public class MySqlConnection extends Connection{
    @Override
    public boolean connect() {
        System.out.println("MySqlConnection baglantisi kuruluyor");
        return true;
    }

    @Override
    public boolean disConnect() {
        System.out.println("MySqlConnection baglantisi kesiliyor");
        return true;
    }

    //public String state = "Open";
    }
