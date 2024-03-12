
public class genericsAddition<T extends Number> {
	private T num1;
	private T num2;
	public genericsAddition(T num1 ,T num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public T add() {
		if (num1 instanceof Integer) {
			return (T) Integer.valueOf(num1.intValue()+ num2.intValue());
		}
		else if (num1 instanceof Double) {
			return (T) Double.valueOf(num1.doubleValue()+ num2.doubleValue());
		}
		else if (num1 instanceof Float) {
			return (T) Float.valueOf(num1.floatValue()+ num2.floatValue());
		}
		else if (num1 instanceof Long) {
			return (T) Long.valueOf(num1.longValue()+ num2.longValue());
		}
		else {
			return null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericsAddition <Integer> iadd= new genericsAddition<>(5,10);
		System.out.println("Integer " + iadd.add());
		genericsAddition <Double> dadd= new genericsAddition<>(5.5,9.5);
		System.out.println("Double " + dadd.add());
		genericsAddition <Float> fadd= new genericsAddition<>(5.5f,9.5f);
		System.out.println("Float " + fadd.add());
		genericsAddition <Long> ladd= new genericsAddition<>(5l,10l);
		System.out.println("Long " + ladd.add());
	}

}
