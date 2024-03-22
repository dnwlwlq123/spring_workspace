package spring.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;
import sample04.SungJukDTO2;

@Configuration
public class SpringConfiguration {

	//빈 생성
	
	// sample01
	/*
	 * @Bean public MessageBeanImpl messageBEanImpl(){ return new
	 * MessageBeanImpl("사과"); }
	 */
	
	@Bean(name="messageBeanImpl")
	public MessageBeanImpl getMessageBEanImpl(){
		return new MessageBeanImpl("사과");
	}
	
	//sample02
	
	@Bean
	public CalcAdd calcAdd() {
		return new CalcAdd(25,36);
	}
	
	@Bean(name="calcMul")
	public CalcMul getCalcMul() {
		return new CalcMul();
		
	}
	
	//sample02
		@Bean
		public List<SungJukDTO2> list(){
		return new ArrayList<SungJukDTO2>();
		}
}

/*
 *@Bean
 *메소드에서 return 되는 값을 스프링의 빈으로 생성한다. 
 *메소드명을 설정할 때는 반드시 빈의 id명으로 해야한다.
 *메소드명을 설정할 때 자바처럼 getter를 사용하려면 @Bean(name 속성)을 사용한다.
 * 
 */ 

 