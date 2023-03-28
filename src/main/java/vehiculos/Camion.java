package vehiculos;

public class Camion extends Vehiculo{
	protected int ejes;
	public static int canCamiones;
	
	public Camion(String placa, int puertas, int velocidadMaxima, String nombre, double precio, int peso,
			String traccion, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		canCamiones++;
		
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	
	
}
