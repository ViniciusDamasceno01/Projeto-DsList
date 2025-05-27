package com.devsuperior.dslist.config;

//import org.springframework.beans.factory.annotation.Value; // COMENTADA PARA O TESTE
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration; // Mantenha esta anotação!
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // ESTA ANOTAÇÃO É FUNDAMENTAL! VERIFIQUE SE ESTÁ LÁ!
public class WebConfig {

 // As linhas abaixo foram COMENTADAS para o teste de hardcoding.
 // @Value("${cors.origins}")
 // private String corsOrigins;

 @Bean
 public WebMvcConfigurer corsConfigurer() {
     return new WebMvcConfigurer() {
         @Override
         public void addCorsMappings(CorsRegistry registry) {
             // AQUI ESTAMOS HARDCODING A URL DO FRONT-END PARA TESTAR O CORS
             registry.addMapping("/**") // Aplica a configuração CORS para todas as URLs do seu backend
                     .allowedMethods("*") // Permite todos os métodos HTTP (GET, POST, PUT, DELETE, etc.)
                     .allowedOrigins("http://localhost:3000") // <-- A URL DO SEU FRONT-END LOCAL DIRETAMENTE AQUI
                     .allowedHeaders("*"); // Permite todos os cabeçalhos nas requisições CORS
         }
     };
 }
}

