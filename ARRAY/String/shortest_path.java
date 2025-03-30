Question:GIVEN A ROOT CONTAINING FOUR DIRECTIONS(E,W,N,S)
        FIND A SHORTEST PATH
       FORMULA FOR FINDING SHORTEST PATH=MATH.SQRT(X2+Y2)
        LOGIC-> N->Y++,S->Y--,W->X--,E->X++
             

public class shortest_path {
    public static void main(String args[]){
        String path="WSNWNSNNS";
        float ans=getShortestPath(path);
        System.out.println(ans);

    } 
    public static float getShortestPath(String path){
        int y=0;
        int x=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='N'){
                y++;
            }else if(dir=='S'){
                y--;
            }else if(dir=='E'){
                x++;
            }else{
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;

        return ((float)Math.sqrt(X2+Y2)); 

    }   
}
