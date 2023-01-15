public class Creater {
    DatabseFactory databseFactory;
    Connection connection;
    Command command;
    public String state = "Open";

    public Creater(DatabseFactory databseFactory) {
        this.databseFactory = databseFactory;
        connection = databseFactory.createConnection();
        command = databseFactory.createCommand();
    }

    private void start(){
        if (state.contentEquals("Open")){
            connection.connect();
            command.execute("Select * from ...");
            connection.disConnect();
        }
    }
}
