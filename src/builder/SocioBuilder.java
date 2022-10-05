package builder;

import java.util.Date;

public class SocioBuilder {

  private Socio socio;

  public SocioBuilder() {
    socio = new Socio();
  }

  public Socio build() {
    if (socio.getNome().equals("")) {
      throw new IllegalArgumentException("Nome inválido");
    }
    if (socio.getCpf().equals("")) {
      throw new IllegalArgumentException("CPF inválido");
    }
    if (socio.getEmail().equals("")) {
      throw new IllegalArgumentException("Email inválido");
    }
    if (socio.getTime().equals("")) {
      throw new IllegalArgumentException("Time inválido");
    }
    if(socio.getMensalidade() < 30) {
      throw new IllegalArgumentException("Plano inválido");
    }
    return socio;
  }

  public SocioBuilder setNome(String nome) {
    socio.setNome(nome);
    return this;
  }

  public SocioBuilder setDataNascimento(Date dataNascimento) {
    socio.setDataNascimento(dataNascimento);
    return this;
  }

  public SocioBuilder setCpf(String cpf) {
    socio.setCpf(cpf);
    return this;
  }

  public SocioBuilder setEnderecoLogradouro(String enderecoLogradouro) {
    socio.setEnderecoLogradouro(enderecoLogradouro);
    return this;
  }

  public SocioBuilder setEnderecoNumero(int enderecoNumero) {
    socio.setEnderecoNumero(enderecoNumero);
    return this;
  }

  public SocioBuilder setEnderecoComplemento(String enderecoComplemento) {
    socio.setEnderecoComplemento(enderecoComplemento);
    return this;
  }

  public SocioBuilder setEnderecoBairro(String enderecoBairro) {
    socio.setEnderecoBairro(enderecoBairro);
    return this;
  }

  public SocioBuilder setEnderecoCidade(String enderecoCidade) {
    socio.setEnderecoCidade(enderecoCidade);
    return this;
  }

  public SocioBuilder setEnderecoUF(String enderecoUF) {
    socio.setEnderecoUF(enderecoUF);
    return this;
  }

  public SocioBuilder setCep(String cep) {
    socio.setCep(cep);
    return this;
  }

  public SocioBuilder setEmail(String email) {
    socio.setEmail(email);
    return this;
  }

  public SocioBuilder setCelular(String celular) {
    socio.setCelular(celular);
    return this;
  }

  public SocioBuilder setTime(String time) {
    socio.setTime(time);
    return this;
  }

  public SocioBuilder setMensalidade(double mensalidade) {
    socio.setMensalidade(mensalidade);
    return this;
  }

}
