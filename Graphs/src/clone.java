/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */

import java.util.*;
public class clone {

    HashMap<UndirectedGraphNode,UndirectedGraphNode> map;
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        map=new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
        return auxCloneGraph(node);
    }
    public UndirectedGraphNode auxCloneGraph(UndirectedGraphNode node){
        if(node==null)
            return node;
        if(map.containsKey(node)){
            return map.get(node);
        }
        UndirectedGraphNode clone=new UndirectedGraphNode(node.label);
        map.put(node,clone);
        for(UndirectedGraphNode neighbor : node.neighbors){
            clone.neighbors.add(auxCloneGraph(neighbor));
        }
        return clone;
    }
    
	public static long swapBits(long x, int i, int j) {
		
		if (((x >>> i) & 1) != ((x >>> j) & 1)) {	//shift x by i and j and AND with 1 to see if they are equal
			//flip bits using XOR and bitmask
			//XOR with 1 
			long bitMask = (1 << i) | (1 << j);	
			//System.out.println(bitMask);
			x ^= bitMask;	// 110 with bitmask of 1 at (0, 1)  -> 101
			//1010 with bitmask of 1 at (2,3) -->   0110
			//1010 with bitmask of 1 at (1,2) -->   1100 
		}
		System.out.println(x);
		return x; 
	}
	
	public static void main (String[] args) {
		swapBits(10, 1, 2);
		
	}
}
