package com.example.shopExample.boot.view;

public enum StatusSession {


	CREATED(1, "Create a session, type CREATED"),
	BUY(2, "Buy products, type BUY"),
	PAY(3, "Pay the products, type PAY"),
	//UNKNOWN(5, "Unknown option, type UNKNOWN");
	UPDATED(4, "Updated the session, type UPDATED"),
	FINISHED(5, "Finished the session, type FINISHED");
	
	private int optionInteger;
	private String optionText;

	StatusSession() {
	}

	StatusSession(int optionInteger, String OptionText) {
		this.optionInteger = optionInteger;
		this.optionText = OptionText;
	}

	public int getOptionInteger() {
		return optionInteger;
	}

	public String getOptionText() {
		return optionText;
	}

	/*public static StatusSession commandisValid(String command) {
		StatusSession commandEnum;

		for (StatusSession optionValue : StatusSession.values()) {
			if (optionValue.name().equals(command.toUpperCase())) {
				commandEnum = StatusSession.valueOf(command.toUpperCase());
				return commandEnum;
			}
		}
		return StatusSession.UNKNOWN;

	}*/

}