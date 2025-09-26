package GenericsExamples;

class Pair<K,V>{
    private K key;
    private V value;

    public Pair(K k, V v){
        key = k;
        value = v;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }
}

public class program3 {
    public static void main(String[] args) {
        Pair<String,String> p1 = new Pair<>("Name", "Aayush");
        Pair<String,Integer> p2 = new Pair<>("Age",21);
        System.out.println("Printing values inside p1 ,p2 object");
        System.out.println(p1.getKey()+" "+p1.getValue());
        System.out.println(p2.getKey()+" "+p2.getValue());
    }
}
/*
 * 
 Printing values inside p1 ,p2 object
Name Aayush
Age 21
 */