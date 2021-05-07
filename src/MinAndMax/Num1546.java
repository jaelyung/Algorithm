package MinAndMax;

import java.util.*;

public class Num1546{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
     
      int totalExamNum = sc.nextInt();
      double[] score = new double[totalExamNum];
      int max = 0;
      double sum = 0.0;
      for(int i=0; i<totalExamNum; i++){
           score[i] = sc.nextInt();
           max = score[0];
      }
      
      for(int i=1; i<totalExamNum; i++){
         if(score[i]>max){
            max=score[i];
         }
      }
      
      for(int i=0; i<totalExamNum; i++){
         score[i] = score[i]/max*100;
         sum = sum + score[i];
      }
     
      double ave = sum / totalExamNum;
      
      System.out.println(ave);
   }
}
