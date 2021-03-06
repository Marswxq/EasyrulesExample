package com.easyrules.rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

@Rule(name = "Simple Yes/No rule", description = "Prints Yes if rule says yes, and No, if rule evaluates to no.")
public class SimpleRule {

	/**
	 * The user input which represents the data that the rule will operate on.
	 */
	private String input;
	private boolean executed = false;

	public SimpleRule(String input) {
		this.input = input;
	}

	@Condition
	public boolean condition() {
		// The rule should be applied only if
		// the piece of data reads 'yes'
		return input.toLowerCase().contains("yes");
	}

	@Action
	public void action() throws Exception {
//		System.out.println("the SimpleRule action has fired!");
		executed = true;
	}

    public boolean isExecuted() {
        return executed;
    }
	
}