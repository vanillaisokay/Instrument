public class StringInstrument extends Instrument {
    private int numberOfStrings;
    private String[] stringArray;

    private static int maximumNumberOfStrings = 4;

    public StringInstrument() {
        super();
        numberOfStrings = 0;
        stringArray = new String[maximumNumberOfStrings];
    }

    public void addString(String newString) {
        if (numberOfStrings < stringArray.length) {
            stringArray[numberOfStrings] = newString;
            numberOfStrings++;
        }
    }
    public String getStrings() {
        String string = "";
        for (int i = 0; i < numberOfStrings; i++) {
            string += stringArray[i];
            if (i < numberOfStrings - 1) {
                string += ", ";
            }
        }
        return string;
    }
    @Override
    public String toString() {
        return super.toString() + "Strings: " + getStrings();
    }

    public static void increaseMaximumNumberOfStrings(int newMaximumNumberOfStrings) {
        if (newMaximumNumberOfStrings > maximumNumberOfStrings) {
            maximumNumberOfStrings = newMaximumNumberOfStrings;
        }
    }
    public static int getMaximumNumberOfStrings() {
        return maximumNumberOfStrings;
    }
}
