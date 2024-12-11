import { Component, OnInit } from '@angular/core';
import { PlayerService } from 'src/app/Service/player.service';
import { Counter } from 'src/Model/Counter';

@Component({
  selector: 'app-display-by-total-matches',
  templateUrl: './display-by-total-matches.component.html',
  styleUrls: ['./display-by-total-matches.component.css']
})
export class DisplayByTotalMatchesComponent implements OnInit {
  counters: Counter[] = [];

  constructor(private counterService: PlayerService) {}

  ngOnInit(): void {
    this.getCounters();
  }

  getCounters(): void {
    this.counterService.getByTotalMatches().subscribe({
      next: (data) => {
        this.counters = data;  // Assign the returned data to the counters array
      },
      error: (err) => {
        console.error('Error fetching counters:', err);
      },
    });
  }

}
