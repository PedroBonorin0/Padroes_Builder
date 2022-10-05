package padroescriacao.builder;

import java.util.Date;

public class Socio {

  private String nome;
  private Date dataNascimento;
  private String cpf;
  private String enderecoLogradouro;
  private int enderecoNumero;
  private String enderecoComplemento;
  private String enderecoBairro;
  private String enderecoCidade;
  private String enderecoUF;
  private String cep;
  private String email;
  private String celular;
  private String time;
  private double mensalidade;

  public Socio() {
    this.cpf = "";
    this.nome = "";
    this.email = "";
    this.time = "";
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Date getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEnderecoLogradouro() {
    return enderecoLogradouro;
  }

  public void setEnderecoLogradouro(String enderecoLogradouro) {
    this.enderecoLogradouro = enderecoLogradouro;
  }

  public int getEnderecoNumero() {
    return enderecoNumero;
  }

  public void setEnderecoNumero(int enderecoNumero) {
    this.enderecoNumero = enderecoNumero;
  }

  public String getEnderecoComplemento() {
    return enderecoComplemento;
  }

  public void setEnderecoComplemento(String enderecoComplemento) {
    this.enderecoComplemento = enderecoComplemento;
  }

  public String getEnderecoBairro() {
    return enderecoBairro;
  }

  public void setEnderecoBairro(String enderecoBairro) {
    this.enderecoBairro = enderecoBairro;
  }

  public String getEnderecoCidade() {
    return enderecoCidade;
  }

  public void setEnderecoCidade(String enderecoCidade) {
    this.enderecoCidade = enderecoCidade;
  }

  public String getEnderecoUF() {
    return enderecoUF;
  }

  public void setEnderecoUF(String enderecoUF) {
    this.enderecoUF = enderecoUF;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCelular() {
    return celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public double getMensalidade() {
    return mensalidade;
  }

  public Socio setMensalidade(double mensalidade) {
    this.mensalidade = mensalidade;
    return this;
  }
}
