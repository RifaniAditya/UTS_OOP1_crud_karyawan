import service.*;
import entity.*;
import java.util.*;

public class Aplikasi {

    private static KaryawanService service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new KaryawanService();
        scanner = new Scanner(System.in);

        int opsi = 5;
        do {
            showMenu();
            try {
                scanner = new Scanner(System.in);
                opsi = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.err.println("inputan salah, coba pilih sesuai menu");
                opsi = 0;
            } catch(NoSuchElementException nsee) {

            }
            prosesOpsi(opsi);
        } while(opsi != 5);
    }

    private static void prosesOpsi(int pilihan) {
        switch(pilihan) {
            case 1:
                showFormTambahData();
                break;
            case 2:
                showFormEditData();
                break;
            case 3:
                showDeleteData();
                break;
            case 4:
                service.showAllData();
                break;
            case 5:
                System.out.println("Terima Kasih");

        }
    }

    private static void showDeleteData() {
        scanner = new Scanner(System.in);
        System.out.println("\n-- Form Hapus Data --");
        System.out.print("ID : ");
        String id = scanner.nextLine();
        service.deleteData(id);
    }

    private static void showFormEditData() {
        scanner = new Scanner(System.in);
        String id, nama, jabatan, jenisKel;

        System.out.println("\n-- Form Ubah Data --");
        System.out.print("ID   : ");
        id = scanner.nextLine();
        System.out.print("NAMA : ");
        nama = scanner.nextLine();
        System.out.print("JABATAN : ");
        jabatan = scanner.nextLine();
        System.out.print("JENIS KELAMIN : ");
        jenisKel = scanner.nextLine();
        service.updateData(new Karyawan(id, nama, jabatan, jenisKel));
    }

    private static void showFormTambahData() {
        scanner = new Scanner(System.in);
        String id, nama, jabatan, jenisKel;

        System.out.println("\n-- Form Entry Data --");
        System.out.print("ID   : ");
        id = scanner.nextLine();
        System.out.print("NAMA : ");
        nama = scanner.nextLine();
        System.out.print("JABATAN : ");
        jabatan = scanner.nextLine();
        System.out.print("JENIS KELAMIN : ");
        jenisKel = scanner.nextLine();
        service.addData(new Karyawan(id, nama, jabatan, jenisKel));
    }

    private static void showMenu() {
        System.out.println("--- Aplikasi Data Karyawan ---");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. KELUAR");
        System.out.println("-------------------");
        System.out.print  ("pilihan > ");
    }

}