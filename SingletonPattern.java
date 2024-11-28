public class SingletonPattern {
// Singleton Class
static class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Database Connection created");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to the database.");
    }
}


    public static void main(String[] args) {
        // Get the single instance 
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.connect();

        // Try to get another instance
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        connection2.connect();

    }




    
}
