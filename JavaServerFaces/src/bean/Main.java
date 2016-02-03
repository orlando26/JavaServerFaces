package bean;



public class Main extends Form{

	/**
	 * Main Bean
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer num = 20;
	
	
	public void print(){
		System.out.println("imprimiendo");
	}


	public Integer getNum() {
		return num;
	}


	public void setNum(Integer num) {
		this.num = num;
	}


}
