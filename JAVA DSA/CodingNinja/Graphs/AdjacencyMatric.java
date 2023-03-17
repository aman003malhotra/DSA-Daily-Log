package CodingNinja.Graphs;
import java.util.*;

public class AdjacencyMatric {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e = s.nextInt();
        int[][] adjMatrix = new int[n][n];
        for(int i=0;i<e;i++){
            int v1 =  s.nextInt();
            int v2 = s.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }  
        for(int i= 0; i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }  
        // dfs(adjMatrix);
        bfs(adjMatrix);
    }




    public static void dfs(int[][] adjMatrix){
        boolean[] visited = new boolean[adjMatrix.length];
        dfs(adjMatrix, 0, visited);
        
    }
    // Time complexity
    // O(v^2)
    // v- number of vertices 
    public static void dfs(int[][] adjMatrix, int currentVertex, boolean[] visited){
        System.out.print(currentVertex + " ");
        visited[currentVertex] = true;
        for(int i = 0 ; i<adjMatrix.length; i++){
            if(adjMatrix[currentVertex][i] == 1 && visited[i] == false){
                dfs(adjMatrix,i, visited);
            }
        }
    }


    public static void bfs(int[][] adjMatrix){
        Queue<Integer> pendingVertices = new LinkedList<Integer>();    
        boolean[] visited = new boolean[adjMatrix.length];
        visited[0] = true;
        pendingVertices.add(0);

        while(!pendingVertices.isEmpty()){
            int front = pendingVertices.poll();
            System.out.print(front + " ");
            for(int i = 0 ; i<adjMatrix.length; i++){
                if(adjMatrix[front][i] == 1 && visited[i] == false){
                    visited[i] = true;   
                    pendingVertices.add(i);
                }
            }  
        }
    }
}
