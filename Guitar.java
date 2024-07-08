public class Guitar extends StringInstrument {
    private String stringType;

    private static int maximumNumberOfGuitarStrings = 6;

    public Guitar() {
        super();
        stringType = "No Type Yet";
    }

    public void setStringType(String newStringType) {
        stringType = newStringType;
    }
    public String getStringType() {
        return stringType;
    }
    @Override
    public String toString() {
        return super.toString() + " String Type: " + stringType;
    }

    public static void increaseMaximumNumberOfGuitarStrings(int newMaximumNumberOfGuitarStrings) {
        if (newMaximumNumberOfGuitarStrings > maximumNumberOfGuitarStrings) {
            maximumNumberOfGuitarStrings = newMaximumNumberOfGuitarStrings;
        }
    }
    public static int getMaximumNumberOfGuitarStrings() {
        return maximumNumberOfGuitarStrings;
    }
}
