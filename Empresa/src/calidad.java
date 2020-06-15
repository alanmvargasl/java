
public class calidad extends Alucaps_Mexicana{

	static String departamento;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setNombre_de_empresa("Alucaps Mexicana SA de CV");
		System.out.println("Nombre de empresa: "+Nombre_de_empresa);
		setDepartamento("Calidad");
		System.out.println("Departamento: "+getDepartamento());
		
		verificar_calidad(true);
	}

	
	public static void verificar_calidad(boolean conforme)
	{
		if (conforme == true) 
				{
			System.out.println("La calidad de la tapa es Conforme");
				}
		else if (conforme == false)
		{
			System.out.println("La calidad de la tapa es Inconforme, sera rechazada");
		}
	}
	
	public static String getDepartamento() {
		return departamento;
	}
	public static void setDepartamento(String departamento) {
		calidad.departamento = departamento;
	}
	
	
	
}
