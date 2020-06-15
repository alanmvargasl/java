
public class ventas extends Alucaps_Mexicana{

	static String departamento;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setNombre_de_empresa("Alucaps Mexicana SA de CV");
		System.out.println("Nombre de empresa: "+Nombre_de_empresa);
		setDepartamento("Ventas");
		System.out.println("Departamento: "+getDepartamento());
		
		vender(10,"Pallets");
	}

	
	public static void vender(int numero,String tipo)
	{		
			System.out.println("Se han vendido :"+numero+" "+tipo);

	}
	
	public static String getDepartamento() {
		return departamento;
	}
	public static void setDepartamento(String departamento) {
		ventas.departamento = departamento;
	}
	
	
	
}
