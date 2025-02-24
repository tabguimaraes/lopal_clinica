package br.sp.senai.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {
	   	private String nome;
	   	private double peso;
	   	private double altura;
	    private String genero;
	    private String telefone;
	    private LocalDate dataNascimento;
	    
	    public void setNome (String nome) {
	    	if (nome.length() <= 3 | nome.isBlank()) {
	    		System.out.println("O nome não pode estar vazio ou ter menos que 3 caracteres!");
	    	} else {
	    		this.nome = nome;
	    	}
	    	
	    }
	    
	    
	    public void setPeso (double peso) {
	    	if (peso > 0) {
	    		this.peso = peso;
	    	} else {
	    		System.out.println("O peso deve ser maior que zero!");
	    	}
	    }
	    
	    public double getPeso () {
	    	return this.peso;
	    }
	    
	    
	    public void setAltura (double altura) {
	    	if (altura > 1) {
	    		this.altura = altura;
	    	} else {
	    		System.out.println("A altura deve ser maior que zero!");
	    	}
	    }
	    
	    public double getAltura () {
	    	return this.altura;
	    }
	    

	    public void marcarConsulta(){

	    }

	    public void calcularIdade(){

	    }

	    public void calcularImc(){
	    	
	    	double	imc = this.peso / (this.altura * this.altura);
	    	

	    }

	    public void classificarImc(){

	    }

	    public void exibirDados(){
	    	
	    	String unidadePeso = "kg. \n";
	    	String separadorCampos = "===================";
	    	System.out.println(separadorCampos);
	    	System.out.println("DADOS DO PACIENTE");
	    	System.out.println(separadorCampos);
	    	if(this.nome != null) {
	    		System.out.println(("nome: " + nome).toUpperCase());
	    	} else {
	    		System.out.println("nome: *****".toUpperCase());
	      	}	    	
	    	System.out.println(separadorCampos);	    	System.out.printf("PESO: %s %s", peso, unidadePeso);
	    	System.out.println(separadorCampos);
	   	    System.out.println("ALTURA: " + altura);
	   	    System.out.println(separadorCampos);
	    	
		

	    }

}
