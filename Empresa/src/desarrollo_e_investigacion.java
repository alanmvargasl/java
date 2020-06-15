
public class desarrollo_e_investigacion extends Alucaps_Mexicana{

	static String departamento;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setNombre_de_empresa("Alucaps Mexicana SA de CV");
		System.out.println("Nombre de empresa: "+Nombre_de_empresa);
		setDepartamento("Dessarollo E Investigacion");
		System.out.println("Departamento: "+getDepartamento());
		
		buscar_mejoras(true);
	}

	
	public static void buscar_mejoras(boolean conforme)
	{
		if (conforme == true) 
				{
			System.out.println("Se ah encontrado como aligerar el producto y usar menos material");
				}
		else if (conforme == false)
		{
			System.out.println("Seguimos investigando");
		}
	}
	
	public static String getDepartamento() {
		return departamento;
	}
	public static void setDepartamento(String departamento) {
		desarrollo_e_investigacion.departamento = departamento;
	}
	
	
	
}
