/**
 * GuitarSpec
 */
public class GuitarSpec {

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.model = model;
        this.numStrings = numStrings;
    }

    private Builder builder;
    private Type type;
    private Wood backWood, topWood;
    private String model;
    private int numStrings;

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object obj) {
        var isEqual = false;
        var searchSpec = (GuitarSpec) obj;
        if (searchSpec.getBuilder() != getBuilder())
            return isEqual;
        String model = searchSpec.getModel().toLowerCase();
        if ((model != null) && (!model.equals("")) && (!model.equals(getModel().toLowerCase())))
            return isEqual;
        if (searchSpec.getType() != getType())
            return isEqual;
        if (searchSpec.getBackWood() != getBackWood())
            return isEqual;
        if (searchSpec.getTopWood() != getTopWood())
            return isEqual;
        if (searchSpec.getNumStrings() != getNumStrings())
            return isEqual;

        isEqual = true;
        return isEqual;
    }

    public int getNumStrings() {
        return numStrings;
    }
}