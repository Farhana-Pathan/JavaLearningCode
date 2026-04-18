package Core.ControlFlowStmt.Patterns2;

public class HollowRectPattern {
    
    public static void HollwRect(int totalRows , int totalColumns){

        for(int i = 1; i <= totalRows; i++){
            for(int j = 1; j <= totalColumns; j++){
                if( i == 1|| i== totalRows || j==1 || j == totalColumns){
                    System.out.print("*");
                }else
                    {
                        System.out.print(" ");
                    }
                System.out.print(" ");
            }System.out.println();
        }
    }


    public static void main(String[] args) {
        HollwRect(4, 5);
    }
}
