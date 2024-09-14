
public class s {
    public static void main(String[] args){
        int n = 5;
        String result = " ";

       /* switch(n){
         case 1 :
             System.out.println("Monday");
             break ;
         case 2 : 
             System.out.println("Tuesday");
             break ;
         case 3 :
             System.out.println("Wednesday");
             break ;
         case 4 :
             System.out.println("Thursday");
             break ;
         case 5 :
             System.out.println("Feiday");
             break ;
         case 6 :
             System.out.println("Saturday");
             break ;
         case 7 :
             System.out.println("Sunday");
             break ;
         default :
             System.out.println("Enter a valid number");
        }*/
        result = switch(n){
            case 1 -> "Monday" ;
            case 2 -> "Tuesday" ;
            case 3 -> "Wednesday" ;
            case 4 -> "Thursday" ;
            case 5 -> "Friday" ;
            case 6 -> "Saturday" ;
            case 7 -> "Sunday" ;
            default -> "Enter a valid Number ." ;
        };
        System.out.println(result);

    }
    
}
