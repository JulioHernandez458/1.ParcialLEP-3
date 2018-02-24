package main;

public class Evaluacion {
	
	private double eva1;
	private double eva2;
	private double eva3;
	private double eva4;
	
	public Evaluacion() {
		this.eva1=0;
		this.eva2=0;
		this.eva3=0;
		this.eva4=0;
	}
	public  double calculo() {
		double n;
		n=(eva1*0.15)+(eva2*0.25)+(eva3*0.30)+(eva4*0.30);
		return n;
	}

	public Evaluacion(double eva1, double eva2, double eva3, double eva4) {
		super();
		this.eva1 = eva1;
		this.eva2 = eva2;
		this.eva3 = eva3;
		this.eva4 = eva4;
	}

	public double getEva1() {
		return eva1;
	}

	public void setEva1(double eva1) {
		this.eva1 = eva1;
	}

	public double getEva2() {
		return eva2;
	}

	public void setEva2(double eva2) {
		this.eva2 = eva2;
	}

	public double getEva3() {
		return eva3;
	}

	public void setEva3(double eva3) {
		this.eva3 = eva3;
	}

	public double getEva4() {
		return eva4;
	}

	public void setEva4(double eva4) {
		this.eva4 = eva4;
	}
	
	

}
