public class SmartphoneBuilder {
    public SmartphoneType buildAppleSmartphone() {
        SmartphoneType type = new SmartphoneType();
        type.addSmartphone(new Apple());
        return type;
    }

    public SmartphoneType buildSamsungSmartphone() {
        SmartphoneType type = new SmartphoneType();
        type.addSmartphone(new Samsung());
        return type;
    }
}