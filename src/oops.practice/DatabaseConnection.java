package oops.practice;
//Create a DatabaseConnection class following the Singleton pattern.
//instance variable will be static
//private constructor(eager initialization)
//public method to access
class DBDemo
{
    private static DBDemo instance;
    private DBDemo()
    {
        System.out.println("Private Constructor created");
    }
    public static DBDemo getInstance()
    {
        if(instance==null)
            instance = new DBDemo();
        return instance;
    }
    public void connect()
    {
        System.out.println("Connection to DB successful");
    }
    public void disconnect()
    {
        System.out.println("Disconnection from DB successful");
    }

}
public class DatabaseConnection {
    public static void main(String[] args)
    {
        //Get the singleton instance of DBDemo
        DBDemo db = DBDemo.getInstance();
        db.connect();
        //Try to get another instance
        DBDemo db2 = DBDemo.getInstance();
        db2.disconnect();
        System.out.println("Verify that db and db2 are same instances: " + (db==db2));
    }

}
