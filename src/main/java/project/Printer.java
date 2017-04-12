package project;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Printer {
	
	private final Writer writer;

	public Printer(Writer writer) {
		this.writer = writer;
	}
	
	public void print(String... strings) throws IOException {
		writer.write(Arrays.stream(strings).collect(Collectors.joining(" ")));
	}
}
