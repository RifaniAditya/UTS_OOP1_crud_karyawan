package entity;

public class Karyawan{

    private String id;
    private String nama;
    private String jabatan;
    private String jenisKel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getjabatan () {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public String getJenisKel() {
        return jenisKel;
    }

    public void setJenisKel(String jenisKel) {
        this.jenisKel = jenisKel;
    }

    public Karyawan(String id, String nama, String jabatan, String jenisKel) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.jenisKel = jenisKel;
    }


    public boolean equals(Object object) {
        Karyawan temp = (Karyawan) object;
        return id.equals(temp.getId());
    }

}