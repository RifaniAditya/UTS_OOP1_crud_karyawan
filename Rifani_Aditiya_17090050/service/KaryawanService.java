package service;

import java.util.*;
import entity.*;

public class KaryawanService {

    private static List<Karyawan> data = new LinkedList<Karyawan>();

    public void addData(Karyawan krw) {
        data.add(krw);
        System.out.println("Data telah tersimpan");
        System.out.println("--------------------");
    }

    public void updateData(Karyawan krw) {
        int index = data.indexOf(krw);
        if(index >= 0) {
            data.set(index, krw);
            System.out.println("Data telah berubah");
            System.out.println("--------------------");
        }
    }

    public void deleteData(String id) {
        int idx = data.indexOf(new Karyawan(id, "", "", ""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("Data telah terhapus");
            System.out.println("--------------------");
        }
    }

    public void showAllData() {
        int i=1;
        System.out.println("\nSemuan Data :");
        System.out.println("--------------------");
        for(Karyawan krw : data) {
            System.out.println("data ke-" + i++);
            System.out.println("  ID   : " + krw.getId());
            System.out.println("  NAMA : " + krw.getNama());
            System.out.println("  JAABATAN : " + krw.getjabatan());
            System.out.println("  JENIS KELAMIN : " + krw.getJenisKel());
        }
    }

}