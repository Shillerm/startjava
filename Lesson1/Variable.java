public class Variable {
	
	public static void main(String[] args) {		
		byte core = 4;
		short ram = 16;
		int keyboard = 105;
		long videoCard = 2048;
		float cpuSpeed = 3.174f;
		double monitor = 17.3; 	
		char os = 'w';
		boolean res = true;
	
		System.out.println("Количество ядер процессора = " + core);
		System.out.println("Количество оперативной памяти = " + ram);
		System.out.println("Количество клавиш на клавиатуре = " + keyboard);
		System.out.println("Видеопамять = " + videoCard);
		System.out.println("Тактовая частота процессора = " + cpuSpeed);
		System.out.println("Диагональ монитора = " + monitor);
		System.out.println("ОС = " + os);
		System.out.println("Да = " + res);
	}
}