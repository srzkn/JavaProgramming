package day42_exceptions;


class FadyException extends RuntimeException{

public FadyException(){
    super("Time for a short break");
}

public FadyException(String message){
    super(message);
}

}
public class CustomExceptions {

    public static void main(String[] args) {

        throw  new FadyException("it's time to sleep");
    }
}
