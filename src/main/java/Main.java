public class Main {
    private static int catCount = 0;

    public Main() {
        catCount++;
    }

    public static int getCatCount() {
        return catCount;

    }

    public static void setCatCount(int catCount) {
        Main.catCount = catCount;
    }

    public static void main(String[] args) {

    }
}
