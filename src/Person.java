public abstract class Person {
    protected final String isim;
    protected final String soyisim;
    protected int yas;
    protected String kimlikNo;

    public Person(String isim, String soyisim, int yas, String kimlikNo) {
        if (isim == null || isim.isEmpty()) {
            throw new IllegalArgumentException("İsim boş veya null olamaz.");
        }
        if (soyisim == null || soyisim.isEmpty()) {
            throw new IllegalArgumentException("Soyisim boş veya null olamaz.");
        }
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.kimlikNo = kimlikNo;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public abstract void yazdir();
}