package edu.cnm.deepdive;

public class Wolf extends Canis {

  {
    System.out.println("Performing common initialization of Wolf.");
  }

  public Wolf() {
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