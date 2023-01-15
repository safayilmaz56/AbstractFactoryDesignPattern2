public class SqlDatabse extends DatabseFactory{
    @Override
    public Connection createConnection() {
        return new SqlConnection();
    }

    @Override
    public Command createCommand() {
        return new SqlCommand();
    }
}
