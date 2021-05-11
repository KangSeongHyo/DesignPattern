package proxy;

public class WebService implements Web{
    @Override
    public void access(RequestType requestType) {
        if(RequestType.RESTAPI == requestType){
            System.out.println("JSON 응답");
        }
        if(RequestType.VIEW == requestType){
            System.out.println("View 응답");
        }
    }
}
