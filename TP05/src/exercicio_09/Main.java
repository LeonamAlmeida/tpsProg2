package exercicio_09;

public class Main {

    public static void main(String[] args){

        try {
            someMethod();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    static void someMethod(){
        try {
            someMethod2();
        } catch(Exception e){
            System.out.println("StackTrace");
            e.printStackTrace();
        }
    }
    static void someMethod2(){
        int a, b = 5, c = 0;
        a = b/c;
    }
}
