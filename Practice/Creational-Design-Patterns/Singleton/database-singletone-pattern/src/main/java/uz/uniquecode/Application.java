package uz.uniquecode;

/**
 * Author: Abbos Fayziboev
 * Date: 04/04/23
 * Email: abbosFayziboev@gmail.com
 */
public class Application {

    public void doSomeQuery(String query){
        //Connecting to db
        DatabaseConnector connector = DatabaseConnector.getInstance();
        System.out.println("Application " + this.hashCode() +" is calling database objects....");
        // do query
        connector.doQuery(query);
    }
}
