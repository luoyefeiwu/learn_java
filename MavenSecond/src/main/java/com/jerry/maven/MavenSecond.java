package com.jerry.maven;

import com.jerry.maven.MavenFirst.MavenFirst;

public class MavenSecond {

	public String sayHello(String name) {
		MavenFirst first = new MavenFirst();
		return first.sayHello(name);
	}
}
