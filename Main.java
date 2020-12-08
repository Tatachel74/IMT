import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate (85F, 1.75F);
        DecimalFormat df = new DecimalFormat ( "#.#");
        System.out.println(df.format(bmi));
    }
}

