import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PainelTarefas } from './painel-tarefas';

describe('PainelTarefas', () => {
  let component: PainelTarefas;
  let fixture: ComponentFixture<PainelTarefas>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PainelTarefas],
    }).compileComponents();

    fixture = TestBed.createComponent(PainelTarefas);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
