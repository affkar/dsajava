package dsa;

public class QuickFindUF {

	public int[] id;
	
	public QuickFindUF(int n) {
		id =new int[n];
		for (int i = 0; i < id.length; i++) {
			id[i]=i;
		}
	}
	
	public boolean isConnected(int p, int q){
		return id[p]==id[q];
	}
	
	public void union(int p, int q){
		if(!isConnected(p, q)){
			int temp=id[p];
			for (int i = 0; i < id.length; i++) {
				if(id[i]==temp){
					id[i]=id[q];
				}
			}
		}
	}
	
}
