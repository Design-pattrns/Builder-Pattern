public class Computer {
    private String HDD,RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private String getHDD() {
        return HDD;
    }
    public String getRAM() {
        return RAM;
    }
    private boolean getisGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }
    public boolean getisBluetoothEnabled() {
        return isBluetoothEnabled;
    }
    public String toString(){
        return "HDD:"+HDD+" RAM:"+RAM+" isBlutooth"+isBluetoothEnabled;
    }

    Computer(ComputerBulider buliders){
        this.HDD = buliders.HDD;
        this.RAM = buliders.RAM;
        this.isBluetoothEnabled = buliders.isBluetoothEnabled;
        this.isGraphicsCardEnabled = buliders.isGraphicsCardEnabled;
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

        ComputerBulider setGraphicsCardEnabled(Boolean isGraphicsCardEnabled){
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }
        ComputerBulider setBluetoothEnabled(Boolean isBluetoothEnabled){
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer Builder(){
            return new Computer(this);
        }

    }
}
