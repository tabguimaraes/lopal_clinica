package br.sp.senai.jandira.clinica;

import br.sp.senai.jandira.clinica.model.Paciente;

public class ClinicaApp {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		
		p1.setNome("Jó");
		p1.setPeso(68);
		p1.setAltura(160);		
		p1.exibirDados();
		
				
	}

}
