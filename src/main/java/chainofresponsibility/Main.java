package chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        HandlerOne<HandlerData<Object, Object>> handlerOne = new HandlerOne<>();
        HandlerTwo<HandlerData<Object, Object>> handlerTwo = new HandlerTwo<>();
        HandlerThree<HandlerData<Object, Object>> handlerThree = new HandlerThree<>();
        handlerOne.setNext(handlerTwo);
        handlerTwo.setNext(handlerThree);
        handlerOne.handle(new HandlerData<Object, Object>(new Object()));
        handlerOne.handleByAnyOne(new HandlerData<Object, Object>(new Object()));
    }

}
