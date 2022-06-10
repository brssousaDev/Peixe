interface EstadosInterfaceEnum {
  sigla: string;
  nome: string
}

export class Estados implements EstadosInterfaceEnum {

  constructor(public sigla: string, public nome: string) {}

  public static RO = new Estados("RO","Rondônia");
  public static AC = new Estados("AC","Acre");
  public static AM = new Estados("AM","Amazonas");
  public static RR = new Estados("RR","Roraima");
  public static PA = new Estados("PA","Pará");
  public static AP = new Estados("AP","Amapá");
  public static TO = new Estados("TO","Tocantins");
  public static MA = new Estados("MA","Maranhão");
  public static PI = new Estados("PI","Piauí");
  public static CE = new Estados("CE","Ceará");
  public static RN = new Estados("RN","Rio Grande do Norte");
  public static PB = new Estados("PB","Paraíba");
  public static PE = new Estados("PE","Pernambuco");
  public static AL = new Estados("AL","Alagoas");
  public static SE = new Estados("SE","Sergipe");
  public static BA = new Estados("BA","Bahia");
  public static MG = new Estados("MG","Minas Gerais");
  public static ES = new Estados("ES","Espírito Santo");
  public static RJ = new Estados("RJ","Rio de Janeiro");
  public static SP = new Estados("SP","São Paulo");
  public static PR = new Estados("PR","Paraná");
  public static SC = new Estados("SC","Santa Catarina");
  public static RS = new Estados("RS","Rio Grande do Sul");
  public static MS = new Estados("MS","Mato Grosso do Sul");
  public static MT = new Estados("MT","Mato Grosso");
  public static GO = new Estados("GO","Goiás");
  public static DF = new Estados("DF","Distrito Federal");

  getNome(): string {
    return  this.nome;
  }

  getSigla(): string {
    return this.sigla;
  }

}
