package org.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAppStarter {
	public MyAppStarter() {
	System.out.println("MyAppStarter.MyAppStarter()");
	}

	public static void main(String[] args) {
				SpringApplication.run(MyAppStarter.class,args);
	}
}
