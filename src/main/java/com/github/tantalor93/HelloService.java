package com.github.tantalor93;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {

	public String getHello() {
		return "hello";
	}
}