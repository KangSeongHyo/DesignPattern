package facade;

public class Facade {

    public static String process(Type type,int ...keyArray){
        MapData mapData = new MapData();
        PropertiesData propertiesData = new PropertiesData();
        switch(type){
            case MAP:
                return mapData.getData(keyArray);
            case PROPERTIES:
                return propertiesData.getData(keyArray);
            default:
                return null;
        }
    }
}
