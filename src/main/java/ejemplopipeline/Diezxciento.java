package ejemplopipeline;

public class Diezxciento {
	
	public int ahorro;
	public int sueldo;
	
	public Diezxciento(){
		ahorro = 20000000;
		sueldo = 700000;
	}
	
	public Diezxciento(int ahorro, int sueldo) {
		this.ahorro = ahorro;
		this.sueldo = sueldo;
	}
	
	public int diezxciento(){
		double diezxciento = ahorro * 0.1;
		System.out.println(diezxciento);
		return (int) diezxciento;
	}
	
	public int impuesto(){
		if (sueldo > 3000000) return (int) (diezxciento() * 0.08);
		if (sueldo > 2000000) return (int) (diezxciento() * 0.05);
		if (sueldo > 1000000) return (int) (diezxciento() * 0.01);
		
		// Si el sueldo es inferior a 1000000, no paga impuesto
		return 0;
	}
	
	public int saldoAhorro() {
		double noventaxciento = ahorro * 0.9;
		return (int) noventaxciento;
	}

}