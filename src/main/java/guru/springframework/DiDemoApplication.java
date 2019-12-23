package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.controllers.MyController;
import guru.springframework.examplebeans.FakeDatasource;
import guru.springframework.examplebeans.FakeJmsBroker;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");
		
		FakeDatasource fakeDatasource =ctx.getBean(FakeDatasource.class);
		System.out.println(fakeDatasource.getUser());
		
		FakeJmsBroker fakeJmsBroker =ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUser());

//		System.out.println(controller.hello());
//		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
