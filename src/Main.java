import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> lines = Files.readAllLines(Paths.get("input.txt"));

        System.out.println(probing(Integer.parseInt(lines.get(1)), 
        		Integer.parseInt(lines.get(0)))); 
		
	}
    
	//Using DP do find the worst case of attempts to find the "bad day".
    static int probing(int n, int k) 
    { 
        //2D array to save all data used, so we don't have to recalculate.
        int array[][] = new int[n+1][k+1]; 
            
        //Base Case: if floor is 1 = 1 attempt. 
        for (int i = 1; i <= n; i++) 
        { 
        	array[i][1] = 1;      
        } 
           
        //Base Case: if given only 1 egg = have to loop all the floor.
        for (int i = 1; i <= k; i++) 
        {
        	array[1][i] = i; 
        }  
        
        //Recursion to fill up the 2D array.
        //Loop all probes.
        for (int i = 2; i <= n; i++) 
        { 
        	//Loop all floors.
            for (int j = 2; j <= k; j++) 
            { 
            	//Max_VALUE is just a place holder.
            	array[i][j] = Integer.MAX_VALUE; 
                for (int x = 1; x <= j; x++) 
                { 
                     int res = 1 + Math.max(array[i-1][x-1], array[i][j-x]); 
                     //Finding the worst case.
                     if (res < array[i][j]) 
                    	 array[i][j] = res; 
                } 
            } 
        } 
           
        //Answer is at the end of the table.
        return array[n][k]; 
  
    }

}
