public class stringcompress {
    public static StringBuilder compressString(String str){
        StringBuilder sb=new StringBuilder();
       //sb.append(str.charAt(0));
       for(int i=0;i<str.length();i++){
        int counter=1;
        while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
           counter++;
           i++;
        }
        sb.append(str.charAt(i));
         if(counter>1){
           sb.append(counter);
        }
        
       }
       return sb;
    }
    public static void main(String[] args){
        String str="ABBCCCDD";
         System.out.println( compressString(str));
    }
}
