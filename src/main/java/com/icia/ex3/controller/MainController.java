package com.icia.ex3.controller;

import com.icia.ex3.dto.MemberDTO;
import com.icia.ex3.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/monday1")
    public String monday1(){
        return "monday1";
    }

    @GetMapping("/monday1-param")
    public String monday1Param(@RequestParam("month") String month,
                                @RequestParam("day") String day){
        System.out.println("month = " + month + ", day = " + day);
        return "index";

    }

    @GetMapping("/monday2")
    public String monday2(){

        return "monday2";
    }
    @GetMapping("/monday2-param")
    public String monday2Param(@RequestParam("name") String name, @RequestParam("mobile") String mobile, Model model){
        System.out.println("name = " + name + ", mobile = " + mobile);
        model.addAttribute("name", name);
        model.addAttribute("mobile", mobile);
        return "result2";
    }
    @GetMapping("/monday3")
    public String monday3(){

        return "monday3";
    }

//    @PostMapping("/monday3-param")
//    public String monday3Param(@RequestParam("email") String email, @RequestParam("password") String password, Model model){
//        System.out.println("email = " + email + ", password = " + password);
//        MemberDTO memberDTO = new MemberDTO();
//        memberDTO.setEmail(email);
//        memberDTO.setPassword(password);
//        model.addAttribute("member", memberDTO);
//        return "result3";
//    }

    @PostMapping("/monday3-param")
    public String monday3Param(@ModelAttribute MemberDTO memberDTO, Model model){
        System.out.println("memberDTO = " + memberDTO);
        model.addAttribute("member", memberDTO);
        return "result3";
    }
    @GetMapping("/monday4")
    public String monday4(Model model){
//      List<MemberDTO> newList = newMemberList();
//      model.addAttribute("memberList", newList);
        model.addAttribute("memberList",newMemberList());
        return "monday4";

    }

    private List<MemberDTO> newMemberList(){
        List<MemberDTO> memberDTOList = new ArrayList<>();
        for(int i=1; i<=10; i++){
            MemberDTO memberDTO = new MemberDTO();
            memberDTO.setId((long)i);
            memberDTO.setEmail("email"+i);
            memberDTO.setPassword("password"+i);
            memberDTO.setName("name"+i);
            memberDTO.setMobile("010-1111-111"+i);
            memberDTOList.add(memberDTO);
        }
        return memberDTOList;
    }

    @GetMapping("/monday5")
    public String monday5(){
        return "monday5";
    }

//    @PostMapping("/monday5-param")
////    체크 박스는 여러개의 선택이 가능해서 넘어올때 배열로 받아준다
//    public String monday5Param(@RequestParam("name") String name,
//                               @RequestParam("gender") String gender,
//                               @RequestParam("city") String city,
//                               @RequestParam("lang") String[] lang){
//        System.out.println("name = " + name + ", gender = " + gender + ", city = " + city + ", lang = " + Arrays.toString(lang));
//        return "index";
//    }

    @PostMapping("/monday5-param")
    public String monday5Param(@ModelAttribute MemberDTO memberDTO){
        System.out.println("memberDTO = " + memberDTO);
        return "index";
    }

    @GetMapping("/method1")
    public String method1(){
        //다른 클래스의 메소드를 호출하는 기본적인 방식
        // 스프링에서는 메모리용량 때문에 이렇게 사용하지 않음
//        MemberService memberService = new MemberService();
//        String result= memberService.method1();
//        System.out.println("result = " + result);

        //서비스 클래스에 서비스어노테이션을 써놔서
        // 스프링이 관리하는 객체가됬으니 가져다 쓰면된다
        String result= memberService.method1();
        System.out.println("result = " + result);


        return "index";
    }

    @GetMapping("/monday6")
    public String monday6(){
        return "monday6";
    }
    @PostMapping("/monday6-param")
    public String monday6Param(@ModelAttribute MemberDTO memberDTO){
        System.out.println("memberDTO = " + memberDTO);
        //memberService의 method2에다가 memberDTO객체를 넘기자
        memberService.method2(memberDTO);
        return "index";
    }


    @GetMapping("/aaaaa")
    public String aaaaa(){
        System.out.println("MainController.aaaaa");
        return "index";
    }
    @GetMapping("/bbbbb")
    public String bbbbb(){
        System.out.println("MainController.bbbbb");

        return "index";
    }




}
