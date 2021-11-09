package excercise1;
public class Programmer extends Pegawai{
    private int bonus;

    public Programmer(String nama, int gaji,int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public int getGaji() {
        return super.getGaji();
    }
    
}
