package structural_patterns.facade;

public class NetworkAccessFacade {
    private Communication comm = new Communication();
    private Cache cache = new Cache();
    private Convertor convertor = new Convertor();
    private Interceptor interceptor = new Interceptor();

    public void access() {
        cache.cache();
        comm.communicate();
        interceptor.log();
        convertor.convert();
    }
}
