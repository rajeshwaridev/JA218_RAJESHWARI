import { Component } from '@angular/core';
import { PlayerService } from 'src/app/Service/player.service';
import { Player } from 'src/Model/Player';

@Component({
  selector: 'app-display-all-players',
  templateUrl: './display-all-players.component.html',
  styleUrls: ['./display-all-players.component.css']
})
export class DisplayAllPlayersComponent {
  playerList: Player[] = [];
    
  constructor(private service:PlayerService ){



    }

    getAllPlayers(){

      this.service.getAll().subscribe(

          (players)=>{ 

          
            this.playerList = players; 

            console.log(this.playerList)
          } ,

          (err)=>{ console.log(err)}

      )


}
deleteById(playerid:number){
  console.log(playerid);

  this.service.deleteById(playerid).subscribe(

      ()=>{console.log(playerid+ "record deleted")} , (err)=>{console.log(err)}


  );
  alert('Player Deleted successfully!');

    this.getAllPlayers();

}


}
