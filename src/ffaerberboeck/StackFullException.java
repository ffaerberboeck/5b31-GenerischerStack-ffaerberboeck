package ffaerberboeck;

/**
 * Diese Klasse wird verwendet wenn der Stack voll ist
 * @author Finn Faerberboeck
 * @version 2021-05-01
 */
public class StackFullException extends Exception{
    public StackFullException() {
        super("VOLLER STACK!");
    }
}