package ffaerberboeck;

/**
 * Die Main Klasse, welche die Stack Klasse testen soll
 * @author Finn Faerberboeck
 * @version 2021-05-01
 */
public class Main {
    public static void main(String[] args) throws StackFullException, StackEmptyException{
        //Ich erzeuge ein String array mit 5 Einträgen um meine Klasse Stack zu testen
        Stack sal = new Stack<String>(5);
        sal.add("Test1");
        sal.add("Test2");
        sal.add("Test3");
        sal.add("Test4");
        sal.add("Test5");
        System.out.println("Das String Array: " + sal.returnal());
        Object lastIndex = sal.returnlastIndex();
        System.out.println("Das letzte Element des String Array: " + lastIndex.toString());
        //Ich entferne den letzten Eintrag und lass mir den neuen letzten Ausgeben
        Object lastIndexremoved = sal.popal();
        System.out.println("Das neue letzte Element des String Array: " + lastIndexremoved.toString());
        System.out.println("Wenn die Nachricht erscheint hat alles geklappt!! :)");
        //Hier teste ich die StackFullException
        sal.add("Test5");
        sal.add("Test6");


    }
}
