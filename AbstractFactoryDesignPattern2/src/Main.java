public class Main {
    public static void main(String[] args) {
        Creater creater = new Creater(new SqlDatabse());
        System.out.println("**********");
        creater = new Creater(new MySqlDatabase());
    }
}