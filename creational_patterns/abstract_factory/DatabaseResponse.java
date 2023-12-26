package creational_patterns.abstract_factory;

public class DatabaseResponse implements Response {

    @Override
    public String getResponse() {
        return "Database reponse";
    }

}
