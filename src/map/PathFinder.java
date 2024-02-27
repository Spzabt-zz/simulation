package map;

import java.util.*;
import java.util.Map;

public class PathFinder {
    public static class Graph {
        private int[][] adjMatrix;
        private char[] vertexData;
        private int size;

        public Graph(int size) {
            this.size = size;
            this.adjMatrix = new int[size][size];
            this.vertexData = new char[size];
        }

        public void addEdge(int u, int v) {
            if (u >= 0 && u < size && v >= 0 && v < size) {
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
        }

        public void addVertexData(int vertex, char data) {
            if (vertex >= 0 && vertex < size) {
                vertexData[vertex] = data;
            }
        }

        public void printGraph() {
            int counter = 0;
            System.out.println("Adjacency Matrix:");
            for (int[] row : adjMatrix) {
                System.out.print(vertexData[counter] + ": ");
                for (int cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();

                counter++;
            }

            System.out.println("\nVertex Data:");
            for (int i = 0; i < size; i++) {
                System.out.println("Vertex " + i + ": " + vertexData[i]);
            }
        }

        private void dfsUtil(int v, boolean[] visited) {
            visited[v] = true;
            System.out.print(vertexData[v] + " ");

            for (int i = 0; i < size; i++) {
                if (adjMatrix[v][i] == 1 && !visited[i]) {
                    dfsUtil(i, visited);
                }
            }
        }

        public void dfs(char startVertexData) {
            boolean[] visited = new boolean[size];
            int startVertex = new String(vertexData).indexOf(startVertexData);
            dfsUtil(startVertex, visited);
        }

        public void bfs(char startVertexData, char destinationVertex) {
            boolean[] visited = new boolean[size];
            int v = new String(vertexData).indexOf(startVertexData);

            Map<Integer, Character> parent = new HashMap<>();
            Queue<Integer> vertexQueue = new LinkedList<>();
            vertexQueue.offer(v);
            visited[v] = true;

            while (!vertexQueue.isEmpty()) {
                v = vertexQueue.poll();
                System.out.print(vertexData[v] + " ");

                if (v == destinationVertex) break;

                for (int i = 0; i < size; i++) {
                    if (adjMatrix[v][i] == 1 && !visited[i]) {
                        vertexQueue.offer(i);
                        visited[i] = true;
                        parent.put(i, vertexData[v]);
                    }
                }
            }

            System.out.println(parent);

            List<Character> shortestPath = new ArrayList<>();
            Character current = destinationVertex;

            while (current != null) {
                shortestPath.add(current);
                v = new String(vertexData).indexOf(current);
                current = parent.get(v);
            }
            Collections.reverse(shortestPath);

            System.out.println(shortestPath);
        }

        public void bfs(char startVertexData) {
            boolean[] visited = new boolean[size];
            int v = new String(vertexData).indexOf(startVertexData);

            Map<Integer, Integer> parent = new HashMap<>();
            LinkedList<Integer> vertexQueue = new LinkedList<>();
            vertexQueue.offer(v);
            visited[v] = true;

            while (!vertexQueue.isEmpty()) {
                v = vertexQueue.poll();
                System.out.print(vertexData[v] + " ");

                for (int i = 0; i < size; i++) {
                    if (adjMatrix[v][i] == 1 && !visited[i]) {
                        vertexQueue.offer(i);
                        visited[i] = true;
                        parent.put(i, v);
                    }
                }
            }

            System.out.println(parent);
        }
    }
}
