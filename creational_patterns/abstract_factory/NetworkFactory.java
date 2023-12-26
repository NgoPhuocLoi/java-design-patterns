package creational_patterns.abstract_factory;

public class NetworkFactory implements DataSourceAbstractFactory {

    @Override
    public Service getService() {
        return new NetworkService();
    }

    @Override
    public Response getResponse() {
        return new NetworkResponse();
    }

}
