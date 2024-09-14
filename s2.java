public class s2 {
    public static void main(String[] args) {
        String day = "Friday" ;
        String result = " ";
       // use result to retun a value to reduce use of Syatem.out.println() 
       /* switch(day){
            case "Saturday","Sunday" -> result = "6 am";
            case "Monday" -> result = "8 am";
            default -> result = "7 am";
            }*/
        // switch as expression
        result = switch(day){
            case "Saturday","Sunday" -> "6 am";
            case "Monday" ->  "8 am";
            default -> "7 am";
        };
        
        System.out.println( result);
   }
}