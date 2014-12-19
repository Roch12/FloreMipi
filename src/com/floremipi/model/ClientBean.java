package com.floremipi.model;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="ClientBean")
@SessionScoped
public class ClientBean {

	@ManagedProperty(name="clientList", value = "#{clientList}")
	public ArrayList<Client> clientList;

	
	public ClientBean() {
		
	}
	
	@PostConstruct
	public void Init(){
		clientList = new ArrayList<Client>();
		clientList.add(new Client(0, "Maxime", "Roch", "maxime.roch@y-nov.com", "0655555555"));
		clientList.add(new Client(1, "Johan", "Pouget", "johan.pouget@y-nov.com", "0644444444"));
		clientList.add(new Client(2, "Morgan", "Billon", "morgan-billon@y-nov.com", "0633333333"));
		clientList.add(new Client(3, "Lucas", "Brettes", "lucas.brettes@y-nov.com", "0622222222"));
		clientList.add(new Client(3, "Swann", "Waselin", "swann.vaselin@y-nov.com", "0611111111"));
	}
	
	/**
	 * @return the clientList
	 */
	public ArrayList<Client> getClientList() {
		return clientList;
	}

	/**
	 * @param clientList the clientList to set
	 */
	public void setClientList(ArrayList<Client> clientList) {
		this.clientList = clientList;
	}
}
