package com.pessoas.gerenciarpessoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pessoas.gerenciarpessoas.svTemplate.SvTemplate;

@SpringBootApplication
public class GerenciarpessoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciarpessoasApplication.class, args);

		SvTemplate Application = new SvTemplate();
        try {
                Application.Initialize();
                Application.Run();
            } catch(Exception e) {
                e.printStackTrace(); 
            }
	}

}
