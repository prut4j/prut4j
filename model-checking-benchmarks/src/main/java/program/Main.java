package program;

public class Main {
    public static void main(String[] args) {
        // Override args for testing purposes.
        var BTArgs = new String[]{"class=S", "-np2"};

        System.out.println("Executing original benchmark.");
        NPB.original.NPB3_0_JAV.BT.main(BTArgs);

        System.out.println("Executing update benchmark.");
        NPB.updated.NPB3_0_JAV.BT.main(BTArgs);
    }
}