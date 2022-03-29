package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static String scanner;

    public static void wyswietlList(List<Integer> list) {
        System.out.println(list);
    }

    public static Integer najwiekszyElement(List<Integer> list) {
        Integer max = Collections.max(list);
        return max;
    }

    public static List<Integer> nameIndex(List<String> list, String name) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == name) {
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> reverseList(List<Integer> list) {
//        Collections.reverse(list);
        // ręcznie to napisać
        return list;
    }

    public static void listaBezListy(List<Integer> toReverse) {
        for(int i = toReverse.size() - 1; i >= 0; i --){
            System.out.print(toReverse.get(i) + " ");
       }
        System.out.println();
    }

    public static List<Integer> toSort(List<Integer> list, String sortOrder) {
        if (sortOrder.equals("asc")) {
            Collections.sort(list);
        } else if(sortOrder.equals("dsc")) {
            Collections.sort(list, Collections.reverseOrder());
        } else {
            System.out.println("Invalid input");
        }

        return list;
    }

    public static void imiona (List<String> list) {
        int vowels = 0;
        for(int j = 0; j < list.size(); j++) {
            vowels = 0;
            String name = list.get(j);
            for(int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                    ++vowels;
                }
            }

            System.out.println(name + " " + vowels);
        }
    }


    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3);

        wyswietlList(integerList);

        System.out.println(najwiekszyElement(integerList));

        List<String> indeksyElementow = new ArrayList<>();
        indeksyElementow.add("Ania");
        indeksyElementow.add("Krzys");

        indeksyElementow.add("Ania");
        indeksyElementow.add("Piotr");
        indeksyElementow.add("Tomek");
        indeksyElementow.add("Ania");
        indeksyElementow.add("Ania");
        indeksyElementow.add("Ania");
        indeksyElementow.add("Ania");

        System.out.println("123123123" + nameIndex(indeksyElementow, "Ania"));

        List<Integer> toReverse = new ArrayList<>();
        toReverse.add(1);
        toReverse.add(2);
        toReverse.add(3);
        toReverse.add(4);
        toReverse.add(5);
        toReverse.add(6);

        System.out.println(reverseList(toReverse));

        List<Integer> doOdwrocenia = new ArrayList<>();
        doOdwrocenia.add(1);
        doOdwrocenia.add(2);
        doOdwrocenia.add(3);
        doOdwrocenia.add(4);
        doOdwrocenia.add(5);

        listaBezListy(doOdwrocenia);

        String asc = "Ascending";
        String des = "Descending";

         List<Integer> ascendingDescending = new ArrayList<>();
        ascendingDescending.add(6);
        ascendingDescending.add(2);
        ascendingDescending.add(13);
        ascendingDescending.add(44);
        ascendingDescending.add(5);
        ascendingDescending.add(6);

        List<Integer> integerListToSort = toSort(ascendingDescending, "asc");

        System.out.println(integerList);

        List<String> listaImion = new ArrayList<>();
        listaImion.add("Tomek");
        listaImion.add("Szymon");
        listaImion.add("Fryderyk");
        listaImion.add("Mateusz");
        listaImion.add("Wojciech");

        imiona(listaImion);
    }
}

/*
Zad 1.
Napisz kod ktory wyswietli liste na ekran

Zad 2.
Napisz metoda ktora zwroci najwiekszy element lsity

Zadanka domowe!

Zad 1.
Napisz metode ktora przyjmuje liste Stringow i zwraca liste (intow) indeksow wszystkich elementow na liscie, które takie same
jak parametr metody np dla Listy Ania Krzys Ania Piotr Tomek Ania i imienia Ania output to 0,2,5

Zad 2.
Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako parametr

Zad 3.
Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako parametr, metoda ma odwrocic liste,
nie ma nic zwracac, nie mozna wykorzystywac innych list/tablic.

Zad 4.
Napisz metode ktora sortuje kolekcje malejaco lub rosnaco od drugiego parametru( jesli podam string 'Ascending" to rosnaco,
jesli "Descending" to malejaco)

Zad 5.
Napisz metode ktora wyswietla ile razy we wsztstkich imionach podanych w kolekcji stringow byla uzyta samogloska

Zad 6.
Napisz metode ktora przyjmuje jako parametr
 Stringow i oblicza sume dlugosci wszystkich Stringow.
 */