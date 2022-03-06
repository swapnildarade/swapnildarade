package model;

import javax.servlet.annotation.WebServlet;

@WebServlet("/Search")
public abstract class Search {
    public static String date;
    public static String day;
    public static String source;
    public static String destination;
    public static int persons;

    public static String getQuery() {
        return "select * from plane where Source = '"+source+"' AND destination='"+destination+"'";
    }
}
