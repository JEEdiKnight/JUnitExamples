package demo.junit.testdoubles;

public class CostoEnvioDAOImpl implements CostoEnvioDAO {

	public void actualizar(String pais, double costo) {
		// .... Database Access Logic .....
		throw new UnsupportedOperationException("No debes consultar a la BD");
	}

	public double obtener(String pais) {
		// .... Database Access Logic .....
		throw new UnsupportedOperationException("No debes consultar a la BD");
	}

}