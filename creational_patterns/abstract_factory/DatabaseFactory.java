package creational_patterns.abstract_factory;

public class DatabaseFactory implements DataSourceAbstractFactory {

    @Override
    public Service getService() {
        return new DatabaseService();
    }

    @Override
    public Response getResponse() {
        return new DatabaseResponse();
    }

}
