package Emp;

public class Empleado {

	public enum TipoEpmpleado{Vendedor,Encargado};
	
	public float calculoNominaBruta(TipoEpmpleado tipo, float ventasMes, float horasExtra) {
		float salario;
		if(tipo==TipoEpmpleado.Vendedor) {
			salario=2000;
		}else {
			salario=2000;
		}
		if(ventasMes>=1000 && ventasMes<1500) {
			salario+=100;
		}else if(ventasMes>=1500) {
			salario+=200;
		}
		return salario+30*horasExtra;
	}
	public float calculoNominaNeta(float nominaBruta) {
		float retencion=0;
		if(nominaBruta>=2100 && nominaBruta<2500){
			retencion=0.15f; 
		}else if(nominaBruta>=2500) {
			retencion=0.18f;
		}
		return nominaBruta*(1-retencion);
	}
}
