package bakai;

class Language{

    protected String name;
    protected int numSpeakers;
    protected String regionSpoken;
    protected String wordOrder;

   // constructor
    Language (String name1, int numSpeakers1, String regionSpoken1,String wordOrder1) {
        this.name = name1;
        this.numSpeakers = numSpeakers1;
        this.regionSpoken = regionSpoken1;
        this.wordOrder = wordOrder1;
    }
        //methods

        public void getInfo() {

            System.out.println(this.name + " is spoken by "+ this.numSpeakers + " people mainly in " + regionSpoken);
            System.out.println("The language follows the word order: " + this.wordOrder);

        }


    public static void main(String[] args) {
        Language kyrgyz = new Language("Kyrgyz", 50000000,"Asia", "subject - object - verb");
        kyrgyz.getInfo();

        Language chontal = new Language("Chontal", 36810, "Mexico", "verb - object - subject" );
        chontal.getInfo();
        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 130000000, "Asia", "subject - verb - object");
        mandarin.getInfo();

        SinoTibetan burmese = new SinoTibetan("Burmese", 33000000, "Burma", "Subject - verb - object");
        burmese.getInfo();

    }

}