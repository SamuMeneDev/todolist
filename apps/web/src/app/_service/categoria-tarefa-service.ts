import { HttpClient } from '@angular/common/http';
import { Service } from '@angular/core';

@Service()
export class CategoriaTarefaService {
    constructor(private http: HttpClient) {}

    findAll() {
        return this.http.get("");
    }
}
