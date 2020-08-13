package com.lambda.practice;

public class SupplierMain {
	//lambda expression
	public static void main(String[] args) {
		//supplier interface implementation of test() method
		Supplier supplier = () -> {
			return 10;
		};
		//testcase
		int result = supplier.test();
		System.out.println(result);
	}

}
