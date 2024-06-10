

public class Student extends Person {
    private double notOrtalamasi;

    public Student(String isim, String soyisim, int yas, String kimlikNo, double notOrtalamasi) {
        super(isim, soyisim, yas, kimlikNo);
        this.notOrtalamasi = notOrtalamasi;
    }

    public double getNotOrtalamasi() {
        return notOrtalamasi;
    }

    public void setNotOrtalamasi(double notOrtalamasi) {
        this.notOrtalamasi = notOrtalamasi;
    }

    @Override
    public void yazdir() {
        System.out.println("Öğrenci: " + getIsim() + " " + getSoyisim() + ", Yaş: " + getYas() + ", Kimlik No: " + getKimlikNo() + ", Not Ortalaması: " + getNotOrtalamasi());
    }
}