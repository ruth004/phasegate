import java.util.Arrays;
    public class ReversedArray{
    public static void main(String[]args){
        int [][]Matrix = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };
        
        for(int index = 0; index < Matrix.length; index++){
            for(int count = 0; count < Matrix[index].length; count++){
            
            for(int counter = count + 1; counter < Matrix[index].length; counter++){
            
                if(Matrix[index][count] < Matrix[index][counter]){
                
                int temp = Matrix[index][count];
                Matrix[index][count] = Matrix [index][counter];
                Matrix[index][counter] = temp;
                
                }
            }
        }
      }
        for(int count= 0; count < Matrix.length; count++){
        for(int index = 0; index < Matrix[count].length; index++){
        System.out.print(Matrix[count][index] + "  ");
        }
          System.out.println();
        }
    }
        }
      
      
    
