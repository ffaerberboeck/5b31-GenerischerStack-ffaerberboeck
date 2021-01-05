package ffaerberboeck;

/**
 * Diese Klasse wird verwendet wenn der Stack Leer ist
 * @author Finn Faerberboeck
 * @version 2021-05-01
 */
public class StackEmptyException extends Exception{
    public StackEmptyException() {
        super("LEERER STACK!");
    }
}