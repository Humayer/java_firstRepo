public class Ar {
    public static void main(String [] args){
       /*  int nums [] = new int[4];
        nums[0] = 6 ;
        nums[1] = 7 ;
        nums[2] = 5 ;
        nums[3] = 3 ;

        for(int i = 0 ; i < 4 ; i++ ){
            System.out.println(nums[i]);
        }*/


        // regular array


        /*int nums [] [] = new int[3][3];

        
        for(int i = 0 ; i < 3 ; i ++ ){
            for(int j = 0 ; j < 3 ; j++ ){
              nums [i][j] = (int)(Math.random() * 10 ); 
              System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }*/

       /*  for(int i = 0 ; i < 3 ; i ++ ){
            for(int j = 0 ; j < 3 ; j++ ){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }*///this is for first time to recap the code properly



       /* int nums [] [] = new int[3][];//jagged array
        
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];
        
        for(int i = 0 ; i < nums.length ; i ++ ){
            for(int j = 0 ; j < nums[i].length ; j++ ){
              nums [i][j] = (int)(Math.random() * 10 ); 
              System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }*/

        // 3 dimentional array


        int nums [] [] []= new int[3][4][5];

        
        for(int i = 0 ; i < 3 ; i ++ ){
            for(int j = 0 ; j < 4 ; j++ ){
              for(int k = 0 ; k < 5 ; k++ ) {
                nums [i][j][k] = (int)(Math.random() * 10 ); 
              System.out.print(nums[i][j][k]+" ");
               }
               System.err.print("   ");
            }
            System.out.println();
        }


    }
    
}
