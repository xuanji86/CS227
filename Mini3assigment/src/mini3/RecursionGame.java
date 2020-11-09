package mini3;


import java.util.ArrayList;

/**
 * Implementation of a search for solutions to a number game inspired
 * by the game "twenty-four".
 */
public class RecursionGame
{
  /**
   * Lists all ways to obtain the given target number using arithmetic operations
   * on the values in the given IntExpression list.  Results in string form are added to 
   * the given result list, where the string form of a value is obtained from 
   * the toString() of the IntExpression object.
   * <p>
   * Special rules are: 
   * 1) you are not required to use all given numbers, and 
   * 2) division is integer division, and is only allowed when remainder is zero.  
   * For addition and multiplication, a + b and b + a are considered to be 
   * distinct solutions, and likewise a * b and b * a are considered as 
   * different solutions.  See the pdf for detailed examples.
   * @param list
   *   the values to be used in forming solutions
   * @param target
   *   the target number to be obtained from the values in the list
   * @param results
   *   list in which to place results, as strings
   */
  public static void findCombinations(ArrayList<IntExpression> list, int target, ArrayList<String> results)
  {
    if(list.size() == 1){
    		if(list.get(0).getIntValue() == target){
    		results.add(list.get(0).toString());
    		}
    }else {
    	for(int i = 0; i<list.size();i++) {
    		ArrayList<IntExpression> copyList = new ArrayList<IntExpression>(list);
    		copyList.remove(i);
    		findCombinations(copyList, target,results);
    	}
    	for(int j = 0; j<list.size();j++) {
    		for(int k = 0; k<list.size();k++) {
    			if(j == k) continue;
    			ArrayList<IntExpression> copyList1 = new ArrayList<IntExpression>(list);
    			IntExpression ie = new IntExpression(copyList1.get(j),copyList1.get(k),'+');
    			if(j>k) {
        			copyList1.remove(j);
        			copyList1.remove(k);
    			}else {
    				copyList1.remove(k);
    				copyList1.remove(j);
    			}
    			copyList1.add(ie);
    			findCombinations(copyList1, target,results);
    			ArrayList<IntExpression> copyList2 = new ArrayList<IntExpression>(list);
    			IntExpression ie2 = new IntExpression(copyList2.get(j),copyList2.get(k),'-');
    			if(j>k) {
        			copyList2.remove(j);
        			copyList2.remove(k);
    			}else {
    				copyList2.remove(k);
    				copyList2.remove(j);
    			}
    			copyList2.add(ie2);
    			findCombinations(copyList2, target,results);
    			ArrayList<IntExpression> copyList3 = new ArrayList<IntExpression>(list);
    			IntExpression ie3 = new IntExpression(copyList3.get(j),copyList3.get(k),'*');
    			if(j>k) {
        			copyList3.remove(j);
        			copyList3.remove(k);
    			}else {
    				copyList3.remove(k);
    				copyList3.remove(j);
    			}
    			copyList3.add(ie3);
    			findCombinations(copyList3, target,results);
    			ArrayList<IntExpression> copyList4 = new ArrayList<IntExpression>(list);
    			if(copyList4.get(k).getIntValue() != 0 && (copyList4.get(j).getIntValue() % copyList4.get(k).getIntValue() == 0)) { 
    				IntExpression ie4 = new IntExpression(copyList4.get(j),copyList4.get(k),'/');
    			
    			if(j>k) {
        			copyList4.remove(j);
        			copyList4.remove(k);
    			}else {
    				copyList4.remove(k);
    				copyList4.remove(j);
    			}
    			copyList4.add(ie4);
    			findCombinations(copyList4, target,results);
    			}
    			ArrayList<IntExpression> copyList5 = new ArrayList<IntExpression>(list);
    			IntExpression ie5 = new IntExpression(copyList5.get(k),copyList5.get(j),'+');
    			if(j>k) {
        			copyList5.remove(j);
        			copyList5.remove(k);
    			}else {
    				copyList5.remove(k);
    				copyList5.remove(j);
    			}
    			copyList5.add(ie5);
    			findCombinations(copyList5, target,results);
    			ArrayList<IntExpression> copyList6 = new ArrayList<IntExpression>(list);
    			IntExpression ie6 = new IntExpression(copyList6.get(k),copyList6.get(j),'-');
    			if(j>k) {
        			copyList6.remove(j);
        			copyList6.remove(k);
    			}else {
    				copyList6.remove(k);
    				copyList6.remove(j);
    			}
    			copyList6.add(ie6);
    			findCombinations(copyList6, target,results);
    			ArrayList<IntExpression> copyList7 = new ArrayList<IntExpression>(list);
    			IntExpression ie7 = new IntExpression(copyList7.get(k),copyList7.get(j),'*');
    			if(j>k) {
        			copyList7.remove(j);
        			copyList7.remove(k);
    			}else {
    				copyList7.remove(k);
    				copyList7.remove(j);
    			}
    			copyList7.add(ie7);
    			findCombinations(copyList7, target,results);
    			ArrayList<IntExpression> copyList8 = new ArrayList<IntExpression>(list);
    			if(copyList8.get(j).getIntValue() != 0 && (copyList8.get(k).getIntValue() % copyList8.get(j).getIntValue()) == 0) { 
    				IntExpression ie8 = new IntExpression(copyList8.get(k),copyList8.get(j),'/');
    			
    			if(j>k) {
        			copyList8.remove(j);
        			copyList8.remove(k);
    			}else {
    				copyList8.remove(k);
    				copyList8.remove(j);
    			}
    			copyList8.add(ie8);
    			findCombinations(copyList8, target,results);
    			}
    		}
    	}
    }
  } 


}