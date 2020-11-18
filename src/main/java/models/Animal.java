package models;

abstract class Animal {
    
    private String name;
    private double weight;
    private int age;

    Animal(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    String getName() {
        return name;
    }

    double getWeight() {
        return weight;
    }

    int getAge() {
        return age;
    }
}
