public class BuilderDemo {
    public static void main(String[] args) {
        SmartphoneBuilder builder = new SmartphoneBuilder();

        SmartphoneType appleSmartphone = builder.buildAppleSmartphone();
        System.out.println("Apple Smartphone Configuration:");
        appleSmartphone.showSmartphones();

        SmartphoneType samsungSmartphone = builder.buildSamsungSmartphone();
        System.out.println("Samsung Smartphone Configuration:");
        samsungSmartphone.showSmartphones();
    }
}