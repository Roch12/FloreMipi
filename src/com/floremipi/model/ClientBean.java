package com.floremipi.model;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="ClientBean")
@SessionScoped
public class ClientBean {

	@ManagedProperty(name="clientList", value = "#{clientList}")
	public ArrayList<Client> clientList;

	
	public ClientBean() {
		clientList = new ArrayList<Client>();
		clientList.add(new Client(0, "Maxime", "Roch", "email", "phone"));
		clientList.add(new Client(1, "Maxime", "Roch", "email", "phone"));
		clientList.add(new Client(3, "Maxime", "Roch", "email", "phone"));
		clientList.add(new Client(6, "Maxime", "Roch", "email", "phone"));
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
