// **************************************************************
// File Name: Exer1_Declarative.java
// Author: Jason S. Salim
// Date: September 04 2025
// Deskripsyon: Nagpakita sa paggamit sa Declarative Programming
//              sa Java gamit ang stream() ug kondisyon.
// **************************************************************

import java.util.Arrays;  // Para makahimo og fixed nga lista
import java.util.List;    // Para sa List nga collection

public class Exer1_Declarative {
    public static void main(String[] args) {
        // Dataset nga naglangkob sa mga ngalan
        List<String> names = Arrays.asList("Cyril", "Jason", "Antonio", "Rever", "Oliver");

        // Declarative nga pamaagi:
        // "Unsay atong pangitaon?" → i-check kung adunay ngalan ≤ 3 ka letra
        boolean hasShortName = names.stream().anyMatch(name -> name.length() <= 3);

        // Resulta nga ipakita
        System.out.println("Aduna bay ngalan nga mubo (<=3 chars)? " + hasShortName);
    }
}

// ----------------------------
// SAMPLE OUTPUT
// ----------------------------
// Aduna bay ngalan nga mubo (<=3 chars)? false
//
// GENERAL COMMENT:
// Ang declarative nga approach nagtan-aw sa *unsa ang tuyo*
// imbes nga mag-focus sa detalye sa looping. 
// Ang stream().anyMatch() awtomatik nga mo-scan sa tanang elemento.
// ----------------------------
