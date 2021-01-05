package ffaerberboeck;
import java.util.ArrayList;
public class Stack <Array>{
    private ArrayList<Array> al;
    private int li;
    private int length;
    public Stack() {
        this.al = new ArrayList<Array>();
        Integer[] test = new Integer[3];
        test[0] = 1;
        test[1] = 2;
        test[2] = 3;
        al.add((Array) test);
        this.length = 3;
        this.li = 2;
    }
    public Stack(ArrayList<Array> al,int li, int length) {
        this.al = al;
        this.li = li;
        this.length = length;
    }

    public Array popal(){
        al.remove(this.li);
        li--;
        return this.al.get(li);
    }

    public void add(Array object){
        this.li++;
        al.add(li,object);
    }

    public Array returnlastIndex() {
        return this.al.get(li);
    }

    public String returnal() {
        String elemente = this.al.toString();
        if(elemente == null) {
            return "";
        }else {
            return elemente;
        }
    }
}
