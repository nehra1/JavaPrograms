public class Sub2 extends Sub1{
    int c=9;
    public int print(int a,int b){
        System.out.println("child class method"+a);
       return a+b;
    }
    /*public static void main(String[] args) {
        Sub2 obj = new Sub2();
        obj.print();
        System.out.println(obj.print(obj.a,obj.b));
        System.out.println(obj.print(obj.a));

    }*/
}
