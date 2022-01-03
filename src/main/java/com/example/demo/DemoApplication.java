package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController //스프링에게 해당 코드가 웹에서 사용 가능한 엔드포인트라는 것을 서술
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/hello")//Spring에게 hello 메소드가 응답으로 쓰인다는 것을 알림
	public String hello(@RequestParam(value = "name", defaultValue = "World")String name){
		return String.format("Hello %s!", name);
	} //Spring에게 name 파라미터가 있다는 정보를 알려주고, name에 대한 파라미터를 못 받았다면 디폴트 값으로 World를 사용하게끔 함
}
