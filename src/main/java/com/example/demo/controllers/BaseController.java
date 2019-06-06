package com.example.demo.controllers;

import com.example.demo.common.GoogleUtils;
import com.example.demo.common.UserAccount;
import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.URISyntaxException;

@CrossOrigin
@Controller
@RequestMapping
public class BaseController {

    @Autowired
    private GoogleUtils googleUtils;

//    @RequestMapping(value = { "/", "/login" })
//    public String login() {
//        return "login";
//    }

    @RequestMapping("/login-google")
    public RedirectView loginGoogle(HttpServletRequest request) throws ClientProtocolException, URISyntaxException, IOException {
        String code = request.getParameter("code");

        System.out.println(code);
        if (code == null || code.isEmpty()) {

            RedirectView redirectView = new RedirectView();
            redirectView.setUrl("http://localhost:4200/loginError");
            return redirectView;
        }

        String accessToken = googleUtils.getToken(code);

        UserAccount userAccount = googleUtils.getUserInfo(accessToken);
        UserDetails userDetail = googleUtils.buildUser(userAccount);

        System.out.println(userAccount.getEmail() + "-" + userAccount.getName()
                + "-" + userAccount.getId() + "-" + userAccount.getFamily_name()
                + "-" + userAccount.getGiven_name() + "-" + userAccount.getLink());
        System.out.println(userDetail.getUsername() + "-" + userDetail.getPassword() + "-" + userDetail.getAuthorities());

        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetail, null,
                userDetail.getAuthorities());
        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        SecurityContextHolder.getContext().setAuthentication(authentication);

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://localhost:4200/usersTable");
        return redirectView;
    }

//    @RequestMapping("/user")
//    public String user() {
//        return "user";
//    }
//
//    @RequestMapping("/admin")
//    public String admin() {
//        return "admin";
//    }
//
//    @RequestMapping("/403")
//    public String accessDenied() {
//        return "403";
//    }
}
