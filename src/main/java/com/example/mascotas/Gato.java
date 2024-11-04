package com.example.mascotas;

public class Gato extends Mascota{

  public Gato(String nombre, String raza, String color, String especie, String edad, String tamaño, String estadoSalud) {
    super(nombre, raza, color, especie, edad, tamaño, estadoSalud);
  }

  @Override
  public void hacerSonido() {
    System.out.println("mau");
  }

  @Override
  public void alimentar() {
    System.out.println("Comiendo pescado");
  }

  @Override
  public void cuidar() {
    System.out.println("Tenerle jugetes");
  }

}
