package com.marcus.userservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class UserRouter {

	@Bean
	RouterFunction<ServerResponse> baseRouter(){
		return RouterFunctions.route().path("user", this::userRouter).build();
	}
	
	private RouterFunction<ServerResponse> userRouter() {
		return RouterFunctions.route()
				.path("", null)
				.path("", null)
				.path("", null)
				.path("", null)
				.path("", null)
				.path("", null)
				.build();
	}
}
