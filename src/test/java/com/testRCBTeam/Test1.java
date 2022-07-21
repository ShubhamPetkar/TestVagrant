package com.testRCBTeam;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

@Listeners(com.testRCBTeam.ListenerTest.class)

public class Test1 {

	RCBTeam team = new RCBTeam();

	@Test
	void only4ForeignPlayers() throws IOException, ParseException {
		System.out.println("\n");
		team.foreignPlayers();
	}

	@Test
	void atLeastOneWicketKeeper() throws IOException, ParseException {
		System.out.println("\n");
		team.wicketKeeper();

	}

}
