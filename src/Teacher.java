public class Teacher extends Person {
    private String[] dersler;
    private String bolum;

    public Teacher(String isim, String soyisim, int yas, String kimlikNo, String[] dersler, String bolum) {
        super(isim, soyisim, yas, kimlikNo);
        this.dersler = dersler;
        this.bolum = bolum;
    }

    public String[] getDersler() {
        return dersler;
    }

    public void setDersler(String[] dersler) {
        this.dersler = dersler;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public void yazdir() {
        System.out.print("Öğretmen: " + getIsim() + " " + getSoyisim() + ", Yaş: " + getYas() + ", Kimlik No: " + getKimlikNo() + ", Bölüm: " + getBolum() + ", Verdiği Dersler: ");
        for (String ders : dersler) {
            System.out.print(ders + " ");
        }
        System.out.println();
    }
}