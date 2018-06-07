import java.util.Arrays;
import java.util.Random;

public class Generator {

    public Generator() {
        cars= new Car [7];
    }

    Car [] cars;
    final Random random = new Random();

    @Override
    public String toString() {

        String  temp="";

        for (Car c : cars){

            temp+=c;
        }
        return "Generator" +temp;
    }

    int [] prices={2000, 50000, 7000, 6000, 45856, 12547, 9000};
   private String [] modeli={"08","Prado","x30","Priora","Caien","Rav4","Wauswai"};
    private String [] marki={"Lada", "Toyota", "Honda","Lada","Porche","Toyota","Nissan" };
    private String [] colors= {"red", "yellow", "white", "black", "green", "blue", "silver"};

public void generateCars (){
   // int price, String model, String marka, String nomer, String color, int id, int year)
    for (int i=0; i<7; i++){

        cars[i]= new Car (
                prices[i],
                modeli[i],
                marki[i],
                String.valueOf(random.nextInt(10000))+"Reg"+String.valueOf(random.nextInt(50)),
                colors[i],
                i+4,
                random.nextInt(2018)
                );
    }
}
}
