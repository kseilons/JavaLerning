import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class CheckFile {

	public static void main(String[] args) {
		
		try {
			int data = readByteFromFile();
			System.out.println(data);
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int readByteFromFile() throws IOException{
		try (InputStream in = new FileInputStream("src/text.txt")) {
			System.out.println("File is open");
			return in.read();
		}
	}
}
