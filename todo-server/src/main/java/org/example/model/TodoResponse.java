package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoResponse {
    private Long id;
    private String title;
    private Long order;
    private Boolean completed;
    private String url;

    //TodoEntity를 Parameter로 받기 위한 처리
    public TodoResponse(TodoModel todoModel) {
        this.id = todoModel.getId();
        this.title = todoModel.getTitle();
        this.order = todoModel.getOrder();
        this.completed = todoModel.getCompleted();

        //Base url 저장
        this.url = "http://localhost:8080/" + this.id; //최대한 간단하게 구현하기 위해서 하드 코딩한 것임
    }
}
