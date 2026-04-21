public class shortestpath {
    public static float shortestPath(String str){
        float displacement;
        int x = 0, y = 0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
           if(dir=='N'){
                x++;
           } 
           if(dir=='S'){
                x--;
           }
           if(dir=='W'){
                y--;
           } 
           if(dir=='E'){
                y++;
           }  
        }
      displacement=(float)Math.sqrt(x*x+y*y);  
        return displacement;
    }
    public static void main(String[] args){
      String str="WNEENESENNN";
      System.out.println("Shortest path_"+shortestPath(str));
    }
}
