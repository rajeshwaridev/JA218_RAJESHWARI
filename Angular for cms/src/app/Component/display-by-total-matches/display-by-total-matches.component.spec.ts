import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayByTotalMatchesComponent } from './display-by-total-matches.component';

describe('DisplayByTotalMatchesComponent', () => {
  let component: DisplayByTotalMatchesComponent;
  let fixture: ComponentFixture<DisplayByTotalMatchesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisplayByTotalMatchesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplayByTotalMatchesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
