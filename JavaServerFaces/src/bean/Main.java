package bean;

import res.QuerySelector;

public class Main extends Form{

	/**
	 * Main Bean
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer num = 20;
	
	private String texto;
	
	
	public void print(){
		System.out.println("imprimiendo");
	}


	public Integer getNum() {
		return num;
	}


	public void setNum(Integer num) {
		this.num = num;
	}


	public String getTexto() {
		return "hkj" + QuerySelector.selectQuery("querys", "findById");
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


}
