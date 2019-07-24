package me.atticusthecoder.clientmgr.common;

import me.atticusthecoder.clientmgr.Client;

public class Check {
	protected String check;
	protected Client client;
	
	public Check(String check, Client client) {
		this.check = check;
		this.client = client;
	}
}
