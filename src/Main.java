import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> lines = Files.readAllLines(Paths.get("input.txt"));
		int fuckUpDay = 20;
		boolean flag = true;
		int numOfDays = Integer.parseInt(lines.get(0));
		int numOfProbes = Integer.parseInt(lines.get(1));
//		while(flag)
//		{	
//			
//			if(numOfProbes==1)
//			{
//				break;
//			}
//		}

	}

}
