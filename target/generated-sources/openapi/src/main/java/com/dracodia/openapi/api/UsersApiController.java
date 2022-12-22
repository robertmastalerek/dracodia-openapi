package com.dracodia.openapi.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-22T15:21:31.744693407+01:00[Europe/Warsaw]")
@Controller
@RequestMapping("${openapi.users.base-path:/api/v1}")
public class UsersApiController implements UsersApi {

    private final UsersApiDelegate delegate;

    public UsersApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) UsersApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new UsersApiDelegate() {});
    }

    @Override
    public UsersApiDelegate getDelegate() {
        return delegate;
    }

}
