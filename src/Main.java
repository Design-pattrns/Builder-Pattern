public class Main {

    public static void main(String[] args) {
        Computer c = new Computer
                .ComputerBulider("1TB","8GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .Builder();

        System.out.println(c);


    }
}
