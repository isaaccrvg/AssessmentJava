package programa;

public class Cgi {
    public static void main(String[] args) {
        //Header
        System.out.println("Content-Type: text/html");
        System.out.println();

        //Html
        System.out.println("<html>");
        System.out.println("<head> " +
                "<title>" +
                "Saudação CGI" +
                "</title> " +
                "</head>");
        System.out.println("<body>");
        System.out.println("<h1>olá, Terráqueos!</h1>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
