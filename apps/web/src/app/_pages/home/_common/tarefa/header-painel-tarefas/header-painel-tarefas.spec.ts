import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeaderPainelTarefas } from './header-painel-tarefas';

describe('HeaderPainelTarefas', () => {
  let component: HeaderPainelTarefas;
  let fixture: ComponentFixture<HeaderPainelTarefas>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HeaderPainelTarefas],
    }).compileComponents();

    fixture = TestBed.createComponent(HeaderPainelTarefas);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
