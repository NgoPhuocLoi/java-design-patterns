package creational_patterns.abstract_factory;

public class DatabaseService implements Service {

    @Override
    public String getService() {
        return "Database service";
    }

}
