package creational_patterns.abstract_factory;

public class Client {
    private Service service;
    private Response response;

    public Client(DataSourceAbstractFactory dataSourceAbstractFactory) {
        this.service = dataSourceAbstractFactory.getService();
        this.response = dataSourceAbstractFactory.getResponse();
    }

    public void communicate() {
        if (this.service == null || this.response == null)
            return;
        System.out.println(this.service.getService());
        System.out.println(this.response.getResponse());
    }
}
