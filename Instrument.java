public class Instrument extends Object {
    private String name;

    public Instrument() {
        super();
        name = "No Name Yet";
    }

    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Name: " + name;
    }
    public boolean equals(Object otherObject) {
        Instrument otherInstrument = (Instrument) otherObject;
        if ((otherObject != null && otherObject instanceof Instrument) && name.equals(otherInstrument.name)) {
            return true;
        }
        else {
            return false;
        }
    }
}
