package com.dracodia.openapi.api;

import com.dracodia.openapi.model.CreateUserRequest;
import com.dracodia.openapi.model.User;
import com.dracodia.openapi.model.UserType;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link UsersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-22T15:21:31.744693407+01:00[Europe/Warsaw]")
public interface UsersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /users : Create user
     * Creates new user with given type
     *
     * @param createUserRequest Create user body (required)
     * @return successful operation (status code 200)
     * @see UsersApi#createUser
     */
    default ResponseEntity<User> createUser(CreateUserRequest createUserRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"id\" : \"id\", \"accountBalance\" : 6.027456183070403, \"age\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /users : Get users list
     * Get users list
     *
     * @param userType user type (required)
     * @return OK (status code 200)
     * @see UsersApi#usersList
     */
    default ResponseEntity<List<User>> usersList(UserType userType) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"id\" : \"id\", \"accountBalance\" : 6.027456183070403, \"age\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
