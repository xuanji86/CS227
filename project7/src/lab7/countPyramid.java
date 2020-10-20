package lab7;

public class countPyramid {
    public static void main(String[] args) {
        System.out.println(countPyramid(7));
    }
    
    public static int countPyramid(int n) {
    	if(n == 1) {
    		return n;
    	}else {
    		return (n * n)+ countPyramid(n-1);
    	}
    }
}
