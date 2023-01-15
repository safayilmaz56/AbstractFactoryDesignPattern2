public class MySqlDatabase extends DatabseFactory{
    @Override
    public Connection createConnection() {
        return new MySqlConnection();
    }

    @Override
    public Command createCommand() {
        return new MySqlCommand();
    }
}
