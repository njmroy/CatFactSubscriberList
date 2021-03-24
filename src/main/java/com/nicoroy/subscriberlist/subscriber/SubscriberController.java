package com.nicoroy.subscriberlist.subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
    public class SubscriberController {

      @Autowired
      private SubscriberRepository subscriberRepository;
      
      @GetMapping(value= "/")
      public String index(Subscriber subscriber) {
        return "subscriber/index";}
      
      
      @PostMapping(value = "/")
      public String addNewSubscriber(Subscriber subscriber, Model model) {
          subscriberRepository.save(new Subscriber(subscriber.getFirstName(), 
              subscriber.getLastName(), subscriber.getUserName(), subscriber.getSignedUp(), subscriber.getEmail() ) );
          model.addAttribute("firstName", subscriber.getFirstName());
          model.addAttribute("lastName", subscriber.getLastName());
          model.addAttribute("userName", subscriber.getUserName());
          model.addAttribute("email", subscriber.getEmail());
          return "subscriber/result";
      }
   }