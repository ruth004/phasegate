    import java.util.Arrays;
    import java.util.Scanner;

    public class ScoresArrays{
      public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter student Number");
        int  studentNumber = input.nextInt();

        System.out.print("Enter subject Number");
        int subjectNumber = input.nextInt();

        int [][] score = new int[studentNumber][subjectNumber];
        int [] total = new int[studentNumber];
        int [] positions = new int [studentNumber];
        
        for(int index = 0; index < studentNumber;index++){
          System.out.println("\n Enter student scores"+(index +1));
        for(int count = 0; count < subjectNumber; count++){
           while(true){
          System.out.println("Enter subject scores"+ (count + 1) + ":");
        
          int scores = input.nextInt();
          if(scores >= 0 && scores <= 100){
             score[index][count]  = scores;
              total[index] += scores;
          
          System.out.println("successfully saved");
          break;
          }else{
              System.out.print("invalid score! Enter score between 0 and 100");
              
              }
          } 
        }
        }
         
          for(int count = 0; count < studentNumber; count++){
                positions[count] = 1;
          for(int index = 0; index < studentNumber; index++){
          if(total[index] > total[count]){
           positions[count]++;
          }
        }
        
        }
          System.out.println("\n"+"=================");       
          System.out.println("STUDENT GRADE SUMMARY");
          System.out.println("======================");
          System.out.printf("%-12s", "STUDENT");
      
          for(int index = 0; index < subjectNumber; index++){
          System.out.printf("%8s", "SUB" + (index + 1));
          }
      
          System.out.printf("%10s%10s%8s%n", "TOTAL", "AVE", "POS");
        
          System.out.println("==================");
        
          for(int count = 0; count < studentNumber; count++){
          double average = (double) total[count]/ subjectNumber;
          System.out.printf("%-12s", "Student " + (count +1));
          for(int index = 0; index < subjectNumber; index++){
          System.out.printf("%8d", score[count][index]);
          }
          System.out.printf("%10d%10.2f%8d%n",total[count],average,positions[count]);
        }
    
    }
  }

