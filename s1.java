public class s1 {
    public static void main(String[] args) {
        String day = "Sunday" ;

        switch(day){
            case "Saturday","Sunday" -> System.out.println("6 am");
            case "Monday" -> System.out.println("8 am");
            default -> System.out.println( "7 am");
        }
    }
    
}