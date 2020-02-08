public class SomeBugs
{
    private String placeHolder = null;

    // Constructor
    public SomeBugs()
    {
        this.placeHolder = "Placeholder String";
    }

    // Getter
    private String getPlaceHolder()
    {
        return this.placeHolder;
    }

    @Override
    public boolean equals(Object obj)
    {
        SomeBugs object = (SomeBugs) obj;
        return this.getPlaceHolder().equals(object.getPlaceHolder());
    }
}