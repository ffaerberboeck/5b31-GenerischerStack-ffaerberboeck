package ffaerberboeck;
import java.util.ArrayList;

/**
 * Diese Klasse formt einen Stack !! WICHTIG: Statt den Array Rückgabetypen könnte man auch String verwenden dennoch habe ich <Array> verwendet, da ich glaube das wir das in den nächsten Übungen weiterverwenden.
 * @param <Array> Der zu formende Datentyp
 * @author Finn Faerberboeck
 * @version 2021-05-01
 */
public class Stack <Array>{
    private ArrayList<Array> al;
    private int li = -1;
    private int length;

    /**
     * Standart Konstruktor
     */
    public Stack() {
        this.al = new ArrayList<Array>();
        this.length = 3;
    }

    /**
     * Konstruktor mit Parametern
     * @param length        Die Länge der Liste
     */
    public Stack(int length) {
        this.al = new ArrayList<Array>();
        this.length = length;
    }

    /**
     * In dieser Methode wird der letzte Eintrag gelöscht und der neue letzte Eintrag returned !! WICHTIG: Hier hätte ich auch to String machen können
     * @return              Der neue letzte Eintrag
     */
    public Array popal() throws StackEmptyException, StackFullException{
        if(li < 0) {
            throw new StackEmptyException();
        }
        if(this.li == this.length) {
            throw new StackFullException();
        }else {
            al.remove(this.li);
            li--;
            return this.al.get(li);
        }
    }

    /**
     * In dieser Methode wird auf den aktuellen Indedx ein Eintrag ins Array hinzugefügt
     * @param object       Der Eintrag
     */
    public void add(Array object) throws StackFullException{
        if(this.li == this.length-1) {
            throw new StackFullException();
        }else {
            li++;
            this.al.add(this.li, object);
        }
    }

    /**
     * Hier wird der letzte Index Eintrag des Arrays zurückgegeben !! WICHTIG: Hier hätte ich auch to String machen können
     * @return              Der Eintrag
     */
    public Array returnlastIndex() throws StackEmptyException{
        if(li < 0) {
            throw new StackEmptyException();
        }else {
            return this.al.get(li);
        }
    }

    /**
     * Hier wird die gesamte List zurückgegeben
     * @return              Die Einträge
     */
    public String returnal() {
        String elemente = this.al.toString();
        if(elemente == null) {
            return "";
        }else {
            return elemente;
        }
    }
}
