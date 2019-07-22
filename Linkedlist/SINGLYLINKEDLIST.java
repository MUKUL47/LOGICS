/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linkedlist;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SINGLYLINKEDLIST {
    public NODE head;
    public static void main(String[] args) {
        SINGLYLINKEDLIST A = new SINGLYLINKEDLIST();
       
    A.GraphList();
    }
    
    void GraphList(){
  Scanner S = new Scanner(System.in);
  head=new NODE();
  head.data=0;
  NODE n = new NODE();
  head.next=n;
  n.data=1;
   NODE n2= new NODE();
   n2.data=2;
   n.next=n2;
   NODE n3= new NODE();
   n3.data=3;
   n2.next=n3;
   n3.next=head;
        circularAdd(head,2);
        
       
    }
    
public String AddNode(int data,NODE n){
if(n==null){
    NODE N = new NODE();
    N.data=data;
    head=N;
}
else{
NODE T=n;
while(T.next!=null){
    T=T.next;
}
NODE N = new NODE();
T.next=N;
N.data=data;

}
return data+" ADDED";
}

public String Delete_At_Position(int position){
if(position==0){
    NODE T=head;
    head=head.next;
    
}
else{
    int k=0;
NODE T=head;
while(k<position-1){
    T=T.next;
    k++;
}
NODE T1=T.next.next;
T.next=T1;
}

return position+"ST/ND/TH NODE DELETED";}

public String Add_At_Position(int position,int data){
   if(position==1){
       NODE N=new NODE();
       N.next=head;
       N.data=data;
       head=N;
   }
   else{
       NODE T=head;
       int i=0;
       while(i<position-2){
         T=T.next;
         i++;
       }
       NODE PREV=T.next;
       NODE N =new NODE();
       T.next=N;
       N.data=data;
       N.next=PREV;
   }
    
    return position+"ST/ND/TH  NODE ADDED";
}
public void Show(NODE head){
   int a[]=new int[]{},m=0;
    while(head!=null){
    
        System.out.print(head.data+" ");
    
        head=head.next;
    }
    System.out.println("");
}
public int Search(int data){
    int value=-1,position=0;
    while(head.next!=null){position++;
        if(head.data==data){
            value=0;
            break;
        }
        head=head.next;
    }
    if(value==0){
        value=position;
    }
    return value;
}
void reverse(){
NODE T1=head;
    NODE T=head;  NODE N = null;
NODE prev=T;
int i=0;

    while(T!=null){
      
        prev=T;
          if(T.next!=null){
              T=T.next;
       N = new NODE();
       N=T;
       N.R=prev;
        }else{
              break;
          }
    }
   while(N!=null){
      System.out.print(N.data+" ");
       N=N.R;
   }
    System.out.println("");
}
void Swap_Two_Nodes(int data1,int data2){
NODE T=head;
if(T.data==data1 || T.data==data2){
    
    NODE first=T;
    NODE TFirstNext=head.next;
    NODE TSecondPrev=first;
    if(data2==T.next.data || data2==T.next.data){
       NODE SecondNext=T.next.next;
        T.next.next=first;
       head=T.next;
       first.next=SecondNext;
       
     
    }else{
    while(TSecondPrev.next!=null){
         if(TSecondPrev.next.data==data1 || TSecondPrev.next.data==data2){
             break;
         }
        TSecondPrev=TSecondPrev.next;
    }
  
    NODE TSecondNode=TSecondPrev.next;
    NODE TSecondNodeNext=TSecondNode.next;
    
    first.next=TSecondNodeNext;
    TSecondPrev.next=first;
    
    TSecondNode.next=TFirstNext;
    head=TSecondNode;
    }}
else{
    while(T.next!=null){
        if(T.next.data==data1 || T.next.data==data2){
             break;
         }
        T=T.next;
    }
    NODE First=T.next;
    NODE FirstPrev=T;
    NODE FirstNext=First.next;
    NODE SecondPrev=First;
    NODE T1=FirstNext;
    if(FirstNext.data==data1|| FirstNext.data==data2){
       NODE S=FirstNext;
       NODE SN=S.next;
       S.next=First;
       FirstPrev.next=S;
       First.next=SN;
    }else{
    
    
    while(T1.next!=null){
    if(T1.next.data==data1 || T1.next.data==data2){
             break;
         }
        T1=T1.next;
    }
       
     NODE Second=T1.next;
   
 NODE GG=T1;
     NODE SecondNext=Second.next;
        
    T.next=Second;
    Second.next=FirstNext;
    GG.next=First;
    First.next=SecondNext;
     
    }}
}
void sortwithevenodd(NODE head){
int c=0,o=0;
NODE t=head; String nochoice="";
while(t!=null){
    c++;
    if(t.data%2!=0){
        o++;
       
    
    } 
t=t.next;}
 t=head;
 NODE tn;
 int cc=0,od=0,ed=0,found=0;
    System.out.println(c-o);
   
while(t!=null){cc++;
 
if(t.data%2!=0){
       tn=t.next;
        od=t.data;
   
       while(tn!=null && found!=1){
           if(tn.data%2==0){
               t.data=tn.data;
            tn.data=od;
         
          
              found=1;
           }else{
           
           tn=tn.next;
       }}
       
       
    }found=0;
    t=t.next;
}  
t=head;
    System.out.println(nochoice);
cc=0;int c1=0;
   
while(t!=null){cc++;
    if(cc>=(c-o+1)){
     
        t.data=a[c1++];
        cc++;
   }
t=t.next;
}

}

    private String  DetectCycle(NODE head) {
        NODE T=head;
        NODE T1=head;
        int STOP=0;
        while(T!=null){
            T1=T.next;
//            if(T.next==null){
//                T1=head;
//            }
            while(T1!=null){
              
                if(T==T1){
                return "CYCLE FOUND"; 
                  
                }
                
                T1=T1.next;
            }
            T=T.next;
        }
    return "NO CYCLE";    
    }
    
    private void middle_reverse(NODE head){
          
          int i=0;
          NODE head1=head;
    while(head1!=null){
    
        i++;
    
        head1=head1.next;
    }int j=0,k=0;
    int mid=0;
        if(i%2!=0){j=1;k=1;
        mid=(i+1)/2;
        }else{j=0;k=0;
            mid=i/2;
        }
        //System.out.println("mid "+mid);
        int a[]=new int[mid];
      i=0;
        
        NODE head2=head;
        while(head2!=null){
            j++;
            if(j>mid && mid%2==0){
            
                a[i++]=head2.data;
            }
            if(j>=mid && mid%2!=0){
               
                a[i++]=head2.data;
            }
            head2=head2.next;
          
        } i=mid-1;
        NODE head3=head;
        while(head3!=null){
            k++;
            if(k>mid && mid%2==0){
                
                head3.data=a[i--];
                
            }
            if(k>=mid && mid%2!=0){
              
                head3.data=a[i--];
            }
            
            head3=head3.next;
         
        }
    }

    private void Bubble_Sort(NODE head) {
        NODE T=head;
        NODE T1=head;
        while(T!=null){
           T1=T;
            while(T1!=null){  
                if(T.data>T1.data){
                   // System.out.println(T.data+">"+T1.data);
                Swap_Two_Nodes(T.data,T1.data);
                NODE T2=T1;
                T1=T;
                T=T2;
              Show(head);
                }
                T1=T1.next;
            
            }
            T=T.next;
        }
        
    }
    public void circularAdd(NODE n , int data){
        NODE first=n;
        NODE find=null;
        int c=999;
        while(true){
  
           int location=data-n.data;
      
             if(location>=0 && location<c){
                find=n;
           
                c=location;
               
            }
            n=n.next;
           if(n==first){
               
                break;
            }
            
        }

   while(true){
       
       if(head==find){
           System.out.println("between "+head.data+" and "+head.next.data);
           NODE n1 = new NODE();
           n1.data=data;
           n1.next=head.next;
           head.next=n1;
       }head=head.next;
       if(head==first){
           break;
       }
   }
   while(true){
       System.out.println(head.data);
       head=head.next;
       if(head==first){
           break;
       }
   }
    }
    
    

class NODE{
int data;
NODE next;
NODE R;
}}
