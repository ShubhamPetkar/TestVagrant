package com.testRCBTeam;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class RCBTeam {

	public Object obj;
	public JSONObject playerdataobj;
	public JSONArray rcbPlayersArray;
	public String arr[];
	public Object country;
	public int i;
	JSONParser jsonParser = new JSONParser();

	protected void foreignPlayers() throws IOException, ParseException {
		FileReader reader = new FileReader(".\\jsonFile\\testData.json");
		obj = jsonParser.parse(reader);
		playerdataobj = (JSONObject) obj;
		rcbPlayersArray = (JSONArray) playerdataobj.get("player");
		String arr[] = new String[rcbPlayersArray.size()];
		for (int i = 0; i < rcbPlayersArray.size(); i++) {
			JSONObject players = (JSONObject) rcbPlayersArray.get(i);
			String country = (String) players.get("country");
			String name = (String) players.get("name");
			String role = (String) players.get("role");
			String priceInCr = (String) players.get("price-in-crores");
			arr[i] = name + "," + country + "," + role + "," + priceInCr;
			if (!"India".equals(country)) {
				System.out.println(arr[i]);
			}
		}
	}

	protected void wicketKeeper() throws IOException, ParseException {
		FileReader reader = new FileReader(".\\jsonFile\\testData.json");
		obj = jsonParser.parse(reader);
		playerdataobj = (JSONObject) obj;
		rcbPlayersArray = (JSONArray) playerdataobj.get("player");
		String arr[] = new String[rcbPlayersArray.size()];
		for (int i = 0; i < rcbPlayersArray.size(); i++) {
			JSONObject players = (JSONObject) rcbPlayersArray.get(i);
			String country = (String) players.get("country");
			String name = (String) players.get("name");
			String role = (String) players.get("role");
			String priceInCr = (String) players.get("price-in-crores");
			arr[i] = name + "," + country + "," + role + "," + priceInCr;
			if ("Wicket-keeper".equals(role)) {
				System.out.println(arr[i]);
			}
		}
	}
}