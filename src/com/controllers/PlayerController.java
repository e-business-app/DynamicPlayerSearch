package com.controllers;

import java.lang.NullPointerException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Player;
import com.dao.ApplicationDao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;


/**
 * Servlet implementation class PlayerController
 */
// @WebServlet("/Player")
public class PlayerController extends AppController {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlayerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pathInfo = request.getPathInfo(); // /{value}/test
		response.setContentType("application/json");
		PrintWriter writer=response.getWriter();
		String player="";
		try {
			String[] pathParts = pathInfo.split("/");
			player = pathParts[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("Complete Search");
		}catch(NullPointerException e) {
			writer.append("{'err':'Please Enter a Valid Search Term'}");
			return;
		}
		ApplicationDao dao= new ApplicationDao();
		List<Player> players= dao.searchPlayer(player);
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		ObjectMapper mapper= new ObjectMapper();
	      try
	      {
	         mapper.writeValue(out, players);
	         String JSONString=new String(out.toByteArray());
	         writer.append(JSONString);
	         return;
	      } catch (JsonGenerationException e)
	      {
	         e.printStackTrace();
	      } catch (JsonMappingException e)
	      {
	         e.printStackTrace();
	      } catch (IOException e)
	      {
	         e.printStackTrace();
	      }
	      writer.append("Error");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
