import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int math,physics, turkish, chemistry, music, total = 0, average, count=0;

		System.out.print("Matematik: ");
		math = inp.nextInt();
		if ( math>=0 && math<=100 ){total+=math;count++;}
		System.out.print("Fizik: ");
		physics = inp.nextInt();
		if ( physics>=0 && physics<=100 ){total+=physics;count++;}
		System.out.print("Türkçe: ");
		turkish = inp.nextInt();
		if ( turkish>=0 && turkish<=100 ){total+=turkish;count++;}
		System.out.print("Kimya: ");
		chemistry = inp.nextInt();
		if ( chemistry>=0 && chemistry<=100 ){total+=chemistry;count++;}
		System.out.print("Müzik: ");
		music = inp.nextInt();
		if ( music>=0 && music<=100 ){total+=music;count++;}
		if (count!=0) {
			average = total / count;
			if (average >= 55) {
				System.out.println("Ortalamanız: " + average + "\n" + "Geçtiniz.");
			} else {
				System.out.println("Ortalamanız: " + average + "\n" + "Kaldınız.");
			}
		} else {
			System.out.println("En az bir dersi 0-100 arasında girmelisiniz.");
		}
	}
}
