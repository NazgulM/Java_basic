package com.codecademy;

import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Sensiz Janym");
        desertIslandPlaylist.add("Armanym");
        desertIslandPlaylist.add("Sagynuu");
        desertIslandPlaylist.add("Nomad music");
        desertIslandPlaylist.add("Suyuunun keremeti");
        desertIslandPlaylist.add("Begimai");

        System.out.println(desertIslandPlaylist);

        System.out.println(desertIslandPlaylist.size());
        desertIslandPlaylist.remove(5);
        System.out.println(desertIslandPlaylist.size());
        System.out.println(desertIslandPlaylist);

        System.out.println(desertIslandPlaylist.indexOf(0));
        System.out.println(desertIslandPlaylist.indexOf(1));
    /*Get the indices of the songs you want to swap.
     Create a temporary variable to store the value of song a */
        int indexA = desertIslandPlaylist.indexOf("Sensiz Janym");
        int indexB = desertIslandPlaylist.indexOf("Armanym");

        String tempA = "Sensiz Janym";
        desertIslandPlaylist.set(indexA, "Armanym");
        System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.set(indexB, tempA);
        System.out.println(desertIslandPlaylist);

    }

}