package creational_patterns.abstract_factory;

public interface DataSourceAbstractFactory {
    Service getService();

    Response getResponse();
}
