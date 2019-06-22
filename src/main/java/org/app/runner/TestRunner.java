package org.app.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {
public TestRunner() {
System.out.println("TestRunner.TestRunner()");
}
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("from runner");
		System.out.println(args.length);
	System.out.println(Arrays.asList(args));

	}

}
