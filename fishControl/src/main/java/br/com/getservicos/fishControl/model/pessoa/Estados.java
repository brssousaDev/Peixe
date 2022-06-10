package br.com.getservicos.fishControl.model.pessoa;

public enum Estados {

    RO("RO","Rondônia"),
    AC("AC","Acre"),
    AM("AM","Amazonas"),
    RR("RR","Roraima"),
    PA("PA","Pará"),
    AP("AP","Amapá"),
    TO("TO","Tocantins"),
    MA("MA","Maranhão"),
    PI("PI","Piauí"),
    CE("CE","Ceará"),
    RN("RN","Rio Grande do Norte"),
    PB("PB","Paraíba"),
    PE("PE","Pernambuco"),
    AL("AL","Alagoas"),
    SE("SE","Sergipe"),
    BA("BA","Bahia"),
    MG("MG","Minas Gerais"),
    ES("ES","Espírito Santo"),
    RJ("RJ","Rio de Janeiro"),
    SP("SP","São Paulo"),
    PR("PR","Paraná"),
    SC("SC","Santa Catarina"),
    RS("RS","Rio Grande do Sul"),
    MS("MS","Mato Grosso do Sul"),
    MT("MT","Mato Grosso"),
    GO("GO","Goiás"),
    DF("DF","Distrito Federal");

    private final String sigla;
    private final String nome;

    private Estados(String sigla,String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome(){
        return nome;
    }

}