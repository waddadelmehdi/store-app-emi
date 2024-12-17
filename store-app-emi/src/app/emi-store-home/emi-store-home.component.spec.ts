import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmiStoreHomeComponent } from './emi-store-home.component';

describe('EmiStoreHomeComponent', () => {
  let component: EmiStoreHomeComponent;
  let fixture: ComponentFixture<EmiStoreHomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EmiStoreHomeComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmiStoreHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
