package br.com.springwebflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import br.com.springwebflux.document.Playlist;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String>{

}
