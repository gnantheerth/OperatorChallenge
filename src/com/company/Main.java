package com.company;

public class Main {

    public static void main(String[] args) {
	double FirstVariable= 20.00;
	double SecondVariable= 80.00;
	double ThirdVariable= (FirstVariable + SecondVariable)*100;
		System.out.println("my value totoal="+ThirdVariable);
	double FourthVaraiable= ThirdVariable % 40.00;
		System.out.println("the remainder="+FourthVaraiable);
	boolean iszero = (FourthVaraiable==0)? true:false;
		System.out.println("iszero="+ iszero);
	if (!iszero) {
		System.out.println("Got some remainder");
	}



    }
    }

