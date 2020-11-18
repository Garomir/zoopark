package models;

import util.ValidateUtil;

public class Bird extends Animal {

    public Bird(String name, int age, double weight){
        super(name, age, weight);
        validate();
    }

    @Override
    public String toString() {
        return getName() + ": " +
        "Возраст: " + getAge() + ", Вес: " + getWeight();
    }

    public void validate() {
        StringBuilder builder = new StringBuilder();
        if (!ValidateUtil.isValidAge(getAge())){
            builder.append("Неверное значение возраста\n");
        }
        if (!ValidateUtil.isValidWeight(getWeight())){
            builder.append("Неверное значение веса\n");
        }
        if (!ValidateUtil.isValidName(getName())){
            builder.append("Неверное значение имени\n");
        }
        String message = builder.toString();
        if (message.length() > 0){
            message += "\b";
            throw new IllegalArgumentException(message);
        }
    }
}