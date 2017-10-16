package com.andreyhome;

/**
 * Represents model of telephone
 */

public class Phone {

    private String type; /* incapsulating type*/
    private String color; /* incapsulating color*/
    private String model; /* incapsulating model*/

    public String getType() { /* create get method which return type of phone - этот метод умеет возвращать инфо необходимого типа*/
        return type;
    }

    public void setType(String type) { /* create set method through which we write variable = type, void = пустота, этому методу не нужно что то возвращать */
        this.type = type;
    }

    public String getColor() { /* create get method which return color of phone*/
        return color;
    }

    public void setColor(String color) { /* create set method through which we write variable = color*/
        this.color = color;
    }

    public String getModel() { /* create get method which return model of phone*/
        return model;
    }

    public void setModel(String model) { /* create set method through which we write variable = model*/
        this.model = model;
    }

    public void call(final String ton) {
        System.out.println(ton);
    }

    public String getPrice(String color) {
        if (color.equals("red")){ /* please do not use "==" mask because String color and color="red" it's a different objects*/
            System.out.println("Case1");
            return "100";
        } else if (color.equals("green")){
            System.out.println("Case2");
            return "75";
        }else
        {System.out.println("Other case");
            return "50";
        }
    }
}

