public class ScaryBugs
{
    private String checkStrValue = null;

    // Constructor
    public ScaryBugs()
    {
        this.checkStrValue = "SomeValue";
    }

    // Execute some conditions
    private void executeSomeConditions()
    {
        if ("SomeValue".equalsIgnoreCase(this.checkStrValue))
        {
            // Condition 1
        } 
        else if ("SomeValue".equals(this.checkStrValue))
        {
            // Duplicate condition
        }
    }

    // the if statement has an issue
    private static void incorrectAssignmentInIfCondition()
    {
        boolean value = false;
        
        if (value = true)
        {
            // do Something
        } 
        else
        {
            // else Do Something
        }
    }

    // main
    public static void main(String[] args)
    {
        ScaryBugs instance = new ScaryBugs();
        instance.executeSomeConditions();
    }
}
