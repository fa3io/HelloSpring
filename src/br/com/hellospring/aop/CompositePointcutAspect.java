package br.com.hellospring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CompositePointcutAspect {
	
	@Pointcut("execution(* *.crate*(..))")
	public void createMethodExecution(){
		System.out.println("Interceptando metodo que tenha update em seu nome");
	}
	
	@Pointcut("args(java.lang.String)")
	public void StringArgsMethodExecution(){
		System.out.println("Interceptando metodo que tenha argumento String");
	}
	
	@Before("createMethodExecution() && StringArgsMethodExecution()")
	public void compositePointcut(){
		System.out.println("Interceptando metodo que atende ao Pointcut composto: createMethodExecution && StringArgsMethodExecution ");
	}

}
