package dsa;

public class Test {

	public static void main(String[] args) {
		QuickFindUF dsa = new QuickFindUF(10);
		union(dsa,1, 2);
		union(dsa,3, 4);
		union(dsa,5, 6);
		union(dsa,7, 8);
		union(dsa,9, 0);
		isConnected(dsa,1, 0);
		isConnected(dsa,5, 1);
		union(dsa,1, 9);
		isConnected(dsa,1, 0);
		union(dsa,5, 0);
		isConnected(dsa,1, 5);
		
	}
	
	public static void union(QuickFindUF dsa, int i, int j){
		System.out.println("Unioning "+i +" and " +j);
		dsa.union(i, j);
	}
	
	public static void isConnected(QuickFindUF dsa, int i, int j){
		System.out.println("is "+i +" and " +j+" connected? "+dsa.isConnected(i, j));
	}
	
}
