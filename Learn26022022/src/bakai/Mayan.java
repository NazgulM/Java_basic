package bakai;

class Mayan extends Language {

    Mayan(String name1, int numSpeakers1) {
        super(name1, numSpeakers1, " Central America", "verb-object-subject");
    }
        @Override
        public void getInfo() {

            System.out.println(this.name + " is spoken by "+ this.numSpeakers + " people mainly in " + regionSpoken);
            System.out.println("The language follows the word order: " + this.wordOrder);
            System.out.println("Fun fact: " + this.name + "is an ergative language");

        }

    }
