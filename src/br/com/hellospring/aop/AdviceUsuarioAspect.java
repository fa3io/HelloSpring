package br.com.hellospring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;

//@Aspect
public class AdviceUsuarioAspect {
	/**
	 * Before: Advice que executa antes do join point, 
	 * mas n�o tem o poder de evitar que o join point execute;
	 */
	@Before("execution(public * updateUsuario(..))")
	public void beforeMethod(){
		System.out.println("Execu��o de Aspecto 'ANTES' do metodo.");
	}
	
	/**
	 * After (finally): Advice que executa ap�s o join point,
	 * independentemente de sua forma de retorno;
	 */
	@After("execution(public * updateUsuario(..))")
	public void afterMethod(){
		System.out.println("Execu��o de Aspecto 'DEPOIS' do metodo.");
	}
	
	/**
	 * After returning: Advice que executa ap�s o join point,
	 * apenas se este terminar de forma bem sucedida;
	 */
	@AfterReturning("execution(public * updateUsuario(..))")
	public void afterReturningMethod(){
		System.out.println("Execu��o de Aspecto 'DEPOIS' do metodo 'BEM SUCEDIDO'.");
	}
	
	/**
	 * After throwing: Advice que executa ap�s o join point,
	 * quando ele finaliza enviando uma exce��o;
	 */
	@AfterThrowing("execution(public * crateUsuario(..))")
	public void afterThrowingMethod(){
		System.out.println("Execu��o de Aspecto 'DEPOIS' do metodo 'QUE LAN�A UMA EXCEPTION'.");
	}
	
	/**
	 *Around: Advice que envolve a execu��o de um join point. 
	 *Este � o tipo mais poderoso de advice, pois pode realizar a��es antes e ap�s a execu��o do join point. 
	 *Tamb�m � de sua responsabilidade decidir se o join point deve ou n�o ser chamado. 
	 * @throws Throwable 
	 */
	@Around("execution(public * crateUsuario(..))")
	public Object aroundingMethod(ProceedingJoinPoint proceedingJoinPoint ) throws Throwable{
		System.out.println("Execu��o de Aspecto 'AO REDOR - ANTES' do metodo .");
		
		//Exibindo assinatura completa do metodo 
		System.out.println(proceedingJoinPoint.getSignature());
		
		//Verificando parametros no metodo interceptado
		Object[] parametros = proceedingJoinPoint.getArgs();
		if(parametros.length > 0){
			System.out.println("Parametros passados: " + parametros[0]);
		}
		
		//Executando o metodo
		Object resultado = proceedingJoinPoint.proceed();
		
		System.out.println("Resultado da chamada: " + resultado);
		System.out.println("Execu��o de Aspecto 'AO REDOR - DEPOIS' do metodo .");
		
		return resultado;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
