/* 
 * @Author:Sushant
 */
package com.student;
public class Explicit {
	public static void main(String[] args) {
	double d = 100.104;  
        long l = (long)d; //explicit type casting  
        int i = (int)l;  
        System.out.println("Double value "+d); 
        System.out.printsln("Long value "+l);  //fractional part lost here
        System.out.println("Int value "+i);  //fractional part lost here
	}
}
