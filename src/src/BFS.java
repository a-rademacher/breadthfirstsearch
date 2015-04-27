/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * @author Rainmaker
 */
public class BFS {
    
    private int[][] adjacenyMatrix;
    private Queue<Integer> queue;
    
    public BFS(){
        queue = new LinkedList<Integer>();
    }
    
    /**
     * 
     * @param matrixSize 
     */
    public void setAdjacenyMatrix(int[][] matrixSize){
        adjacenyMatrix = matrixSize;
    }
    
    private void bfs(int source){
        int numberOfNodes = adjacenyMatrix[source].length - 1;
        
        int[] visted = new int[numberOfNodes + 1];
        int i, element;
        
        
    }
    
}
