package com.example;

import com.example.mascotas.Gato;
import com.example.mascotas.Pajaro;
import com.example.mascotas.Perro;
import com.example.mascotas.Tortuga;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais", "Caniche", "Blanco", "Macho", "3", "Mediano", "Saludable");

        Gato gato = new Gato("Miau", "Persa", "Negro", "Hembra", "2", "Grande", "Saludable");

        Pajaro pajaro = new Pajaro("Pinguino", "Pinguino", "Gris", "Macho", "3", "Pequenio", "Saludable");

        Tortuga tortuga = new Tortuga("Tortuga", "Tortuga", "Verde", "Femenino", "3", "Grande", "Saludable");

        perro.alimentar();
        gato.hacerSonido();
        tortuga.cuidar();
        gato.alimentar();
        pajaro.mostrarInformacion();
    }
}