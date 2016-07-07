/*
 * You are in an infinite 2D grid where you can move in any of the 8 directions :

 (x,y) to 
    (x+1, y), 
    (x - 1, y), 
    (x, y+1), 
    (x, y-1), 
    (x-1, y-1), 
    (x+1,y+1), 
    (x-1,y+1), 
    (x+1,y-1) 
You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.

Example :

Input : [(0, 0), (1, 1), (1, 2)]
Output : 2
It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).
 */

import java.util.*;
public class minimumStepsGrid {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        
        int numberOfSteps = 0;
        
        for (int i = 0; i < X.size() - 1; i++) {
            numberOfSteps = numberOfSteps + maxValue(xDifference(X.get(i), X.get(i+1)), yDifference(Y.get(i), Y.get(i+1)));
            
        }

        return numberOfSteps;
        
    }

    public int xDifference(int x1, int x2) {
        return Math.abs(x2 - x1);
    }   
    
    public int yDifference(int y1, int y2) {
        return Math.abs(y2-y1);
    }
    
    public int maxValue(int x, int y) {
        if (x > y) {
            return x;
        }
        
        return y;
    }
}
