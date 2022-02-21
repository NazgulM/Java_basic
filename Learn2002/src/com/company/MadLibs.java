package com.company;

public class MadLibs {
    /*
    This program generates a mad libbed story.
    Author: Nazgul
    Date: 20/02/2022
    */
    public static void main(String[] args){
        String name1 = "Chyngyz";
        String adjective1 = "kind";
        String adjective2 = "smart";
        String adjective3 = "beautiful";
        String verb1 = "run";
        String noun1 = "trend";
        String noun2 = " analysis";
        String noun3 = "price";
        String noun4 = "line";
        String noun5 = "series";
        String noun6 = "direction";
        String name2 = "Aruuke";
        int number = 23;
        String place1 = "New-York";







        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
        System.out.println(story);
    }
}
