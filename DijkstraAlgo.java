// this algorithm is used to find shortestpath
import java.util.*;

public class DijkstraAlgo {
    public static void main(String[] args) {
        int mat[][] = {
            { 0, 2, 0, 4, 0, 0 },
            { 0, 0, 3, 2, 0, 0 },
            { 2, 0, 0, 0, 0, 4 },
            { 0, 0, 0, 0, 2, 0 },
            { 0, 0, 0, 0, 0, 1 },
            { 0, 0, 0, 0, 0, 0 }
        };
        int source = 0;
        int[] distance = new int[mat.length]; // create array for distance
        boolean[] visited = new boolean[mat.length]; // create array for visited vertexex

        for (int i = 0; i < mat.length; i++) {
            if (i == source) {
                continue;
            }
            distance[i] = Integer.MAX_VALUE; //1. source value is 0,and remaining all are infinitive
        }

        for (int i = 0; i < mat.length; i++) {
            int minDistanceVertex = findMinDistVertex(distance, visited); //2.find the min dist vertex from source
            visited[minDistanceVertex] = true; //3. visited nodes are indicate with true
            
            for (int j = 0; j < mat.length; j++) { //4.find the adjacent nodes min value
                if (mat[minDistanceVertex][j] != 0 && !visited[j] && distance[minDistanceVertex] != Integer.MAX_VALUE) {
                    int newDist = distance[minDistanceVertex] + mat[minDistanceVertex][j];
                    if (newDist < distance[j]) {
                        distance[j] = newDist;
                    }
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            System.out.println("vertex:" + i + "& distance from source:" + distance[i]);
        }
    }

    public static int findMinDistVertex(int[] distance, boolean[] visited) {
        int minVertex = -1;

        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {
                minVertex = i;
            }
        }
        return minVertex;
    }
}



