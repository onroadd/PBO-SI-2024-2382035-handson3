public class handson2 {
    public static void main(String[] args) {
        System.out.println("Menggunakan perulangan for:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\nMenggunakan perulangan while:");
        int i = 2;
        while (i <= 20) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println("\nMenggunakan perulangan do-while:");
        i = 2;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 20);
    }
}