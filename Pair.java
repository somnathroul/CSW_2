public class Pair <K,V>{
	private K key;
	private V value;
	public Pair(K key,V value) {
		this.key=key;
		this.value=value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key=key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value=value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String,Integer> myPair= new Pair<>("example",42);
		System.out.println("Key: " + myPair.getKey()+ " "
				+ "Value: "+ myPair.getValue());
	}

}
