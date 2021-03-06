package patterns.singleton;

/**
 * Singleton design pattern implementation.
 */
public class Database {

    private static Database instance;

    /**
     * Function creates instance if 
     * the class was not instantiated,
     * acts as a entry point to a Database class.
     * 
     * @return Instance of class.
     */
    public static Database getInstance() {
        if (Database.instance == null) {
            Database.instance = new Database();
        }

        return Database.instance;
    }

    /**
     * This function is written just
     * for testing purpose.
     * 
     * @return "Tamerlan Satualdypov" string.
     */
    public String getUser() {
        return "Tamerlan Satualdypov";
    }

    private Database() { }
}