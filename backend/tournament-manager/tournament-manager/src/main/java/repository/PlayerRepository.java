package repository;

import model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.PlayerService;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {
}
