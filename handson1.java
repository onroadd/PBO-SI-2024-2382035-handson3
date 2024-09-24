public class handson1 {
    public static void main(String[] args){
        String[] buah = {"Apel", "pisang","mangga","jeruk"};
        //menggunakan perulangan for
        System.out.println("Menggunakan perulangan for:");
        for (int i = 0; i < buah.length; i++){
            System.out.println(buah[i]);
        }
        //menggunakan perulangan for-each
        System.out.println("\nMenggunakan perulangan for-each:");
        for (String item : buah){
            System.out.println(item);
        }
        //menggunakan perulangan while
        System.out.println("\nMenggunakan perulangan while:");
        int i = 0;
        while (i < buah.length){
            System.out.println(buah[i]);i++;
        }
        //menggunakan perulangan do-while
        System.out.println("\nMenggunakan perulangan do-wihle:");
        i = 0;
        do {
            System.out.println(buah[i]);i++;
        } while (i < buah.length);
    }
}