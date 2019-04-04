package pack1;


    
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntryKeySetValuesExample {
    public static void main(String[] args) {
        Map<Integer, String> countryISOCodeMapping = new HashMap<>();

        countryISOCodeMapping.put(9, "IN");
        countryISOCodeMapping.put(78, "US");
        countryISOCodeMapping.put(5, "RU");
        countryISOCodeMapping.put(567, "JP");
        countryISOCodeMapping.put(98, "CN");

        // HashMap's entry set
        Set<Map.Entry<Integer, String>> countryISOCodeEntries = countryISOCodeMapping.entrySet();
        System.out.println("countryISOCode entries : " + countryISOCodeEntries);

        // HashMap's key set
        Set<Integer> countries = countryISOCodeMapping.keySet();
        System.out.println("countries : " + countries);

        // HashMap's values
        Collection<String> isoCodes = countryISOCodeMapping.values();
        System.out.println("isoCodes : " + isoCodes);
        System.out.println(countryISOCodeMapping.get(9));
    }
}
