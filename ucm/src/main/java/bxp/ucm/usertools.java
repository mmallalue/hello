package bxp.ucm;

import java.io.*;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;

/**
 * Servlet implementation class usertools
 */
public class usertools extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String ciscouds = "_cisco-uds._tcp";
	       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public usertools() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Set response type
		response.setContentType("text/html");
		
		// Check Parameter values
		String userid = request.getParameter("userid");
		String udsserver = request.getParameter("udsserver");
		String operation = request.getParameter("type");
		String domain = request.getParameter("domain");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>\n<head><title>Jabber User Tool</title></head>\n" +
		"<ul>\n" +
				"<li><b>userid:    </b>" + userid + "\n" +
				"<li><b>domain:    </b>" + domain + "\n" +
				"<li><b>udsserver: </b>" + udsserver + "\n" +
				"<li><b>operation: </b>" + operation + "\n"
				);
		// Get Home Cluster
		String homeCluster = getHomeCluster(userid,udsserver);
		// Get User's details:
		//		-- existing devices
		//		-- user group membership
		//		-- recorded line status
		// if query
		// 		Print details
		// if add-devices
		//		if not recorded user
		//			Add Jabber devices
		
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	private String getHomeCluster(String userid, String udsserver) throws ServletException, IOException {
		String cluster = "UNKNOWN";
		
		
		
		return cluster;
		
	}
}
