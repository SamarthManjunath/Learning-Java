module HelloWorld {
	//not part of the JDK
	requires java.desktop;
	requires helloworld;
	exports com.helloworld; //if you want a package to be available everywhere, then we can export it
}