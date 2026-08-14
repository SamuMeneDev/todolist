import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PainelCategoria } from './painel-categoria';

describe('PainelCategoria', () => {
  let component: PainelCategoria;
  let fixture: ComponentFixture<PainelCategoria>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PainelCategoria],
    }).compileComponents();

    fixture = TestBed.createComponent(PainelCategoria);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
