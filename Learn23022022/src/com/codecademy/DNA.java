package com.codecademy;

    public class DNA {
        public static void main(String[] args) {
            // organize some DNA
            String dna1 = "ATGCGATACGCTTGA";
            String dna2 = "ATGCGATACGTGA";
            String dna3 = "ATTAATATGTACTGA";
            String dna = dna3;
            System.out.println("Length of first DNA: " + dna.length());
            // Find the index where ATG begins using indexOf()
            int start = dna.indexOf("ATG");
            System.out.println("Start of index: " + start);
            int stop = dna.indexOf("TGA");
            System.out.println("End of the first dna: " + stop);
            if (start != -1 && stop != - 1 && (stop - start) % 3 ==0) {
                System.out.println("Conditions are satisfied");
                String protein = dna.substring(start, stop +3);
                System.out.println("Protein: " + protein);
            } else {
                System.out.println("No protein");



            }
        }
        }
