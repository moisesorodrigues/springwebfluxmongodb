package br.com.springwebflux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import br.com.springwebflux.document.Playlist;
import br.com.springwebflux.services.PlaylistService;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;
import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;

//Component
public class PlaylistHandler {
	
	@Autowired
	PlaylistService playlistService;
	
	public Mono<ServerResponse> findAll(ServerRequest serverRequest){
		return ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(playlistService.findAll(), Playlist.class);
	}
	
	public Mono<ServerResponse> findById(ServerRequest serverRequest){
		String id = serverRequest.pathVariable("id");
		return ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(playlistService.findById(id), Playlist.class);
	}
	
	public Mono<ServerResponse> save(ServerRequest serverRequest){
		final Mono<Playlist> playlist = serverRequest.bodyToMono(Playlist.class);
		return ok().
				contentType(MediaType.APPLICATION_JSON)
				.body(fromPublisher(playlist.flatMap(playlistService::save), Playlist.class));
	}

}
