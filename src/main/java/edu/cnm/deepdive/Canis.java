package edu.cnm.deepdive;

public abstract class Canis {

  private int numLegs;

  static {
    System.out.println("initialize Canis class.");
  }
  {
    initialize();

  }

  private void initialize() {
    System.out.println("initializing number of legs");
    numLegs = 4;

  }

  public abstract void hunt();

  public abstract void vocalize();

  public static void describe() {
    System.out.println("Canis is a genus of carnivorous animals of moderate size with well-developed dentition, long legs, and paws.");


    }

  }

