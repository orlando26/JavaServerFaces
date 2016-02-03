package bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ContextBeans implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Main mainBean;

	public Main getMainBean() {
		if (mainBean == null){
			mainBean = new Main();
		}
		return mainBean;
	}

	public void setMainBean(Main mainBean) {
		this.mainBean = mainBean;
	}
	
	public void printVal(){
		System.out.println("dasdas");
	}
	
	

}
