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
}
