package service;

import model.Player;

public interface PlayerService {
    Player savePlayer(Player player);

    Player getPlayerById(Long id);
}
