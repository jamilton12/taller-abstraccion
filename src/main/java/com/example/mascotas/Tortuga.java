package com.example.mascotas;

public class Tortuga extends Mascota {

  public Tortuga(String nombre, String raza, String color, String especie, String edad, String tamaño, String estadoSalud) {
    super(nombre, raza, color, especie, edad, tamaño, estadoSalud);
  }

  @Override
  public void hacerSonido() {
    System.out.println("");
  }

  @Override
  public void alimentar() {
    System.out.println("Comiendo algas");
  }

  @Override
  public void cuidar() {
    System.out.println("Tenerle una estanque");
  }

  
}
