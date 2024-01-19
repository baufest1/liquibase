package hellocucumber.nicebank;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletContext;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class AtmServer {
    private Server server;

    public AtmServer(int port) {
        server = new Server(port);
        ServletContextHandler contextHandler
                = new ServletContextHandler(ServletContextHandler.SESSIONS);
        contextHandler.setContextPath("/");
        server.setHandler(contextHandler);
        contextHandler.addServlet(new ServletHolder(new AtmServlet()), "/*");
    }

    public void start() throws Exception {
        server.start();
        System.out.println("**** Listening on " + server.getURI());
        Thread.sleep(20000);
    }

    public void stop() throws Exception {
        server.stop();
    }
}
