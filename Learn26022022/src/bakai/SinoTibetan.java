package bakai;

class SinoTibetan extends Language {

    SinoTibetan(String name1, int numSpeakers1) {
        super(name1, numSpeakers1, "Asia", "subject - object - verb");
        if (name1.contains("Chinese")) {
            this.wordOrder = "subject - verb - object";
        }
    }

    public SinoTibetan(String mandarin_chinese, int numSpeakers1, String asia, String s) {
        super(mandarin_chinese, numSpeakers1, "Asia", "subject -object - verb");
    }
}