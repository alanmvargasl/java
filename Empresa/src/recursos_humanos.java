
public class recursos_humanos extends Alucaps_Mexicana{
	static String departamento;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setNombre_de_empresa("Alucaps Mexicana SA de CV");
		System.out.println("Nombre de empresa: "+Nombre_de_empresa);
		setDepartamento("Recursos Humanos");
		System.out.println("Departamento: "+getDepartamento());
		
		contratar(3,"Informatica");
	}

	
	public static void contratar(int numero, String Profesion)
	{
		System.out.println("Se ha contratado a "+numero+" Elementos de Profesion "+Profesion);
	}
	
	public static String getDepartamento() {
		return departamento;
	}
	public static void setDepartamento(String departamento) {
		recursos_humanos.departamento = departamento;
	}
	
	
	
}
