package com.springbeans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Livro livro = factory.getBean(Livro.class);
		
		livro.setNome("Harry Potter");
		
		livro.setCodigo("D34FD");
		
		Autor autor = factory.getBean(Autor.class);
		
		autor.setNome("J K Roling");
		
		livro.exibir();
		
		((AbstractApplicationContext) factory).close();
		

	}

}
