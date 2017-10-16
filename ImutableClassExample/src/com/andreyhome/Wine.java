package com.andreyhome;

public class Wine {
    final private double sizeofbottlewine;
    final private String nameofwine;

    public Wine(final double sizeofbottlewine, final String nameofwine) {
        this.sizeofbottlewine = sizeofbottlewine;
        this.nameofwine = nameofwine;
    }

    public static Wine createNewBottleWine(final double sizeofbottlewine, final String nameofwine) {
        return new Wine(sizeofbottlewine,nameofwine);
    }

    public double getSizeofbottlewine() {
        return sizeofbottlewine;
    }

    public String getNameofwine() {
        return nameofwine;
    }

    @Override
    public String toString() {
        return sizeofbottlewine +" - "+ nameofwine;
    }
}
