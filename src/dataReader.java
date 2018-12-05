import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dataReader {
	File file;
	String currentLine;
	Scanner s;
	
	dataReader(String file){
		this.currentLine = "@";
		this.file = new File(file);
		try {
			this.s = new Scanner(this.file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		skipFluff();
	}
	
	private void skipFluff() {
		while(this.currentLine.trim().isEmpty() || this.currentLine.charAt(0) == '@' ) {
			this.currentLine = this.s.nextLine();
		}
	}
	
	public String[] getCurrentLineData() {
		return this.currentLine.split(",");
	}
	
	public void advanceLine() {
		this.currentLine = this.s.nextLine();
	}
}
