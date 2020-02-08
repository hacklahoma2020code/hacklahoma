public class YetMoreBugs
{
    private void emptySynchronized()
    {
        synchronized (this)
        {
            // Forgot the implementation!
        }
    }

    private void sleepInSynchronized() throws InterruptedException
    {
        synchronized (this)
        {
            Thread.sleep(5000);
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        YetMoreBugs instance = new YetMoreBugs();
        instance.emptySynchronized();
        instance.sleepInSynchronized();
    }
}