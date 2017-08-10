import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Piramit p = new Piramit();
		Kure k = new Kure();
		Kup kp = new Kup();

		ArrayList<Object> liste = new ArrayList<Object>();
		liste.add(p);
		liste.add(k);
		liste.add(kp);
		for (int i = 0; i < liste.size(); i++) {
			Object o = liste.get(i);
			if (o instanceof Kure) {
				Kure o1 = (Kure) o; // Class casting
				o1.YuzeyAlaniHasapla();
			} else if (o instanceof Kup) {
				Kup o1 = (Kup) o;
				o1.YuzeyAlaniHasapla();
			} else if (o instanceof Piramit) {
				Piramit o1 = (Piramit) o;
				o1.YuzeyAlaniHasapla();
			}
		}

		System.out.println("Observer");
		ArrayList<Shape> observerList = new ArrayList<Shape>();
		observerList.add(p);
		observerList.add(k);
		observerList.add(kp);

		for (int i = 0; i < observerList.size(); i++) {
			Shape o = observerList.get(i);
			o.YuzeyAlaniHasapla();
		}

	}

}
