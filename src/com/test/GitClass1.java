package com.test;

public class GitClass1 {
private void course() {
	// TODO Auto-generated method stub
System.out.println("Java");
}
private void login() {
	System.out.println("login done by story1");
}

private void productAdd() {
	System.out.println("product addition done by story 2");
}
private void addToCart() {
	System.out.println("cart added by story3");
}

public static void main(String[] args) {
	GitClass1 g = new GitClass1();
	g.course();
	g.productAdd();
	g.login();
	g.addToCart();
}
}
