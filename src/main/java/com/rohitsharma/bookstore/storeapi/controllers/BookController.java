package com.rohitsharma.bookstore.storeapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @GetMapping("/book")
      public String fetchAllBooks(){
         return "All Books";
     }
}
