package com.dao;

import java.util.ArrayList;

import java.util.List;
import com.beans.Player;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
* <h1>Application Dao</h1>
* This class implements all the methods to access the PlayerInfo Table in the 
* Player Database
*
* @author  https://github.com/e-business-app
* @version 1.0
* @since   2019-01-31
*/

public class ApplicationDao {
	/**
	 * 
	 * Pass a String and search for players in the database which match the 
	 * fullname.
	 * 
	 * It will return all the players in the form of a list.
	 * 
	 * @param searchPlayer
	 * @return the list of Player Objects Found.
	 * 
	 */
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
				player.setRating(set.getInt("rating"));
				player.setPotential(set.getInt("potential"));
				player.setTeam(set.getString("team"));
				player.setPrice(set.getString("price"));
				player.setWage(set.getString("wage"));
				player.setTotalStats(set.getInt("totalstats"));
				players.add(player);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return players;
	}

}
