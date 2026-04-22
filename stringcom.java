public class stringcom {
     public static String substring(String str,int startindex,int endindex){
      String sub="";
      for(int i=startindex;i<endindex;i++){
        sub+=str.charAt(i);
      }
      return sub;
    }
    public static void main(String[] args){
         String sub="AYUSH SINGH";
    String name[]={"ayush","piyush","muskan"};
     String largest=name[0];
     for(int i=1;i<name.length;i++){
        if(largest.compareToIgnoreCase(name[i])<0){
             largest=name[i];
        }
     }
     System.out.println(largest);
     System.out.println(" ");
    //For finding Sub-String
       System.out.println(substring(sub,0,11));
            System.out.println("Below part show uses of inbuilt SubString Method ");
     System.out.println( sub.substring(0,7));
    }
}
