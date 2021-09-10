package org.launchcode.studio1;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = scanner.nextDouble();
        System.out.printf("The area of a circle of radius %s is: %s", radius, Circle.getArea(radius));
    }
}
