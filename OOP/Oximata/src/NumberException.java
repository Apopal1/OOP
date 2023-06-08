public class NumberException extends Exception{
    public NumberException(){
        super("This is not a valid position");
    };
    public NumberException(String message){
        System.out.println(message);
    };
}
