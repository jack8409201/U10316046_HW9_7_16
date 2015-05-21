/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 7.16
 */
public class TestSort {
	//Main method
	public static void main(String[] args) {
		int[][] m = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		//Call sort method
		sort(m);
	}
	
	//Sort method to arrange m array
	public static void sort(int m[][]){
		
		//Using bubble sort to arrange m array first column 
		for (int i  = 0; i < m.length-1; i++){
			for(int j = 0; j <= m.length-2; j++){
				if(m[j][0] > m[j+1][0]){
					int temp = m[j][0];
					m[j][0] = m[j+1][0];
					m[j+1][0] = temp;
					
					temp = m[j][1];
					m[j][1] = m[j+1][1];
					m[j+1][1] = temp;
				}
			}
		}
		//Using bubble sort to arrange m array second column 
		for(int i = 0; i < m.length-1; i++){
			for(int j = 0; j <= m.length-2; j++){
				if(m[j][0] == m[j+1][0] && m[j][1] > m[j+1][1]){
					int temp = m[j][1];
					m[j][1] = m[j+1][1];
					m[j+1][1] = temp;
				}
			}
		}
		//Print m array
		for (int i  = 0; i < m.length; i++){
			System.out.println("{" + m[i][0] + "," + m[i][1] + "}");
		}
	}

}
