package MilliBilly.TurtleNeck.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Post {
    private Long id;
    private Long image_id;
    private Long user_id;
    private Integer like_count;
    private String location;
    private Date date_created;
    private Date date_withdraw;
    private Date last_updated;


    public Post(Long id, Long image_id, Long user_id, Integer like_count, String location, Date date_created, Date date_withdraw, Date last_updated) {
        this.id = id;
        this.image_id = image_id;
        this.user_id = user_id;
        this.like_count = like_count;
        this.location = location;
        this.date_created = date_created;
        this.date_withdraw = date_withdraw;
        this.last_updated = last_updated;
    }

}
