package pizzaria.chila;
import java.util.*;

public class Cajeros extends Empleados {
	private int idCaja;
	ventas ventasCajero;
	
	
	public int getIdCaja()
	{
		return idCaja;
	}
public void setIdCaja(int _idCaja)
{
idCaja=_idCaja;
}
public void setVentasCajero(
int _folio, Date _fecha,double _monto)
{
	ventasCajero.setFolio(_folio);
	ventasCajero.setFecha(_fecha);
	ventasCajero.setMonto(_monto);
}
}
