package lab7;
import java.io.File;

public class countFiles {
	public static void main(String[] args) {
		File Directory = new File("C:\\cs227\\project7\\src\\lab7\\");
		System.out.println(countFiles(Directory));
	}
	
	public static int countFiles(File f) {
		int count = 0;
		if(!f.isDirectory()) {
			return 1;
		}else {
			File[] files = f.listFiles();
			for(int i =0; i<files.length; i++) {
				count = countFiles(files[i]) + count;
			}
		}
		return count;
		
	}
}
