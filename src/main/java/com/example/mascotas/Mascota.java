package com.example.mascotas;

public abstract class Mascota  {

  protected String nombre;
  protected String raza;
  protected String color;
  protected String especie;
  protected String edad;
  protected String Tamaño;
  protected String estadoSalud;

  public Mascota(String nombre, String raza, String color, String especie, String edad, String tamaño,
      String estadoSalud) {
    this.nombre = nombre;
    this.raza = raza;
    this.color = color;
    this.especie = especie;
    this.edad = edad;
    Tamaño = tamaño;
    this.estadoSalud = estadoSalud;
  }

  public abstract void hacerSonido() ;

  public abstract void alimentar() ;

  public abstract void cuidar();

  public void mostrarInformacion(){
    System.out.println("Nombre: "+ nombre);
    System.out.println("Raza: "+ raza);
    System.out.println("Color: "+ color);
    System.out.println("Especie: "+ especie);
    System.out.println("Edad: "+ edad);
    System.out.println("Tamaño: "+ Tamaño);
    System.out.println("Estado de Salud: "+ estadoSalud);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getEspecie() {
    return especie;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public String getEdad() {
    return edad;
  }

  public void setEdad(String edad) {
    this.edad = edad;
  }

  public String getTamaño() {
    return Tamaño;
  }

  public void setTamaño(String tamaño) {
    Tamaño = tamaño;
  }

  public String getEstadoSalud() {
    return estadoSalud;
  }

  public void setEstadoSalud(String estadoSalud) {
    this.estadoSalud = estadoSalud;
  }

  
}
