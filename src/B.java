public class B extends A{
int z=9;
    B(){
        super(2);
    System.out.println("child cons"+z);
    }
    public void print(){
        System.out.println("child method"+z);
    }
    public static void main(String []args){
        B obj = new B();
        obj.call();
        

    }
    public void call(){
        super.print(a);
        this.print();
    }
}
