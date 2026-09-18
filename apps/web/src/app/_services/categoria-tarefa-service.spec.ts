import { TestBed } from '@angular/core/testing';

import { CategoriaTarefaService } from './categoria-tarefa-service';

describe('CategoriaTarefaService', () => {
  let service: CategoriaTarefaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CategoriaTarefaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
