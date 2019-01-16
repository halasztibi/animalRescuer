package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Pet dog = new Pet();


    dog.name = "Cooper";
    dog.age = 3;
    dog.health = 7;
    dog.hunger = 2;
    dog.mood = 6;

    Adopter owner = new Adopter();
    owner.name ="Andrei";
    owner.money= 120;

    Food food = new Food();
    food.name = "Omega";
    food.price = 40;
    food.cantity = 20;
    food.disponibility = true;


    Veterinary doc = new Veterinary();
    doc.name ="Paul";
    doc.specialization="pathologist";

        dog.resting(3);







    }}


