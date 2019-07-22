
import java.util.Scanner;

public class transpose_matrix{
public static void main(String[] args) {
   Scanner S = new Scanner(System.in);
    System.out.println("ENTER ROWS AND COLUMN");
    int r=S.nextInt();
    int c=S.nextInt();
    
    int a[][]= new int[r][c];
    
    System.out.println("ENTER ELEMENTS");
   for(int i=0;i<r;i++){
       
       for(int j=0;j<c;j++){
           a[i][j]=S.nextInt();
       }
   }
   for(int i=0;i<r;i++){
       System.out.println();
       for(int j=0;j<c;j++){
           System.out.print(a[i][j]);
       }
   }System.out.println("");
    System.out.print("TRANSPOSE");
   for(int i=0;i<c;i++){
       System.out.println("");
       for(int j=0;j<r;j++){
           System.out.print(a[j][i]+"");
       }
   }System.out.println("");
}
}