
public class almacen extends Alucaps_Mexicana{

	static String departamento;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setNombre_de_empresa("Alucaps Mexicana SA de CV");
		System.out.println("Nombre de empresa: "+Nombre_de_empresa);
		setDepartamento("Almacen");
		System.out.println("Departamento: "+getDepartamento());
		
		ordenar();
	}

	
	public static void ordenar()
	{		
	
			System.out.println("Los palets estan ordenados!");

	}
	
	public static String getDepartamento() {
		return departamento;
	}
	public static void setDepartamento(String departamento) {
		almacen.departamento = departamento;
	}
	
	
	
}
