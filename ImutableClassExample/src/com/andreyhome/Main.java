package com.andreyhome;

public class Main {

    public static void main(String[] args)

        {
        // Создадим испанское вино :)
        Wine spanishwine = Wine.createNewBottleWine(0.7,"La Gran Reserva");
        System.out.println(spanishwine);

        // Попытаемся изменить испанское вино :)
        mixNewWine(spanishwine.getSizeofbottlewine(),spanishwine.getNameofwine());
        System.out.println(spanishwine);
        }


    private static void mixNewWine(double sizeofbottlewine, String nameofwine)
       {
           sizeofbottlewine = 1.0;
           nameofwine = "De La Von Mio";
        }
}
