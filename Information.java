public class Information {
    public static void main(String[] args) {
        cpu c1 = new cpu();
        cpu.processor p1 = c1.new processor();
        cpu.RAM ram = c1.new RAM();
        System.out.println("Processor cache = " + p1.getcache());
        System.out.println("RAM clock speed = " + ram.getclockspeed());
    }
}
class cpu{
    double price;
    class processor{
        double cores;
        String manufacturer;
        double getcache(){
            return 4.3;
        }
    }
protected class RAM{
    double memory;
    String manufacturer;
    double getclockspeed(){
        return 5.5;
    }

}
}

