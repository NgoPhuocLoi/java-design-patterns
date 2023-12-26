package creational_patterns.abstract_factory;

public class NetworkResponse implements Response {

    @Override
    public String getResponse() {
        return "Network Response";
    }

}
