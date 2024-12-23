package lab1;

public class Pie extends Food{

    private String filling;

    public Pie(String filling){
        super("Пирог");
        this.filling = filling;
    }
    public void consume() {
        System.out.println(this + " съеден");
    }
    public String getSize() {
        return filling;
    }
    public void setSize(String size) {
        this.filling = size;
    }
    public String toString() {
        return super.toString() + " начинки '" + filling.toUpperCase() + "'";
    }
}
