package uz.uniquecode;

/**
 * Author: Abbos Fayziboev
 * Date: 04/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class DatabaseConnector {
    private static DatabaseConnector instance;

    private DatabaseConnector() {
    }

    public static DatabaseConnector getInstance() {
        if (instance == null)
            instance = new DatabaseConnector();
        return instance;
    }

    public void doQuery(String query){
        System.out.println("Object " + this.hashCode() + " is doing query!");
        System.out.println("Query : " + query);
        System.out.println();
    }
}
