import java.util.ArrayList;

public class quest1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        shiftByN(a, 2);

        System.out.println(a.toString());
    }

    public static void shiftByN(ArrayList<Integer> a, int amount) {
        for(int i =0; i<amount;i++){
            pushIndex(a);
        }
    }

    public static void pushIndex(ArrayList<Integer> xs){
        int toPush= xs.get(0);
        int temp;
        System.out.println("toPush is: "+toPush);

        for(int i =0;i<xs.size()-1;i++){
            temp = xs.get(i+1);
            System.out.println("Adding "+toPush+" where "+xs.get(i+1)+" is rn");
            xs.set(i+1, toPush);
            toPush = temp;
            System.out.println("New toPush value "+toPush);
            System.out.println("\nNew Aray "+xs.toString()+"\n");

        }
        xs.set(0, toPush);
    }
}

