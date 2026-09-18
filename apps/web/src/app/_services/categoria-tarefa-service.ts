import { HttpClient } from '@angular/common/http';
import { inject, Service } from '@angular/core';
import { environment } from '@/environments/environment.development';
import { CategoriaResponse } from '../_types/response';


@Service()
export class CategoriaTarefaService {
    private apiUrl = `${environment.apiUrl}/categoria`;
    private http = inject(HttpClient);

    findAll() {
        return this.http.get<CategoriaResponse>(`${this.apiUrl}/findAll`);
    }
}
