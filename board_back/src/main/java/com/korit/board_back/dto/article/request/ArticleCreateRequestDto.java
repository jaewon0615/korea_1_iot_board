package com.korit.board_back.dto.article.request;

import lombok.Data;
import lombok.Getter;

@Getter
public class ArticleCreateRequestDto {
    private String title;
    private String content;
}
