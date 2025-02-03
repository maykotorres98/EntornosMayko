public class  Main{
	public class void main(String[] args){
		System.out.println("Hola mundo");
		mostrarFechaHora();
	}

	public static void mostrarFechaHora(){
		LocalDateTime  ahora = LocalDateTime.now();
		System.out.println("Fecha y hora actual: " + ahora);
	}

}

