public class A {
    int a;
    A(){System.out.println("parent cons"+a);
    }
    A(int a){System.out.println("parent cons"+a);
    }
   A(int a,int b){System.out.println("parent cons" +a +b);
    }

    public void print(int a){
        System.out.println("parent method"+a);
    }
}
