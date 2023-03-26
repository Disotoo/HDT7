import java.util.Comparator;


public class Comparador implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1 == o2) {
			return 0;
		} else {
			return 1;
		}
    }
    
}
