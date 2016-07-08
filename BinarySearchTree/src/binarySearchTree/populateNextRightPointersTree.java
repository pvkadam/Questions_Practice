package binarySearchTree;
import java.util.*;

/*
 * Given the following binary tree,

         1
       /  \
      2    3
     / \  / \
    4  5  6  7
After calling your function, the tree should look like:

         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \  / \
    4->5->6->7 -> NULL
 */

public class populateNextRightPointersTree {
public void connect(TreeLinkNode root) {
        
        ArrayList<TreeLinkNode> list = new ArrayList<TreeLinkNode>();
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        if(root == null)
        return;
        
        int currentLevelNum = 1;
        int nextLevelNum = 0;
        queue.offer(root);
        
        while(!queue.isEmpty()){
            TreeLinkNode node = queue.poll();
            currentLevelNum--;
            
            list.add(node);
            
            if(node.left != null){
                queue.offer(node.left);
                nextLevelNum++;
            }
            if(node.right != null){
                queue.offer(node.right);
                nextLevelNum++;
            }
            
            if(currentLevelNum == 0){
                currentLevelNum = nextLevelNum;
                nextLevelNum = 0;
                
                for(int i = 0; i < list.size()-1; i++){
                    list.get(i).next = list.get(i+1);
                }
                
                list = new ArrayList<TreeLinkNode>();
            }
        }
        
    }
}
