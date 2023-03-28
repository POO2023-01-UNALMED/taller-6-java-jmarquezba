package vehiculos;

public class Automovil extends Vehiculo {
		protected int puestos;
		public static int canAutomoviles;
		
		public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, double precio, int peso,
				String traccion, Fabricante fabricante, int puestos) {
			super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
			this.puestos = puestos;
			canAutomoviles++;
		}

		public int getPuestos() {
			return puestos;
		}

		public void setPuestos(int puestos) {
			this.puestos = puestos;
		}
		
		
}
