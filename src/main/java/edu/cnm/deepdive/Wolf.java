package edu.cnm.deepdive;

public class Wolf extends Canis {

  static {
    System.out.println("initializing Wolf class.");
  }
  {
    System.out.println("Performing common initialization of Wolf.");
  }

  public Wolf(int x) {
    System.out.println("When the wolf constructor completes the Wolf is ready.");
  }
  @Override
  public void hunt() {
    System.out.println("Wolves hunt in long-lasting packs for live prey.");
  }

  @Override
  public void vocalize() {

  }
}