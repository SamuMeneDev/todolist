import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TabsTarefas } from './tabs-tarefas';

describe('TabsTarefas', () => {
  let component: TabsTarefas;
  let fixture: ComponentFixture<TabsTarefas>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TabsTarefas],
    }).compileComponents();

    fixture = TestBed.createComponent(TabsTarefas);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
