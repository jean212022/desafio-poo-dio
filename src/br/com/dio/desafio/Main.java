package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHorario(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição curso Java Script");
		curso2.setCargaHorario(10);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descricao mentoria de java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1.toString().concat("\n" + curso2));
		System.out.println(mentoria);
	}

}