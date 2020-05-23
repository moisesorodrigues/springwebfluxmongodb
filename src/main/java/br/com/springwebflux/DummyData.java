/*
 * package br.com.springwebflux;
 * 
 * import java.util.UUID;
 * 
 * import org.springframework.boot.CommandLineRunner; import
 * org.springframework.stereotype.Component;
 * 
 * import br.com.springwebflux.document.Playlist; import
 * br.com.springwebflux.repository.PlaylistRepository; import
 * reactor.core.publisher.Flux;
 * 
 * @Component public class DummyData implements CommandLineRunner{
 * 
 * private final PlaylistRepository playlistRepository;
 * 
 * DummyData(PlaylistRepository playlistRepository) { this.playlistRepository =
 * playlistRepository; }
 * 
 * @Override public void run(String... args) throws Exception {
 * playlistRepository.deleteAll() .thenMany( Flux.just("Spring Webflux",
 * "Deploy da aplicação na AWS", "Java 8", "GitHub", "Spring Security",
 * "API Restful", "Bean no Spring") .map(nome -> new
 * Playlist(UUID.randomUUID().toString(), nome))
 * .flatMap(playlistRepository::save)) .subscribe(System.out::println);
 * 
 * }
 * 
 * 
 * 
 * }
 */