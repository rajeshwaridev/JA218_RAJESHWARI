import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddPlayerComponent } from './Component/add-player/add-player.component';
import { DisplayAllPlayersComponent } from './Component/display-all-players/display-all-players.component';
import { DisplayByIdComponent } from './Component/display-by-id/display-by-id.component';
import { HomeComponent } from './Component/home/home.component';
import { UpdatePlayerComponent } from './Component/update-player/update-player.component';
// import { HoverDirective } from './hover.directive';
import { PlayerService } from './Service/player.service';

@NgModule({
  declarations: [
    AppComponent,
    AddPlayerComponent,
    DisplayAllPlayersComponent,
    UpdatePlayerComponent,
    DisplayByIdComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [PlayerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
