import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddPlayerComponent } from './Component/add-player/add-player.component';
import { DisplayAllPlayersComponent } from './Component/display-all-players/display-all-players.component';
import { DisplayByIdComponent } from './Component/display-by-id/display-by-id.component';
import { HomeComponent } from './Component/home/home.component';
import { UpdatePlayerComponent } from './Component/update-player/update-player.component';

const routes: Routes = [
  
  {path:'home',component:HomeComponent},
  {path:'display',component:DisplayAllPlayersComponent},
  {path:'update',component:UpdatePlayerComponent},
  {path:'insert',component:AddPlayerComponent},
  {path:'getbyplayerid',component:DisplayByIdComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
