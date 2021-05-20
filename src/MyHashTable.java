import java.util.ArrayList;
import java.util.Arrays;

public class MyHashTable {
    private ArrayList<ArrayList<Pair>> bucketArray;
    private int bucketCapacity;
    private int n = 0;
    private Pair temporary = new Pair("-1","-1");  // real key and value
    private ArrayList<Pair> temp = new ArrayList<Pair>(); // secondary array list in map
    private float loadfactor = 0;
    private float limit = 2000.0f;

    MyHashTable(int initialCapacity) {
        bucketCapacity = initialCapacity;
        bucketArray = new ArrayList<ArrayList<Pair>>(bucketCapacity);
        temporary.setKey("0");
        temporary.setValue("0");
        temp.add(temporary);
        for(int i=0;i<bucketCapacity;i++)
            bucketArray.add(temp);
    }
    MyHashTable(int initialCapacity, float loadfactlimit) {
        bucketCapacity = initialCapacity;
        this.limit = loadfactlimit;
        bucketArray = new ArrayList<ArrayList<Pair>>(bucketCapacity);
        temporary.setKey("0");
        temporary.setValue("0");
        temp.add(temporary);
        for(int i=0;i<bucketCapacity;i++)
            bucketArray.add(temp);
    }

    private int hashFunc(String k) {
        String[] l = k.split("");
        int key = 0;
        for(int i =0; i<l.length ; i++){
            key += Math.pow(7, l.length-i-1) * Integer.parseInt(l[i]);
        }
        key = key % bucketCapacity;
        return key;
    }


    public int size() {return n;}

    public String get(String k) {
        int key = hashFunc(k);
        ArrayList<Pair> my = bucketArray.get(key);
        for(int i = 0;i<my.size();i++){
            if(k==my.get(i).getKey()){
                return my.get(i).getValue();
            }
        }
        return "no such student!";
    }

    public void put(String k, String v) {
        int key = hashFunc(k);
        ArrayList<Pair> my = bucketArray.get(key);
        for(int i =0;i<my.size();i++){
            if(k == my.get(i).getKey()){
                Pair newpair = new Pair(k, v);
                my.set(i, newpair);
                return;
            }
        }
        Pair mypair = new Pair(k, v);
        my.add(mypair);
        bucketArray.add(my);
        n++;
        loadfactor = (float)n/(float)bucketCapacity;
        System.out.println(loadfactor);
    }

    public void remove(String k) {
        int key = hashFunc(k);
        ArrayList<Pair> my = bucketArray.get(key);
        for(int i=0; i< my.size();i++) {
            if (k == my.get(i).getKey()) {
                my.remove(i);
                n--;
                System.out.println(k + " removed!");
                return;
            }
        }

        System.out.println("no such student!");

    }

    public float getLoadfactor(){
        return loadfactor;
    }

    public void rehash(){

    }
}
