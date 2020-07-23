package setters_getters;

public class Disease {
    private String name;
    private boolean curable;

    public Disease(String title, boolean isCurable) {
        this.name = title;
        this.curable = isCurable;
    }

     String getName() {
        return this.name;
    }

     boolean isCurable() {
        return this.curable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurable(boolean curable) {
        this.curable = curable;
    }
}
