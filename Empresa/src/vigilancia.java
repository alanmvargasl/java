
public class vigilancia extends Alucaps_Mexicana{

	static String departamento;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setNombre_de_empresa("Alucaps Mexicana SA de CV");
		System.out.println("Nombre de empresa: "+Nombre_de_empresa);
		setDepartamento("Vigilancia");
		System.out.println("Departamento: "+getDepartamento());
		
		pasar_inspeccion();
	}

	
	public static void pasar_inspeccion()
	{		
			System.out.println("Se ah revisado al personal");

	}
	
	public static String getDepartamento() {
		return departamento;
	}
	public static void setDepartamento(String departamento) {
		vigilancia.departamento = departamento;
	}
	
	
	
}
