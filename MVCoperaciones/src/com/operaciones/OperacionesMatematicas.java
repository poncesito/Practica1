package com.operaciones;

public class OperacionesMatematicas {
	
	private float numero1;
	private float numero2;

	
	public float getNumero1()
	{
		return numero1;
	}
	public float getNumero2()
	{
		return numero2;
	}
	
	public void setNumero1(float numero1) {
	this.numero1= numero1;
	}
	public void setNumero2(float numero2) {
		this.numero2= numero2;
	}
	public float sumar()
	
	{
		
		return numero1+numero2;
	}
public float restar()
	
	{
		
		return numero1 -numero2;
	}
public float multiplicar()

{
	
	return numero1*numero2;
}

public float dividir()

{
	
	return numero1/numero2;
}
	

	
//	public void setNumero1(float numero1) {
//	this.numero1= numero2;
//	}
//	public void setNumero2(float numero2) {
//		this.numero2= numero2;
//		}
}
