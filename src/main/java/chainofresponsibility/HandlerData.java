package chainofresponsibility;

public class HandlerData<Request, Response> {

    private Request request;
    private Response response;

    public HandlerData(Request request) {
        this.request = request;
    }

    public Request getRequest() {
        return request;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
