package com.example.mascotas;

public class Pajaro extends Mascota{

  public Pajaro(String nombre, String raza, String color, String especie, String edad, String tamaño, String estadoSalud) {
    super(nombre, raza, color, especie, edad, tamaño, estadoSalud);
  }

  @Override
  public void hacerSonido() {
    System.out.println("pio");
  }

  @Override
  public void alimentar() {
    System.out.println("Comiendo semillas");
  }

  @Override
  public void cuidar() {
    System.out.println("Tenerle una jaula");
  }

}
