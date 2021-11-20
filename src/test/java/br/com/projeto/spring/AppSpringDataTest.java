package br.com.projeto.spring;


import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.projeto.spring.dao.InterfaceSpringDataUser;
import br.com.projeto.spring.model.UsuarioSpringData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring-config.xml"})
public class AppSpringDataTest {
	
	@Autowired
	private InterfaceSpringDataUser interfaceSpringDataUser;
	
	@Test
	public void testInsert() {
		
		UsuarioSpringData novoUser = new UsuarioSpringData();
		novoUser.setNome("AdminHomol");
		novoUser.setLogin("adminhomol");
		novoUser.setSenha("adminhomol");
		novoUser.setDtNascimento("1995-07-06");
		novoUser.setEmail("adminhomol@francadev.com");
		
		interfaceSpringDataUser.save(novoUser);
		System.out.println("Usuário salvo com sucesso. --> " +  interfaceSpringDataUser.count());
	}
	
	@Test
	public void testeConsulta() {
		
		Optional<UsuarioSpringData> usuarioSpringData = interfaceSpringDataUser.findById(4L);
		
		System.out.println("Cód: "  + usuarioSpringData.get().getId());
		System.out.println("Nome: "  + usuarioSpringData.get().getNome());
		System.out.println("Login: "  +  usuarioSpringData.get().getLogin());
		System.out.println("E-mail: "  + usuarioSpringData.get().getEmail());
	}
	
	@Test
	public void consultaTotal() {
		
		Iterable<UsuarioSpringData> lista = interfaceSpringDataUser.findAll();
		
		for (UsuarioSpringData usuarioSpringData : lista) {
			System.out.println("Cód: "  + usuarioSpringData.getId());
			System.out.println("Nome: "  + usuarioSpringData.getNome());
			System.out.println("Login: "  +  usuarioSpringData.getLogin());
			System.out.println("E-mail: "  + usuarioSpringData.getEmail());
			System.out.println("Senha: "  + usuarioSpringData.getSenha());
			System.out.println("Data Nascimento: "  + usuarioSpringData.getDtNascimento());
			System.out.println("---------------------------------------------------------------------------");
		}
		
	}

}
