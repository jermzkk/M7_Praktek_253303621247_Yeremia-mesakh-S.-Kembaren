public class StudentRegistration {
    public void register(String nama, int umur) throws InvalidNameException, InvalidAgeException {
        // Validasi Nama
        if (nama.isEmpty()) {
            throw new InvalidNameException("Nama tidak boleh kosong!");
        }

        // Validasi Umur
        if (umur < 16 || umur > 60) {
            throw new InvalidAgeException("Umur tidak memenuhi syarat Universitas!");
        }

        // Jika lolos validasi
        System.out.println("Pendaftaran Mahasiswa [" + nama + "] Berhasil!");
    }
}