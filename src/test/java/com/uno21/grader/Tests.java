package com.uno21.grader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class Tests {

	@Test
	public void testSomething() {
		Assert.assertTrue("Debería dar verdadero", true);
	}

@Test
	public void testAsercionMal() {
		Assert.assertTrue("Debería dar falso", false);
	}

@Test
	public void testExcepcion() {
		throw new RuntimeException();
	}

//	@AfterClass
	public static void results() throws IOException {

		Writer out = new OutputStreamWriter(new FileOutputStream(
				"target/resultado-tests.txt"));
		out.write("120/200");
		out.close();

	}

}
