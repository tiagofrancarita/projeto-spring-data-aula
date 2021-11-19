package br.com.projeto.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring-config.xml"})
public class AppSpringDataTest {
	
	@Test
	public void testInsert() {
		
		System.out.println("===========================================================");
		System.out.println("SPRING INICIADO COM SUCESSO!");
		System.out.println("===========================================================");
		
	}

}
