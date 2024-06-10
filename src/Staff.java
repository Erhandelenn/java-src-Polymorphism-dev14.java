public class Staff extends Person {
    private String gorevAlani;

    public Staff(String isim, String soyisim, int yas, String kimlikNo, String gorevAlani) {
        super(isim, soyisim, yas, kimlikNo);
        this.gorevAlani = gorevAlani;
    }

    public String getGorevAlani() {
        return gorevAlani;
    }

    public void setGorevAlani(String gorevAlani) {
        this.gorevAlani = gorevAlani;
    }

    @Override
    public void yazdir() {
        System.out.println("Görevli: " + getIsim() + " " + getSoyisim() + ", Yaş: " + getYas() + ", Kimlik No: " + getKimlikNo() + ", Görev Alanı: " + getGorevAlani());
    }
}