package com.example.restaurant.wishlist.dto;


import com.example.restaurant.db.MemoryDbEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishListDto {

    private int index;
    private String title; //음식명 or 가게명(장소)
    private String category; //해당 카테고리
    private String address; //주소
    private String roadAddress; //도로명 주소
    private String homePageLink; //홈페이지 주소
    private String imageLink; //음식, 가게 이미지 주소
    private boolean isVisit; //방문 여부
    private int visitCount; //방문 횟수
    private LocalDateTime lastVisitDate; //마지막 방문 일자

}
