import { Component } from '@angular/core';
import { PlayerService } from 'src/app/Service/player.service';
import { Player } from 'src/Model/Player';

@Component({
  selector: 'app-display-by-id',
  templateUrl: './display-by-id.component.html',
  styleUrls: ['./display-by-id.component.css']
})
export class DisplayByIdComponent {
  constructor(private playerService:PlayerService){



  }

 
  playerList!: Player;
  searchError: string | null = null;

     searchByPlayerId(data:any){

          //   console.log(data.playerId)

          // this.service.find(data.playerId).subscribe(

          //     (response)=>{  console.log(response); this.playerList = response; } ,

          //     (err)=>{ console.log(err)}


          // );
          this.playerService.find(data.playerId).subscribe({
            next: (player) => {
              this.playerList = player;
            },
            error: (err) => {
              this.searchError = err.message; // Display the error message
            }
          });
        }


     }
  

