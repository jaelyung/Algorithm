import java.util.Scanner;

public class T02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int[] array=new int[3];
        
        for(int i=0;i<3;i++){
            int num = sc.nextInt();
            array[i]=num;
        }
        
        int index=0;
        int min, temp;
        
        for(int i=0; i<3; i++){
            min=1000001;//1=<num<=1000000
            for(int j=i; j<3; j++){
                if(min>array[j]){
                    min=array[j];
                    index=j;
                }
            }
            temp=array[i];
            array[i]=array[index];
            array[index]=temp;
        }
        for(int i=0; i<3; i++){
            System.out.print(array[i]+" ");
        }

	}

}
