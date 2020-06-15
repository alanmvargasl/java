
public class contabilidad extends Alucaps_Mexicana{

	static String departamento;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setNombre_de_empresa("Alucaps Mexicana SA de CV");
		System.out.println("Nombre de empresa: "+Nombre_de_empresa);
		setDepartamento("Contabilidad");
		System.out.println("Departamento: "+getDepartamento());
		
		sacar_reporte();
	}

	
	public static void sacar_reporte()
	{		
			System.out.println("Reporte del año hecho!");

	}
	
	public static String getDepartamento() {
		return departamento;
	}
	public static void setDepartamento(String departamento) {
		contabilidad.departamento = departamento;
	}
	
	
	
}
