public class Car {

    private int price;
    private String model;
    private String marka;
    private String nomer;
    private String color;
    private int id;
    private int year;


    public Car(int price, String model, String marka, String nomer, String color, int id, int year) {
        this.price = price;
        this.model = model;
        this.marka = marka;
        this.nomer = nomer;
        this.color = color;
        this.id = id;
        this.year = year;
    }

    public Car() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car is " +
                "price=" + price +
                ", model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", nomer='" + nomer + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id +
                ", year=" + year +
                "\n";
    }
}
