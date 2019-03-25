package es.studium.PracticaTema2ED;

public class Matricula {
	private Persona alumno;
	private Asignatura asignatura;
	private int numeroMatricula;
	private double nota;
	
	public Matricula() {
		alumno = new Persona();
		asignatura = new Asignatura();
		numeroMatricula = 0;
		nota = 0;	
	}
	
	public Matricula(Persona al, Asignatura a, int nm, double n) {
		alumno = al;
		asignatura = a;
		numeroMatricula = nm;
		nota = n;
	}
	public void setAlumno(Persona al) {
		alumno = al;
	}
	public void setAsignatura(Asignatura a) {
		asignatura = a;
	}
	public void setNumeroMatricula(int nm) {
		numeroMatricula = nm;
	}
	public void setNota(double no) {
		nota = no;
	}
	public Persona getAlumno() {
		return alumno;
	}
	public Asignatura getAsignatura() {
		return asignatura;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public double getNota() {
		return nota;
	}
}
