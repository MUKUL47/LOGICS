/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mukul;

/**
 *
 * @author Mukul
 */
public class Mukul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        heapSort(new int[]{1,2,3,4,5,6});
    }

    public static void heapSort(int arr[]){ 
        //left  = 2*index+1
        //right = 2*index+2
        int pivot = arr.length/2-1;
        //int newArr[] = 
        heapify(arr,pivot);
                
        
        
    }
    public static void heapify(int arr[], int pvt){
        System.out.println(pvt);
    }
    
}
