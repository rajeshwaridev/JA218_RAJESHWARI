import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { PlayerService } from 'src/app/Service/player.service';
import { Player } from 'src/Model/Player';

@Component({
  selector: 'app-update-player',
  templateUrl: './update-player.component.html',
  styleUrls: ['./update-player.component.css']
})
export class UpdatePlayerComponent implements OnInit {
  f: FormGroup;
  roles: string[] = ['BATSMAN', 'BOWLER', 'KEEPER', 'ALL_ROUNDER'];
  isLoading: boolean = false;
  errorMessage: string | null = null;

  constructor(private fb: FormBuilder, private playerService: PlayerService) {
    this.f = this.fb.group({
      playerId: ['', [Validators.required]],
      playerName: ['', [Validators.required, Validators.maxLength(50)]],
      jerseyNumber: ['', [Validators.required, Validators.max(500)]],
      role: ['', Validators.required],
      totalMatches: [1, [Validators.min(0)]],
      teamName: ['', [Validators.required, Validators.maxLength(50)]],
      country: ['', [Validators.required, Validators.maxLength(50)]],
      description: ['', [Validators.maxLength(500)]],
    });
  }

  ngOnInit(): void {
    // If you want to preload a player's data for editing, you can load it here
    // Example: Fetch player data and patch the form values
    // this.playerService.getPlayerById(id).subscribe(player => this.f.patchValue(player));
  }

  updatePlayer() {
    if (this.f.valid) {
      const playerDetails: Player = this.f.value; // Assuming your model matches the form structure
      this.isLoading = true;
      this.errorMessage = null;

      this.playerService.updatePlayerDetails(playerDetails).subscribe(
        (response: Player) => {
          console.log('Player updated successfully:', response);
          alert('Player updated successfully!');
          this.f.reset(); // Reset the form
          this.isLoading = false;
        },
        (error: any) => {
          alert("Player Not exist with Given PlayerId");
          console.error('Error updating player:', error);
          this.errorMessage = 'An error occurred while updating the player.';
          this.isLoading = false;
        }
      );
    } else {
      console.log('Form is invalid');
    }
  }
  // f: FormGroup; // Form Group


}
