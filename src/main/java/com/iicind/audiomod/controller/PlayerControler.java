package com.iicind.audiomod.controller;

import com.iicind.audiomod.repository.PlayerRepository;
import com.iicind.audiomod.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dinesh_ch on 7/8/2016.
 */

//TO USE REST FULL SERVICES
@RestController
//TO POINT INPUT URL REQUEST
@RequestMapping("/players")
public class PlayerControler
{

    //ENABLE TO INJECTING BEANS EXPLICITLY
     @Autowired
    //CREATING PlayerRepository BEAN
            PlayerRepository repository;

    //TO GET ALL AUDIO RECORDS
     @RequestMapping("/getall")
       public Iterable<Player> getAllAudioRecordsInfo()
       {
           return repository.findAll();
       }

    //TO CREATE NEW AUDIO RECORD
    @RequestMapping("/create")
    public void createNewAudioRecord()
    {
        Player player=new Player();
        player.setAudioId(8470);
        player.setAction("VIEW");
        player.setComments("EXCELLENT");
        player.setReference("G66");
        player.setSource("REPOSITRY");
        player.setTopicName("FILTERS");
        player.setTrackLength("N67");
        player.setUserRecording("https://mvnrepository.com/");
        repository.save(player);
    }

    //TO GET THE CURRENT AUDIO RECORD
    @RequestMapping("/getcurrent")
    public Player getCurrentAudioRecord()
    {
        return repository.findOne(8055);
    }

    //TO DELETE CURRENT AUDIO RECORD
    @RequestMapping("/remove")
    public void removeCurrentAudioRecord()
    {
        repository.delete(8470);
    }

}
