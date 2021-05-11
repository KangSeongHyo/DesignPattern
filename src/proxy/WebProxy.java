package proxy;

public class WebProxy implements Web{

    private Web web;

    @Override
    public synchronized void access(RequestType requestType) {
        if(RequestType.STATIC == requestType){
            System.out.println("CSS, JS, Static HTML 응답");
        }else {
            if(web == null) {
                web = new WebService();
            }
            this.web.access(requestType);
        }
    }

}
