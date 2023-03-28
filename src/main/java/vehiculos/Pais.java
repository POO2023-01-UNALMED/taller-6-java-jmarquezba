package vehiculos;

import java.util.ArrayList;

public class Pais {
	protected String nombre;
	
	public Pais(String nombre) {
		super();
		this.nombre = nombre;
	}





	public static Pais paisMasVendedor() {
	        ArrayList<Pais> ubicacionFabrica = new ArrayList<Pais>();

	        for (Fabricante fabricante : Fabricante.fabricantes) {
	            ubicacionFabrica.add(fabricante.getPais());
	        }

	        int aux=0;
	        Pais paisMayorVentas= null;
	        for (Pais pais : ubicacionFabrica) {
	            int instancias = 0;
	            for (int i = 0; i < ubicacionFabrica.size(); i++) {
	                if (pais == ubicacionFabrica.get(i)){
	                    instancias++;
	                }
	            }
	            if (instancias > aux){
	                aux = instancias;
	                paisMayorVentas = pais;
	            }
	        }

	        return paisMayorVentas;
	    }
	
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
