import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayAllPlayersComponent } from './display-all-players.component';

describe('DisplayAllPlayersComponent', () => {
  let component: DisplayAllPlayersComponent;
  let fixture: ComponentFixture<DisplayAllPlayersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisplayAllPlayersComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplayAllPlayersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
