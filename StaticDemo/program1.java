package StaticDemo;

class program1{
    static int rec=0;
    int num = 0;

    public void setData(int k){
        num = k;
        rec++;
    }

    public void showData(){
        System.out.println("Data = "+num);
    }

    public static void showRecords(){
        System.out.println("No. of Records = "+rec);
    }
    public static void main(String args[]){
        
        program1 obj1 = new program1();
        obj1.setData(10);

        program1 obj2 = new program1();
        obj2.setData(20);

        program1 obj3 = new program1();
        obj3.setData(30);

        obj3.showRecords();

        program1.showRecords();


    }
}