package project;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Test;

public class PrinterTest {

	@Test
	public void shouldPrintArraySeparatedBySpaces() throws IOException {
		StringWriter writer = new StringWriter();
		new Printer(writer).print("Hello", "world!");
		
		assertThat(writer).hasToString("Hello world!");
	}
}
