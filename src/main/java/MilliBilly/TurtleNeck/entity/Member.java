package MilliBilly.TurtleNeck.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Member {
    private Long id;
    private String nickname;
    private String profileImg;
    private ArrayList<Member> follower;
    private ArrayList<Member> following;
    private ArrayList<HashTag> hashTags;

    public Member(Long id, String nickname, String profileImg) {
        this.id = id;
        this.nickname = nickname;
        this.profileImg = profileImg;
        this.follower = new ArrayList<>();
        this.following = new ArrayList<>();
        this.hashTags = new ArrayList<>();
    }

    public void setFollower(Member follower) {
        this.follower.add(follower);
    }

    public void setHashTags(HashTag hashTags) {
        this.hashTags.add(hashTags);
    }



}
