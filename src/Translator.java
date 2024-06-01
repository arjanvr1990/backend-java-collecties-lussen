import java.util.HashMap;
public class Translator {

    private HashMap<Integer, String> numericAlpha;


    public Translator(int[] alphabetic, String[] numeric) {
        numericAlpha = new HashMap<>();

        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(alphabetic[i], numeric[i]);
        }
    }

    public void printAllTranslations() {
        for (HashMap.Entry<Integer, String> entry : numericAlpha.entrySet()) {
            System.out.println("Sleutel: " + entry.getKey() + ", Waarde: " + entry.getValue());
        }

    }

    public String translate(Integer number) {
        return numericAlpha.get(number);
    }
}