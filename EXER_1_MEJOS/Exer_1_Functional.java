// **************************************************************
// File Name: Exer1_Functional.java
// Author: Jhon Vaneth Mejos
// Date: September 04 2025
// Deskripsyon: Nagpakita sa Functional Programming sa Java
//              gamit ang lambda expressions ug stream API.
// **************************************************************

import java.util.Arrays;    // Gamiton para sa Arrays.asList()
import java.util.List;      // Gamiton para sa List interface
import java.util.stream.Collectors;  // Para sa collect() method

public class Exer1_Functional {
    public static void main(String[] args) {
        // Dataset nga lista sa numero (user-defined)
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Functional style:
        // Deklarar lang unsay buhaton → pili ug even numbers unya i-square
        List<Integer> squaresOfEven = numbers.stream()
                .filter(n -> n % 2 == 0)   // kuha lang even numbers
                .map(n -> n * n)           // himuon ug square
                .collect(Collectors.toList()); // ibutang sa bag-ong lista

        // Output
        System.out.println("Squares sa mga even numbers (Functional): " + squaresOfEven);
    }
}

// ----------------------------
// SAMPLE OUTPUT
// ----------------------------
// Squares sa mga even numbers (Functional): [4, 16, 36, 64, 100]
//
// GENERAL COMMENT:
// Ang functional nga pamaagi kay mas concise ug expressive.
// Wala na magkinahanglan ug detalye sa loop, kay ang stream()
// maoy mubuhat sa proseso.
// ----------------------------
