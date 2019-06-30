package ru.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    hello("test");
    hello("igoryan");

    double l = 5;
    System.out.println("Ploshad kvadrata so storonoi " + l + " = " + area(l));

    double a = 4;
    double b = 8;

    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a,b));
  }


  public static void hello(String somewhat) {

    System.out.println("Hello, " + somewhat + "!");

  }


  public static double area(double len) {
    return len*len;
  }

  public static double area(double a, double b) {
    return a*b;
  }
}