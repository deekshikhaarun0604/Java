
class Pair<K, V> {
    private K key;
    private V value;

    
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    
    public void display() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

public class PairDemo {
    public static void main(String[] args) {

        
        Pair<String, Integer> agePair = new Pair<>("Age", 25);
        agePair.display();

        
        Pair<String, String> countryPair = new Pair<>("Country", "Japan");
        countryPair.display();
    }
}
