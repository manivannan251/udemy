package com.example.sfg.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.sfg.di.controller.ConstructorInjectedController;
import com.example.sfg.di.controller.MyController;
import com.example.sfg.di.controller.PropertyInjectedController;
import com.example.sfg.di.controller.SetterInjectedController;
import com.example.sfg.di.controller.i18nController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		System.out.println("------ Profile");
		i18nController i18nController = (i18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());

		
		
		MyController controller = (MyController) ctx.getBean("myController");
		
		
		System.out.println("------ Primary");
		System.out.println(controller.sayHello());
		
		System.out.println("------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		
		  System.out.println("-------- Constructor" ); ConstructorInjectedController
		  constructorInjectedController = (ConstructorInjectedController)
		  ctx.getBean("constructorInjectedController");
		  System.out.println(constructorInjectedController.getGreeting());
		 
	}

}
