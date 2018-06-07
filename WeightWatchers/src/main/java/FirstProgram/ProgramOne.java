package FirstProgram;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ProgramOne {
	
		
		final static String path = ClassLoader.getSystemResource("test.txt").getFile();
		static File file = new File(path);
		static Scanner sc = null;

		public static void main(String [] args) {

			if(doesFileExist(path)) {
			while(sc.hasNextLine()) {
				String [] str =sc.nextLine().split("[-|,]");
				for(int i =0; i<str.length; i++) {
					System.out.println(str[i].trim());
				}
			}
			} else {
				System.out.println("File Not Found!");
			}
		}

		private static Boolean doesFileExist(String path) {
			try {
				sc = new Scanner(file);
			} catch(FileNotFoundException e) {
				return false;
			}
			return true;
		}

	}

