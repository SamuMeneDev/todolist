import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeaderPainelCategoria } from './header-painel-categoria';

describe('HeaderPainelCategoria', () => {
  let component: HeaderPainelCategoria;
  let fixture: ComponentFixture<HeaderPainelCategoria>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HeaderPainelCategoria],
    }).compileComponents();

    fixture = TestBed.createComponent(HeaderPainelCategoria);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
