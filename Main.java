public class Main {
    public static void main(String[] args) {
        StudentRegistration reg = new StudentRegistration();

        // Uji coba 1: Sukses
        try {
            System.out.println("--- Percobaan 1 (Data Valid) ---");
            reg.register("Budi", 20);
        } catch (InvalidNameException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Uji coba 2: Nama Kosong
        try {
            System.out.println("\n--- Percobaan 2 (Nama Kosong) ---");
            reg.register("", 21);
        } catch (InvalidNameException e) {
            System.err.println("Caught Exception: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.err.println("Caught Exception: " + e.getMessage());
        }

        // Uji coba 3: Umur di bawah 16
        try {
            System.out.println("\n--- Percobaan 3 (Umur < 16) ---");
            reg.register("Andi", 15);
        } catch (InvalidNameException e) {
            System.err.println("Caught Exception: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.err.println("Caught Exception: " + e.getMessage());
        }
    }
}