import controllers.Core;

public class Main
{
    public static void main(String[] args)
    {
        Core core = new Core();
        core.run();
        // Thread thread = new Thread(core);
        // thread.start();
    }
}
