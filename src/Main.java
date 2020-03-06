import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> lines = Files.readAllLines(Paths.get("input.txt"));
		int fuckUpDay = 20;
		boolean flag = true;
		int numOfDays = Integer.parseInt(lines.get(0));
		int numOfProbes = Integer.parseInt(lines.get(1));
		
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		for(int i = 1 ; i<=216 ; i++)
		{
			minHeap.add(i);
		}
		
		System.out.println(minHeap.size());
		System.out.println(height(minHeap.size()));
	}
	static int height(int N) 
    { 
        return (int)Math.ceil(Math.log(N + 1) / Math.log(2)) - 1; 
    } 
}
