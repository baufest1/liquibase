package hellocucumber.nicebank;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AtmServlet extends HttpServlet {
    private static final String html =
            "<html><head><title>ATM</title>" +
                    "<style>" +
                    "body {background-color: #f2f2f2;}" +
                    "h1 {color: #4CAF50; text-align: center;}" +
                    "form {border: 3px solid #f1f1f1; padding: 20px;}" +
                    "label {display: block; margin-bottom: 10px;}" +
                    "input[type=text] {width: 100%; padding: 12px 20px; margin: 8px 0; box-sizing: border-box; border: 2px solid #ccc; border-radius: 4px;}" +
                    "button[type=submit] {background-color: #4CAF50; color: white; padding: 14px 20px; margin: 8px 0; border: none; border-radius: 4px; cursor: pointer;}" +
                    "</style></head>" +
                    "<body><h1>ATM</h1><form action=\"/withdraw\" method=\"post\">" +
                    "<label for=\"amount\">Amount</label>" +
                    "<input type=\"text\" id=\"amount\" name=\"amount\">" +
                    "<button type=\"submit\" id=\"withdraw\">Withdraw</button>" +
                    "</form></body></html>";

    protected void doGet(HttpServletRequest reques, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response
                .getWriter()
                .println(html);
    }
}
