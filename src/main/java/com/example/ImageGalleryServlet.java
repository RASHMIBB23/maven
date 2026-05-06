package com.example;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ImageGalleryServlet", urlPatterns = {"/gallery"})
public class ImageGalleryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<String> images = Arrays.asList(
                "sunflower.svg",
                "mountains.svg",
                "cityscape.svg"
        );

        request.setAttribute("images", images);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/gallery.jsp");
        dispatcher.forward(request, response);
    }
}
