package test.builder;

import builder.Socio;
import builder.SocioBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SocioBuilderTest {

  @Test
  void verificaNome() {
    try {
      SocioBuilder builder = new SocioBuilder();
      Socio socio = builder.setNome("Pedro Bonorino")
              .setCpf("123.123.123-21")
              .setEmail("email@email.com")
              .setTime("Botafogo")
              .setMensalidade(65)
              .build();
    } catch (IllegalArgumentException e) {
      assertEquals("Nome inválido", e.getMessage());
    }
  }

  @Test
  void verificaCPF() {
    try {
      SocioBuilder builder = new SocioBuilder();
      Socio socio = builder.setNome("Pedro Bonorino")
              .setCpf("123.123.123-21")
              .setEmail("email@email.com")
              .setTime("Botafogo")
              .setMensalidade(65)
              .build();
    } catch (IllegalArgumentException e) {
      assertEquals("CPF inválido", e.getMessage());
    }
  }

  @Test
  void verificaEmail() {
    try {
      SocioBuilder builder = new SocioBuilder();
      Socio socio = builder.setNome("Pedro Bonorino")
              .setCpf("123.123.123-21")
              .setEmail("email@email.com")
              .setTime("Botafogo")
              .setMensalidade(65)
              .build();
    } catch (IllegalArgumentException e) {
      assertEquals("Email inválido", e.getMessage());
    }
  }

  @Test
  void verificaTime() {
    try {
      SocioBuilder builder = new SocioBuilder();
      Socio socio = builder.setNome("Pedro Bonorino")
              .setCpf("123.123.123-21")
              .setEmail("email@email.com")
              .setTime("Botafogo")
              .setMensalidade(65)
              .build();
    } catch (IllegalArgumentException e) {
      assertEquals("Time inválido", e.getMessage());
    }
  }

  @Test
  void verificaPlano() {
    try {
      SocioBuilder builder = new SocioBuilder();
      Socio socio = builder.setNome("Pedro Bonorino")
              .setCpf("123.123.123-21")
              .setEmail("email@email.com")
              .setTime("Botafogo")
              .build();
    } catch (IllegalArgumentException e) {
      assertEquals("Plano inválido", e.getMessage());
    }
  }

  @Test
  void verificaSocioValido() {
    SocioBuilder builder = new SocioBuilder();
    Socio socio = builder.setNome("Pedro Bonorino")
            .setCpf("123.123.123-21")
            .setEmail("email@email.com")
            .setTime("Botafogo")
            .setMensalidade(65)
            .build();

    assertNotNull(socio);
  }
}