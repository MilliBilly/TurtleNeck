package MilliBilly.TurtleNeck.controller;

import MilliBilly.TurtleNeck.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
    @GetMapping("profile")
    public void getProfile(Member member){
        System.out.println("프로필 : " + member.getProfileImg());
        System.out.println("닉네임 : " + member.getNickname());
        System.out.println(member.getNickname() + "의 팔로워 수 : " +member.getFollower().size());
        System.out.println(member.getNickname() + "은 이런 사람이예여" + member.getHashTags());
    }
}
