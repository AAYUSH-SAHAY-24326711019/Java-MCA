package GenericsExamples;

interface Container<T>{
    void add(T item);
    T getValue();
}

class StringContainer implements Container<String>{
    private String s;
    public void add(String item){
        s=item;
    }
    public String getValue(){
        return s;
    }
}

class MyContainer<T> implements Container<T>{
    private T data;
    public void add(T value){
        data  = value;
    }

    public T getValue(){
        return data;
    }
}

public class program7 {
    public static void main(String[] args) {
        StringContainer sc = new StringContainer();
        System.out.println("sc.add('Hello Aayush');");
        sc.add("Hello Aayush");
        System.out.println("output : "+sc.getValue());

        MyContainer<Integer> myContainer = new MyContainer<Integer>();
        System.out.println("myContainer.add(100);");
        myContainer.add(100);
        System.out.println("output : "+myContainer.getValue());
    }
    
}
/*
* sc.add('Hello Aayush');
output : Hello Aayush
myContainer.add(100);
output : 100
 */