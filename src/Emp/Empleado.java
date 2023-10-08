package Emp;

public class Empleado {

	public enum TipoEpmpleado{Vendedor,Encargado,Otro};
	
	public static float calculoNominaBruta(TipoEpmpleado tipo, float ventasMes, float horasExtra) {
		float salario=0;
		if(tipo==TipoEpmpleado.Vendedor) {
			salario=2000;
		}else if(tipo==TipoEpmpleado.Encargado){
			salario=2500;
		}
		if(ventasMes>=1000 && ventasMes<1500) {
			salario+=100;
		}else if(ventasMes>=1500) {
			salario+=200;
		}
		if(horasExtra<0)
			horasExtra=0;
		
		return salario+30*horasExtra;
	}
	public static float calculoNominaNeta(float nominaBruta) {
		float retencion=0;
		if(nominaBruta>=2100 && nominaBruta<2500){
			retencion=0.15f; 
		}else if(nominaBruta>=2500) {
			retencion=0.18f;
		}
		return nominaBruta*(1-retencion);
	}
}
