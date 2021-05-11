package proxy;

public class Main {
    public static void main(String[] args) {
        WebProxy webProxy = new WebProxy();
        webProxy.access(RequestType.STATIC);
        webProxy.access(RequestType.RESTAPI);
    }
}
