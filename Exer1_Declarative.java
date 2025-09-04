// **************************************************************
// File Name: Exer1_Declarative.java
// Author: Jhon Vaneth Mejos
// Date: September 04 2025
// Deskripsyon: Nagpakita sa Declarative Programming sa Java
//              gamit ang stream() ug kondisyon.
// **************************************************************

import java.util.Arrays;  // Para makabuhat og fixed list
import java.util.List;    // Para sa List nga collection

public class Exer1_Declarative {
    public static void main(String[] args) {
        // Dataset nga lista sa mga ngalan
        List<String> names = Arrays.asList("Anna", "Ben", "Carlo", "Diana", "Ella");

        // Declarative style:
        // "Unsay gusto nato?" → tan-aw kung naay ngalan ≤ 3 ka characters
        boolean hasShortName = names.stream().anyMatch(name -> name.length() <= 3);

        // Output
        System.out.println("Naay ngalan nga mubo (<=3 chars)? " + hasShortName);
    }
}

// ----------------------------
// SAMPLE OUTPUT
// ----------------------------
// Naay ngalan nga mubo (<=3 chars)? true
//
// GENERAL COMMENT:
// Ang declarative nga pamaagi kay focused sa *unsay resulta*
// dili unsaon pag-loop. Ang stream().anyMatch() automatic nga
// motan-aw sa tanang elemento.
// ----------------------------
