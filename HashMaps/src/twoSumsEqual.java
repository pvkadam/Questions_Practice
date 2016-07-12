import java.util.*;

public class twoSumsEqual {
    public ArrayList<Integer> equal(ArrayList<Integer> a) {
        ArrayList<Integer> result = null;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        
        for (int i = 0; i < a.size(); i++) {
            for (int j = i+1; j < a.size(); j++) {
                int sum = a.get(i) + a.get(j);
                
                if (map.containsKey(sum)) {
                    ArrayList<Integer> pair = map.get(sum);
                    if (pair.get(0) != i && pair.get(1) != j && pair.get(0) != j && pair.get(1) != i) {
                            ArrayList<Integer> temp = new ArrayList<Integer>();
                            temp.add(pair.get(0));
                            temp.add(pair.get(1));
                            temp.add(i);
                            temp.add(j);
                            
                            if (result == null) {
                            	result = temp;
                            }
                            
                            else {
                                for (int k = 0; k < 4; k++) {
                                    if (result.get(k) < temp.get(k)){
                                        break;
                                    } 
                                    
                                    else if (result.get(k) > temp.get(k)) {
                                        result = temp;
                                        break;
                                    }
                                }
                            }
                            
                        }
                } 
                
                else {
                    ArrayList<Integer> pair = new ArrayList<Integer>();
                    pair.add(i);
                    pair.add(j);
                    map.put(sum, pair);
                }
            }
        }
        
        return result;
    }
}
