public class ob {
    public static void main(String[] args) {
        int n1 = 4 , n2 = 5 ;

        Calculator calc = new Calculator();

        int result = calc.add(n1,n2);
        System.out.println(result);
        }
}
class Calculator{
    int a ; // just know to we can use variables
    public int add(int n1,int n2){// method
        int r = n1 + n2 ;
        return r ;
    }
}