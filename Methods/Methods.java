
public class Methods {

    public static void main(String[] args) {
        //VOID without parameter Output
        System.out.println("the sum is printed for without parameter");
        add();

        //VOID with parameter Output
        System.out.println("the sum is printed for with parameter");
        addition(25, 10);

        //VOID without parameter Output
        int result = sum();
        System.out.println("The sum of the non-void method without parameter is : " + result);

        //VOID with parameter Output
        int res = sum(20, 20);
        System.out.println("The sum of the non-void method with parameter is : " + res);

    }

    public static void add() //no paramter
    {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    public static void addition(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    //Non void without parameter
    public static int sum() {
        int x = 10;
        int y = 20;
        return x + y;

    }

    //Non void with paramter
    public static int sum(int x, int y) {
        return x + y;

    }
}
