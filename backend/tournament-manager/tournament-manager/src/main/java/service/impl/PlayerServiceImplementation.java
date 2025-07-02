package service.impl;

import model.Player;
import repository.PlayerRepository;
import service.PlayerService;

import java.util.Optional;

public class PlayerServiceImplementation implements PlayerService {
    private PlayerRepository playerRepository;

    public PlayerServiceImplementation(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    @Override
    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player getPlayerById(Long id) {
        Optional <Player> player = playerRepository.findById(id);
        if(player.isPresent()){
            return player.get();
        }else{
            return null;
        }
    }
}
