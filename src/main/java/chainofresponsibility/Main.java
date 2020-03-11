package chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        HandlerOne<Request> handlerOne = new HandlerOne<>();
        HandlerTwo<Request> handlerTwo = new HandlerTwo<>();
        HandlerThree<Request> handlerThree = new HandlerThree<>();
        handlerOne.setNext(handlerTwo);
        handlerTwo.setNext(handlerThree);
        handlerOne.handle(new Request());
        handlerOne.handleByAnyOne(new Request());
    }

}
