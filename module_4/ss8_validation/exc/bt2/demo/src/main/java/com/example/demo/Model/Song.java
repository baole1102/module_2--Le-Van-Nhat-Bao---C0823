package com.example.demo.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Size(min =2, max = 800,message = "Khong vuot qua 800 ky tu")
    @Pattern(regexp = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", message ="Khong dung dinh dang")
    @Pattern(regexp = "^[\\w+[\\s\\,]*]+$", message = "khond duoc phep chua ki tu dac biet ngoai tru dau phay!!")
    private String name;

    @NotBlank
    @Size(min =2,max = 300,message = "Khong vuot qua 300 ky tu")
    @Pattern(regexp = "^[\\w+[\\s\\,]*]+$", message = "khond duoc phep chua ki tu dac biet ngoai tru dau phay!!")
    @Pattern(regexp = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", message ="Khong dung dinh dang")
    private String singer;

    @NotBlank
    @Size(min =2,max = 1000,message = "Khong vuot qua 1000 ky tu")
    @Pattern(regexp = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", message ="Khong dung dinh dang")
    @Pattern(regexp = "^[\\w+[\\s\\,]*]+$", message = "khond duoc phep chua ki tu dac biet ngoai tru dau phay!!")
    private String tyleSong;

    public Song() {
    }

    public Song(int id, String name, String singer, String tyleSong) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.tyleSong = tyleSong;
    }
}
