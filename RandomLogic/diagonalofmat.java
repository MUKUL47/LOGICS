/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class diagonalofmat {
    public static void main(String[] args) {
        
        
	
        int a[][]= {
         {1,1,1,41,5}
	,{2,3,4,5,6}
	,{3,4,5,6,7}
	,{4,5,6,7,8}
	,{5,6,7,8,9}};
        int size=a.length-1;
int i,j,a1=0,b=0;
	int a2=1,b1=size;
	for(i=0;i<size+1;i++){
		          System.out.println();
		;for(j=0;j<size+1;j++){
				System.out.print("\t"+a[i][j]);
		}
		
		
	}
	
        System.out.println("\n\n")
	;while(b<size+1){
		int m=b;
		System.out.print("\n");
		for(i=a1,j=b;i<=m;i++,j--){
			System.out.print("\t"+a[i][j]);
			
			if(i==m){
				b=b+1;
			}
		}
	}
	
while(a2<size+1){
		int m=a2;
				System.out.print("\n");

		for(i=a2,j=b1;i<=b1;i++,j--){
			System.out.print("\t"+a[i][j]);
			
			if(i==b1){
			a2++;
			}
		}
	}
        System.out.println("\n");
    }
}
