package com.paqs.tweeterapp.config;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

//import com.paqs.tweeterapp.Controller.CustomAuthenticationEntryPoint;

@Configuration
@EnableWebSocketMessageBroker
public class AppConfig implements WebSocketMessageBrokerConfigurer{

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		// TODO Auto-generated method stub
		registry.addEndpoint("/ws").withSockJS();
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		// TODO Auto-generated method stub
		//WebSocketMessageBrokerConfigurer.super.configureMessageBroker(registry);
		registry.setApplicationDestinationPrefixes("/app");
		registry.enableSimpleBroker("/topic"); 
	}
	
	
	
}
