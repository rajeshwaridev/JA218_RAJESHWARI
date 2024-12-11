
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { PlayerService } from 'src/app/Service/player.service';
import { Player } from 'src/Model/Player';

@Component({
  selector: 'app-add-player',
  templateUrl: './add-player.component.html', 
  styleUrls: ['./add-player.component.css'], 
})
export class AddPlayerComponent {
  f: FormGroup;
  roles: string[] = ['BATSMAN', 'BOWLER', 'KEEPER', 'ALL_ROUNDER'];

  constructor(private fb: FormBuilder,private playerService:PlayerService) {
    this.f = this.fb.group({
      
      playerName: ['', [Validators.required, Validators.maxLength(50)]],
      jerseyNumber: ['', [Validators.required, Validators.max(500)]],
      role: ['', Validators.required],
      totalMatches: [1, [Validators.min(1)]],
      teamName: ['', [Validators.required, Validators.maxLength(50)]],
      country: ['', [Validators.required, Validators.maxLength(50)]],
      description: ['', [Validators.maxLength(500)]],
    });
  }

  addPlayer() {

  if (this.f.valid) {
    const playerDetails: Player = this.f.value; 

    
    this.playerService.addPlayer(playerDetails).subscribe(
      (response: any) => {
        console.log('Player added successfully:', response);
        alert('Player added successfully!');
        this.f.reset(); 
      },
      (error: any) => {
        console.error('Error adding player:', error);
        alert('An error occurred while adding the player.');
      }
    );
  } else {
    console.log('Form is invalid');
  }
}
  }


