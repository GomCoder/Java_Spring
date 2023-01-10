package com.example.interceptor.inteceptor;

import com.example.interceptor.annotation.Auth;
import com.example.interceptor.exception.AuthException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URI;

@Slf4j
@Component
public class AuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();

        URI uri= UriComponentsBuilder.fromUriString(request.getRequestURI())
                .query(request.getQueryString())
                .build()
                .toUri();

        log.info("request url : {}", url);
        boolean hasAnnotaion = checkAnnotaion(handler, Auth.class);
        log.info("has annotation: {}", hasAnnotaion);

        //나의 서버는 모두 public으로 동작을 하는데
        //단!! Auth 권한을 가진 요청에 대해서는 세션, 쿠키, Request Parameter, 특정 값을 보든 보겠다는 정책이 있을 것이다.
        if(hasAnnotaion) {
            //권한 체크
            String query = uri.getQuery();
            if(query.equals("name=steve")){
                return true;
            }
            throw new AuthException();
        }

       return true;
    }

    private boolean checkAnnotaion(Object handler, Class clazz){
        // resource javascript, html... 그외 리소스에 대한 요청은 모두 통과를 시켜주어야 되겠다(권한을 확인하지 않음)
        if(handler instanceof ResourceHttpRequestHandler){
            return true;
        }
        //annotaion check
        HandlerMethod handlerMethod = (HandlerMethod) handler;

        if(null != handlerMethod.getMethodAnnotation(clazz) || null != handlerMethod.getBeanType().getAnnotation(clazz)){
            //Auth annotation이 있을 떄는 true
            return true;
        }
        return false;
    }
}
