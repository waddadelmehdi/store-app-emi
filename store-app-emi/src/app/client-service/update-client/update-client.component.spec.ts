import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateClientComponent } from './update-client.component';

describe('UpdateClientComponent', () => {
  let component: UpdateClientComponent;
  let fixture: ComponentFixture<UpdateClientComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [UpdateClientComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdateClientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
