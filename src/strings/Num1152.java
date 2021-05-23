package strings;

import java.util.*;

public class Num1152{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String input = sc.nextLine();
    StringTokenizer st = new StringTokenizer(input," ");
    
    System.out.println(st.countTokens());
  }
}
