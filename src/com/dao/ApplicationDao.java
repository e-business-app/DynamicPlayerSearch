package com.dao;

import java.util.ArrayList;
import java.util.List;
import com.beans.Player;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ApplicationDao {
	
	public List<Player> searchPlayer(String searchPlayer) {
		Player player=null;
		List <Player> players= new ArrayList<Player>();
		
		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			String sql = "select * from playerinfo where fullname like '%"+searchPlayer+"%'";
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery(sql);
			while(set.next()) {
				player=new Player();
				player.setId(set.getInt("id"));
				player.setCountry(set.getString("country"));
				player.setAge(set.getInt("age"));
				player.setFullName(set.getString("fullname"));
				players.add(player);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return players;
	}

}
