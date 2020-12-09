package demo1.demo2.demo3;

public class Main {
    public static void main(String[] args) {
        Iphonex iphonex = new Iphonex("iphonex");
        Nokia nokia = new Nokia("nokia");
        Panasonic panasonic = new Panasonic("panasonic");
        SamsungNote samsungnote = new SamsungNote("samsung note");



        iphonex.printSmartphone();
        nokia.printSimbian();
        panasonic.printSimbian();
        samsungnote.printSmartphone();

    }

}
