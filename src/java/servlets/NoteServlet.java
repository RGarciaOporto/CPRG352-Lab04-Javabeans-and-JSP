
package servlets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

public class NoteServlet extends HttpServlet{

    String title;
    String content;
    Note note;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //check if the note has been initialized
        if (note == null){
        //load up variables with info from our note.txt
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to read files
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        //read lines into our title and content variables
        title = br.readLine();
        content = br.readLine();
        
        //create a Note object with the variables that hold the note.txt data 
        note = new Note(title, content);
        }
        //display variable values in the JSP
        request.setAttribute("note", note);
        if (request.getParameter("edit") != null) {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request,response);
        return;
        }
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //read in data in the input values
        title = request.getParameter("edit_title");
        content = request.getParameter("edit_content");
        
        //set that data as the title and content for the Note object
        note.setTitle(title);
        note.setContent(content);
        
        //display them back to the JSP
        request.setAttribute("note", note);
        if (request.getParameter("edit") != null) {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request,response);
        return;
        }
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
        return;
    }

    

}
