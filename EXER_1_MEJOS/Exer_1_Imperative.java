// **************************************************************
// File Name: Exer1_Imperative.java
// Author: Jhon Vaneth Mejos
// Date: September 04 2025
// Deskripsyon: Nagpakita sa Imperative Programming sa Java
//              gamit ang loop ug manual nga proseso.
// **************************************************************

import java.util.ArrayList; // Para makabuhat og dynamic list
import java.util.List;      // Para sa List nga collection

public class Exer1_Imperative {
    public static void main(String[] args) {
        // Himuon og lista sa numero 1 hangtod 10
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);  // gi-add isa-isa ang numero
        }

        // Imperative style:
        // Step-by-step nga pagpili sa even numbers
        List<Integer> evenNumbers = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 == 0) {
                evenNumbers.add(n);  // i-store kung even
            }
        }

        // Output
        System.out.println("Even numbers (Imperative): " + evenNumbers);
    }
}

// ----------------------------
// SAMPLE OUTPUT
// ----------------------------
// Even numbers (Imperative): [2, 4, 6, 8, 10]
//
// GENERAL COMMENT:
// Ang imperative nga pamaagi kay mas detalyado, kinahanglan pa
// ug loop ug kondisyon para makuha ang resulta. Ikaw gyud ang
// nagsugo step-by-step unsay buhaton sa computer.
// ----------------------------
