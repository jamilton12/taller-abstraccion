package com.example.mascotas;

public class Perro extends Mascota {

  public Perro(String nombre, String raza, String color, String especie, String edad, String tamaño, String estadoSalud) {
    super(nombre, raza, color, especie, edad, tamaño, estadoSalud);
  }


  @Override
  public void hacerSonido() {
    System.out.println("Guau!");
  }

  @Override
  public void alimentar() {
    System.out.println("Comiendo alimento");
  }

  @Override
  public void cuidar() {
    System.out.println("Sacarlo a pasear");
  }
  
}
