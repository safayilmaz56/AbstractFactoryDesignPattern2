public abstract class DatabseFactory { //abstract factory
    public abstract Connection createConnection();
    public abstract Command createCommand();
}
