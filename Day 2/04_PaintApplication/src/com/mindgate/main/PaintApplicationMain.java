package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.ShapesFactory;
import com.mindgate.pojo.Shapes;

public class PaintApplicationMain {
	public static void main(String[] args) {
		System.out.println("");
		Scanner scanner = new Scanner(System.in);
		int choice;
		System.out.println();
		System.out.println(" 1. Circle");
		System.out.println(" 2. Triangle");
		System.out.println(" 3. Square");
		System.out.println("Enter your Choice");
		choice = scanner.nextInt();
		
		Shapes shapes = ShapesFactory.getShape(choice);
		//
		if(shapes != null) {
			shapes.draw();
			
		}
		else {
			System.out.println("invalid input");
		}
		
		
		
				
	}

}
