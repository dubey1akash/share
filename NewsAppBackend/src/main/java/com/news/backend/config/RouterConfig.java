package com.news.backend.config;

import com.news.backend.constant.ServiceConstants;
import com.news.backend.entities.Response;
import com.news.backend.handler.OperationsCoordinator;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springdoc.core.annotations.RouterOperation;
import org.springdoc.core.annotations.RouterOperations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfig {

    @Bean
    @RouterOperations({
            @RouterOperation(path = "/api/v1/api/reels",
                    produces = "application/json",
                    method = RequestMethod.GET,
                    beanClass = OperationsCoordinator.class,
                    beanMethod = "getReelsPage",
                    operation = @Operation(
                            tags = {"Reels API"},
                            operationId = "getReelsPage",
                            description = "Retrieve Reels",
                            responses = {
                                    @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(schema = @Schema(implementation = Response.class))),
                                    @ApiResponse(responseCode = "404", description = "User not found", content = @Content(schema = @Schema(implementation = Response.class)))
                            }
                    )
            )}
    )



    public RouterFunction<ServerResponse> userRoutes(OperationsCoordinator operationsCoordinator) {
        return RouterFunctions.route(RequestPredicates.GET(ServiceConstants.BASE_PATH + ServiceConstants.GET_REEL_BY_ROUTE), operationsCoordinator::getReelsPage);

    }
}
