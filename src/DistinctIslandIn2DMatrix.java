import java.util.HashSet;
import java.util.Set;

public class DistinctIslandIn2DMatrix {

    public static void main(String[] args){

        //Input set 1
        int[][] grid = {
                { 1, 1, 0, 1, 1 },
                { 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1 },
                { 1, 1, 0, 1, 1 }
        };

        //Input set 2
        /*int[][] grid =
                {
                        {1, 1, 0, 0, 0},
                        {1, 1, 0, 0, 0},
                        {0, 0, 0, 1, 1},
                        {0, 0, 0, 1, 1}
                };*/

        Set<String> islandShapes = new HashSet<>();
        Set<String> coveredCoordinates = new HashSet<>();

        for(int i=0; i< grid.length; i++){

            for(int j=0; j<grid[i].length; j++){

                String currentCoordinates = i+""+j;

                if(!coveredCoordinates.contains(currentCoordinates)){

                    coveredCoordinates.add(currentCoordinates);

                    Integer currentEle = grid[i][j];

                    String currentIslandShape = "";

                    if(currentEle.equals(1)){

                        currentIslandShape = currentIslandShape + "x";

                        Integer nextElement = (j+1)<grid[i].length ? grid[i][j+1] : null;
                        Integer belowElement = (i+1)< grid.length ? grid[i+1][j] : null;

                        if(nextElement!=null && nextElement.equals(1)){
                            coveredCoordinates.add(i+""+(j+1));
                            currentIslandShape = currentIslandShape + "r";
                        }

                        if(belowElement!=null && belowElement.equals(1)){
                            coveredCoordinates.add((i+1)+""+j);
                            currentIslandShape = currentIslandShape + "b";
                        }

                        if(nextElement!=null && nextElement.equals(1) && belowElement!=null && belowElement.equals(1)){
                            Integer diagnolElement = (i+1) < grid.length && (j+1)<grid[i].length ? grid[i+1][j+1] : null;

                            if(diagnolElement!=null && diagnolElement.equals(1)){
                                coveredCoordinates.add((i+1)+""+(j+1));
                                currentIslandShape = currentIslandShape + "d";
                            }

                        }

                        islandShapes.add(currentIslandShape);

                    }
                }



            }

        }

        System.out.println("Number of Distinct Islands: "+islandShapes.size());

    }
}
