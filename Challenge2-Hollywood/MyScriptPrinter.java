/**
 * A program to print one actor's lines. 
 * See ScriptPrinter.txt for more information.
 * TODO: add your netid to the line below
 * @author donghan2
 */
public class MyScriptPrinter {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean output=false; //Set to true when we find the desired character
		String name=""; // Only print lines for this character
		
		TextIO.putln("Which character's lines would you like? (NEO,MORPHEUS,ORACLE)");
		name = TextIO.getln();

		TextIO.readFile("thematrix.txt"); // stop reading from the keyboard- use the script
		name = name.toUpperCase();
		//TODO: Print the name here (see ScriptPrinter.txt example output for format)
		TextIO.putln(name + "'s lines:");
		output = false; // initially don't print anything
		String line1 = "";
		// This loop will read one line at a time from the script until it
		// reaches the end of the file and then TextIO.eof() will return true.
		// eof means end-of-file
		while (false == TextIO.eof()) {
			String line = TextIO.getln(); // Read the next line
			//TODO: If it's a blank line set 'output' to false	
			line1 = line.trim();
			if (line1.equals(""))
				output = false;
			//TODO: Correct the output format (see ScriptPrinter.txt example output)
			
			//TODO: Re-order the three if statements so the output is correct			
			if (output == true)
				TextIO.putln(name + ":" + "\""+line1+"\""); // Only print the line if 'output' is true
			
			if (line1.indexOf(name) >= 0)
				output = true; // We found the character's name, time to start printing their lines
			
		}
		//TODO: Print 3 dashes here to indicate processing is complete
		TextIO.putln("---");
	}

}
