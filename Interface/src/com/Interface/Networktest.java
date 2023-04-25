package com.Interface;

public class Networktest {
 public static void main(String[] args) {
	network Airtel= new Airtel();
    network latha =new jio();
	Airtel.callrate();
	Airtel.Smsrate();
	Airtel.Smsdatarate();
	latha.callrate();
	latha.Smsrate();
	latha.Smsdatarate();
}
 
}

