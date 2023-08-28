package com.news.backend.handler;

import com.news.backend.entities.Reels;
import com.news.backend.repository.ReelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Component
public class OperationsCoordinator {
    private final ReelRepository reelRepository;
    public Mono<ServerResponse> getReelsPage(ServerRequest request) {
        int page = Integer.parseInt(request.queryParam("page").orElse("1"));
        int pageSize = 10;

        Flux<Reels> reels = reelRepository.findAll().skip(page * pageSize).take(pageSize);

        return ServerResponse.ok().body(reels, Reels.class);
    }
}
