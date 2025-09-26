package GenericsExamples;


class Utils{
    public static <T> void printArray(T[] arr){
        for(T item : arr){
            System.out.print(item);
        }
        System.out.println();
    }
}

public class program6 {
    public static void main(String[] args) {
        Utils.printArray(new String[]{"a","e","i","o","u"});
        Utils.printArray(new Integer[]{1,2,3,4,5,6});
        
    }
}

// aeiou
// 123456
