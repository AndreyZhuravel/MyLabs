package com.andreyhome;

public class Main {

    public static void main(String[] args) {

        String arr[] = {"abc"};
        try {
            arr[1] = "Ydshfshd";
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } finally {
            System.out.printf("Tesdhfh");
        }
    }
}
//        int[] arr1 = {1,2,3,4};
//        int[] arr2 = {1,2,3,4};
//        try{
//            int x = arr1[3];
//            int y = arr2[3];
//        }catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//        }
//        System.out.println("Program OK");
//    }

//	String a = "Abcde";
//	String b = "Cde";
//	for (int i=0; i <a.length();i++) {
//	    if (b.indexOf(a.charAt(i))==-1){
//            System.out.println(a.charAt(i));
//        }
//    }
//    }

