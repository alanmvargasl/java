
public class Alucaps_Mexicana {
	static String Nombre_de_empresa;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setNombre_de_empresa("Alucaps Mexicana SA de CV");
		System.out.println(getNombre_de_empresa());
		fabricar(1000,"Plastico");
	}
	
	
	public static void fabricar(int cantidad, String tipo)
	{
		System.out.println("Se fabricaron "+cantidad+" tapas de "+tipo);
	}
	
	public static String getNombre_de_empresa() {
		return Nombre_de_empresa;
	}
	
	public static void setNombre_de_empresa(String nombre_de_empresa) {
		Nombre_de_empresa = nombre_de_empresa;
	}

	
	
}
