package br.com.hellospring.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;

//@Aspect
public class PointcutAspect {
	
	
	@Before("execution(public * *(..))")
	public void methodUsingExecution(){
		System.out.println("Interceptando com a expressao execution");
	}
	
	@Before("execution(public * br.com.hellospring.*.*.update*(..))")
	public void methodStartingWithUpdateBeingExecuted(){
		System.out.println("Interceptando metodos iniciados com update dentro do pacote \"hellospring\" ");
	}
	
	@Before("execution(void  *(..))")
	public void voidMethodExecution(){
		System.out.println("Interceptando metodos com retorno void");
	}
	
	@Before("target (br.com.hellospring.interfaces.UsuarioService)")
	public void UsuarioServiceImplementedObjectExecution(){
		System.out.println("Interceptando metodos que implementem a interface definada em target: UsuarioService");
	}
	
	@Before("args(java.lang.String)")
	public void stringArgsMethodExecution(){
		System.out.println("Interceptando metodos que recebem uma String como parametro");
	}
	
	@Before("@target (br.com.hellospring.aop.AspectAnnotation)")
	public void AnnotationAnnotatedObjectExecution(){
		System.out.println("Interceptando metodos de classes que tenham a annotação passada no @target: AspectAnnotation");
	}
	
	@AfterThrowing(pointcut="execution(public * *(..))", throwing="e")
	public void logException(Exception e){
		System.out.println("Interceptando metodos pois o mesmo lancou Exception: " + e);
	}
	
	@AfterReturning(pointcut="execution(public String *(..))", returning="s")
	public void logReturnStringMethod(String s){
		System.out.println("Interceptando metodos que retorna String valor: " + s);
	}
	

}
