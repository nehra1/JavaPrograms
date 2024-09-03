public class Main extends Sub2{

    public static void main(String[] args) {
        Main obj = new Main();
        obj.print();

        System.out.println(obj.print(obj.a+ obj.b+ obj.c));
       // Sub2 obj1 = new Sub2();
        obj.print();
        System.out.println(obj.print(obj.a,obj.b));
        System.out.println(obj.print(obj.a));
    }
    /*public void call(){
        super.print(2);
        this.print(4);
    }*/
}