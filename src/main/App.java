package main;

import java.util.ArrayList;
import java.util.Scanner;

class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Evaluacion> evaluacion = new ArrayList<>();
		ArrayList <Alumno> alumno = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		Alumno alum = null;
		Evaluacion eva = null;
		String nombre="",apellido="";
		double eva1,eva2,eva3,eva4;
		int n;
		
		System.out.println("Cuantos alumnos ingresara: ");
		n=sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=n;i++) {
			alum = new Alumno();
			eva = new Evaluacion();
			eva = new Evaluacion();
			System.out.print("Ingrese el nombre del alumno "+i+": ");
			nombre=sc.nextLine();
			alum.setNombre(nombre);
			System.out.println("Ingrese el apellido del alumno "+i+": ");
			apellido=sc.nextLine();
			alum.setApellido(apellido);
			System.out.println("Ingrese la primera evaluacion del alumno "+i+": ");
			eva1=Double.parseDouble(sc.nextLine());
			eva.setEva1(eva1);
			System.out.println("Ingrese la segunda evaluacion del alumno "+i+": ");
			eva2=Double.parseDouble(sc.nextLine());
			eva.setEva2(eva2);
			System.out.println("Ingrese la tercera evaluacion del alumno "+i+": ");
			eva3=Double.parseDouble(sc.nextLine());
			eva.setEva3(eva3);
			System.out.println("Ingrese la cuarta evaluacion del alumno "+i+": ");
			eva4=Double.parseDouble(sc.nextLine());
			eva.setEva4(eva4);
			
			//alum = new Alumno(nombre,apellido);
			//eva = new Evaluacion(eva1.eva2,eva3,eva4);
			
			evaluacion.add(eva);
			alumno.add(alum);
		}
		sc.close();
		
		for( int j=0;j<n;j++ ) {
			eva = evaluacion.get(j);
			alum =  alumno.get(j);
			System.out.println(alum.getNombre() + " \t "+ alum.getApellido() + " \t " + eva.getEva1() + " \t " + eva.getEva2() + " \t " + eva.getEva3() + " \t " + eva.getEva4() + " \t " + eva.calculo() );
		}
	}

}
