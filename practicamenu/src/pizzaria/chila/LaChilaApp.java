package pizzaria.chila;

import java.util.*;

public class LaChilaApp {
	public static Cocinero[] cocineros = new Cocinero[20];
	public static int qCocineros=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		menuPrincipal();
		
	}
	public static void menuPrincipal()
	{
		Scanner entrada = new Scanner(System.in);
		byte respuesta;
		
		do
		{
			System.out.println("1. Administrar Empleados");
			System.out.println("2. Administrar Ventas");
			System.out.println("3. Administrar Pizzas");
			System.out.println("4. Salir");
			System.out.print("Ingresa una opción:");
			respuesta = entrada.nextByte();
			switch(respuesta)
			{
			case 1: menuEmpleados();
			break;
			case 2: mostrarCocineros();
			break;
			case 3: System.out.println("Seleccionaste Pizzas");
			break;
			case 4: System.out.println("Seleccionaste Salir");
			break;
			}
		}while(respuesta<4);
	}
	public static void menuEmpleados()
	{
		Scanner entrada = new Scanner(System.in);
		byte respuesta;
		do
		{
			System.out.println("1. Agregar Empleados");
			System.out.println("2. Eliminar Empleados");
			System.out.println("3. Modificar Empleados");
			System.out.println("4. Salir");
			System.out.print("Ingresa una opción:");
			respuesta = entrada.nextByte();
			switch(respuesta)
			{
			case 1: menuAgregarEmpleados();
			break;
			case 2: System.out.println("Seleccionaste Eliminar Empleado");
			break;
			case 3: System.out.println("Seleccionaste Modificar Empleado");
			break;
			case 4: System.out.println("Seleccionaste Salir");
			break;
			}
		}while(respuesta<4);
	}
	
	public static void menuAgregarEmpleados()
	{
		Scanner entrada = new Scanner(System.in);
		byte respuesta;
		do
		{
			System.out.println("1. Agregar Cocineros");
			System.out.println("2. Agregar Cajeros");
			System.out.println("3. Agregar Repartidores");
			System.out.println("4. Salir");
			System.out.print("Ingresa una opción:");
			respuesta = entrada.nextByte();
			switch(respuesta)
			{
			case 1: agregarCocinero();
			break;
			case 2: System.out.println("Seleccionaste Eliminar Empleado");
			break;
			case 3: System.out.println("Seleccionaste Modificar Empleado");
			break;
			case 4: System.out.println("Seleccionaste Salir");
			break;
			}
		}while(respuesta<4);
	}
	public static void agregarCocinero()
	{
		Scanner entrada = new Scanner(System.in);
		
		cocineros[qCocineros] = new Cocinero();
		System.out.print("Introduce el Id del Cocinero:");
		cocineros[qCocineros].setIdEmpleado(entrada.nextInt());
		System.out.print("Introduce el nombre del Cocinero:");
		cocineros[qCocineros].setNombre(entrada.next());
		System.out.print("Introduce el sexo del Cocinero:");
		cocineros[qCocineros].setsexo(entrada.next());
		System.out.print("Introduce el tipo de cocina del Cocinero:");
		cocineros[qCocineros].setTipoCocina(entrada.next());
		qCocineros++;
	}
	
	public static void mostrarCocineros()
	{
		for(int i=0;i<qCocineros;i++)
		{
			System.out.print("El Id del Cocinero:");
			System.out.println(cocineros[i].getidEmpleado());
			System.out.print("El Id del Cocinero:");
			System.out.println(cocineros[i].getNombre());
		}
	}
}