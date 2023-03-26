public class Extraer<String, V> implements IGetKey<String, V> {

    @Override
    public String getKeyFromValue(V value) {
        return (String) ((Asociacion)value).getIdiomaOri();
    }

    
}
