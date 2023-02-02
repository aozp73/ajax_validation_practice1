package shop.mtcoding.ajax3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import shop.mtcoding.ajax3.dto.ResponseDto;

@Controller
public class UserController {

    @GetMapping("/user/usernameSameCheck")
    public @ResponseBody ResponseDto<?> check(String username) {
        // 유효성 검사
        if (username == null || username.isEmpty()) {
            return new ResponseDto<>(-1, "아이디를 입력하세요", null);
        }

        if (username.equals("ssar")) {
            return new ResponseDto<>(1, "아이디가 중복됩니다", false);
        } else {
            return new ResponseDto<>(1, "해당 아이디로 가입 가능합니다", true);
        }
    }

    @GetMapping("/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }
}
