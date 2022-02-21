public class PalindromeIndex {
    public static void main(String args[]) {
  String word1="hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh";int c1=0;
  int m1=999,y=9;
char word[]=word1.toCharArray();
String check="";
for(int i=0;i<word.length;i++){
char letter=word[i];
word[i]=' ';

for(int j=0;j<word.length;j++){
if(word[j]!=' '){
check+=word[j];
}
if(j==word.length-1){
 
if(CheckPalindromity(check)==1){
   c1++;
    if(i<m1){
        m1=i;
    }
 y=0;
}
if(y==0){
    break;
}}

}
check="";
word[i]=letter;
}
if(c1==word.length){
System.out.println(-1);    
}else{
    System.out.println(m1);
}

    }
    
static int CheckPalindromity(String check1){
    char check[]=check1.toCharArray();
    int c=0,pos=0;
    for(int i=0,j=check.length-1;i<check.length && j>=0;i++,j--){
        if(check[i]==check[j]){
            c++;
        }
    }
    if(c==check.length){
        pos=1;
    }else{
        pos=-1;
    }
    return pos;
}
}
