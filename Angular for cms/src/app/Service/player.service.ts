import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Player } from 'src/Model/Player';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  baseURL:string = "http://localhost:8080/api/players/";

  constructor(private  http:HttpClient) {
    
    
    
  }

  
  addPlayer(player:Player):Observable<Player>{


    return  this.http.post<Player>(this.baseURL+"insert",player);

}

deleteById(pid:number):Observable<string>{
  console.log(pid);

  return  this.http.delete<string>(this.baseURL+`delete/${pid}`);

}


getAll():Observable<Player[]>{

  return this.http.get<Player[]>(this.baseURL+"getall");


}

find(playerId:number):Observable<Player>{


  console.log(playerId)
 return this.http.get<Player>(this.baseURL+`getByPlayerId/${playerId}`);

}


updatePlayerDetails(player:Player):Observable<Player>{


  return   this.http.put<Player>(this.baseURL+"update/"+player.playerId , player);


}
}
