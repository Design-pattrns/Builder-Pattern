public class Computer {
    private String HDD,RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private String getHDD() {
        return HDD;
    }
    private String getRAM() {
        return RAM;
    }
    private boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }
    private boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    Computer(ComputerBulider bulider){
        this.HDD = bulider.HDD;
        this.RAM = bulider.RAM;
        this.isBluetoothEnabled = bulider.isBluetoothEnabled;
        this.isGraphicsCardEnabled = bulider.isGraphicsCardEnabled;
    }

    static class ComputerBulider{
        // required parameters
        private String HDD;
        private String RAM;

        // optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        ComputerBulider(String HDD,String RAM){
            this.RAM = RAM;
            this.HDD = HDD;
        }

        public ComputerBulider setGraphicsCardEnabled(Boolean isGraphicsCardEnabled){
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }
        public ComputerBulider setBluetoothEnabled(Boolean isBluetoothEnabled){
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer Builder(){
            return new Computer(this);
        }

    }
}
