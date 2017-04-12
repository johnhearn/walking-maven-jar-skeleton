package project;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Main entry point to the application.
 */
public class App {
	
	private static final PrintWriter WRITER = new PrintWriter(System.out);
	private static Printer printer = new Printer(WRITER);

	public static void main(String[] args) throws IOException {
		if (args.length < 1) {
			System.out.println("Usage: java -jar project.jar");
		} else {
			printer.print(args);
		}
		WRITER.flush();
	}

}
