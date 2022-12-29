package tarefa;

/**
 * 
 * @author Jânio Santos
 *
 */

public class Pessoa {

	private long codigo;
	
    private String nomeCompleto;
    
    private String CPF;
    
    private String endereço;
    
    private String cidadeNascimento;

	private static final int[] PesoCPF = {11,,10,9,8,7,6,5,4,3,2};

	public long getCodigo() {
		return codigo;
	}
	
	/**
	 * 
	 * @param codigo utilizado para fzer identificação no banco de dados
	 */

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCPF() {
		return CPF;
	}

	/**
	 * 
	 * @deprecated necessario criar metodo de validção para a numeração não ser passada nula
	 * @see validaCpf
	 */
	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getCidadeNascimento() {
		return cidadeNascimento;
	}

	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}
    
	public static int validaCpf(String CPF){
	    int validacaoCpf [] = {11,10,9,8,7,6,5,4,3,2,1,0}

		if(CPF.lenght <= validacaoCpf) {
			return throw new IllegalArgumentException("CPF não pode ser nulo. Digite novamente!")
		}
	 }
    
    
}
