package com.scm.scm.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    
    @GetMapping("/home") // Agar /home endpoint aaya to ye function chalana
    public String home(Model model){ // Iska return type hai html file ka naam jo ki string hoga. Baaki kaam spring boot kar lega
        System.out.println("Home Page Handler");
        model.addAttribute("Name","Know Yourself");
        model.addAttribute("Founder","Priyanshu Mishra");
        model.addAttribute("GitHub","https://github.com/PriyanshuMishra4001");
        return "home"; // Jo page return karna hai uska naam likh do.
    }

    @GetMapping("/about")
    public String aboutPage(){
        System.out.println("About Page Loading");
        return "about";
    }

    @GetMapping("/services")
    public String servicesPage(Model model){
        model.addAttribute("isLogin", true);
        return "services";
    }
}


/*
 * 1. What is Model?
The Model is a Spring framework interface that helps pass data from your 
controller to the view (e.g., HTML file).
It acts as a container where you can add attributes (key-value pairs) that 
the view can use to display dynamic content.
 * In the code:
        model.addAttribute("Name", "Know Yourself");
Adds a Name attribute with the value "Know Yourself" to the model, which 
the view (HTML page) can access.

2. What is @GetMapping?
@GetMapping is a Spring annotation used to map HTTP GET requests to 
specific handler methods.
In this case:
        @GetMapping("/home")
Maps any HTTP GET request made to the /home URL to the home() method.

3. Why is the return type of the function a String?
The return type of the function specifies the name of the view (HTML file) 
to render.
In Spring MVC, when you return a string from a controller method, it tells 
the framework to look for an HTML file with that name in the templates 
directory.

4. How is home.html being returned?
When the home() method returns "home", Spring looks for a template file 
named home.html in the default location for views:
src/main/resources/templates/home.html
This behavior relies on the Thymeleaf template engine (or other template 
engines like Freemarker or JSP) configured in your Spring Boot 
application.
 */