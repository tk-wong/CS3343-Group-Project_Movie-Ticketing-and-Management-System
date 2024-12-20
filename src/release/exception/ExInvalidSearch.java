package release.exception;

public class ExInvalidSearch extends Exception {
    public ExInvalidSearch() { super("[Exception] Invalid search text! It should contain 1 to 12 characters."); }
    public ExInvalidSearch(String msg) { super("[Exception] " + msg); }
}
