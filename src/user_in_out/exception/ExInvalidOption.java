package user_in_out.exception;

public class ExInvalidOption extends Exception {
    public ExInvalidOption() { super("[Exception] No such option!"); }
    public ExInvalidOption(String msg) { super(msg); }
}