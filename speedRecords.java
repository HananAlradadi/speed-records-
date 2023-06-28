
package speedRecords ;

 import java.util.Scanner ;
public class speedRecords {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
         double  ave =0 ;
         double count = 0 , t =0 ,  x = input.nextDouble() ;
           double min = x ;
           double max = 0 ;
       while( x != 0){
           
           count ++ ;
            t += x ;
            
            x = input.nextInt() ;
           
              if((x < min) && (x!=0))
                min = x ;
              if((x > max) && (x!=0))
                max = x ;
              
          
       }
       ave = t / count ;
       System.out.printf("Average speed = %.2f km/h \n",ave) ;
        System.out.printf("Max speed = %.2f km/h \n" , max);
       System.out.printf("Min speed = %.2f km/h " , min);
    }
    
}
