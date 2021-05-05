package facade;

public class Main {

    public static void main(String[] args) {

        // normal
        MapData mapData = new MapData();
        PropertiesData propertiesData = new PropertiesData();
        System.out.println(mapData.getData(1,2,3,4,5));
        System.out.println(propertiesData.getData(1,2,3,4,5));

        // facade
        System.out.println(Facade.process(Type.MAP,1,2,3,4,5));
        System.out.println(Facade.process(Type.PROPERTIES,1,2,3,4,5));
    }
}
