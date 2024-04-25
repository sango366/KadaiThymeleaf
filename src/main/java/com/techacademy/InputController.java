package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    /*output.htmlからのパラメータが送られてくる
     　@RequestParamｗを使い、HTTPリクエストのパラメーターを取得する
     　初回アクセス時はpreviousはoutput.htmlのリンクから送られてこないため、if文で条件分岐させる
     */
    @GetMapping("/input")
    public String getInput(@RequestParam("previous")String previous, Model model) {
        if(previous != null) {
            model.addAttribute("previous",previous);
        }
        // input.htmlに画面遷移
        return "input";
    }
}
