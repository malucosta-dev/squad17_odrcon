package com.auditoria.backend.dashboard;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:5173")

@RestController
public class DashboardController {

    @GetMapping("/api/reclamacoes-por-mes")
    public List<Map<String, Object>> reclamacoesPorMes() {
        return List.of(
                Map.of("mes", "Jan", "total", 10),
                Map.of("mes", "Fev", "total", 15),
                Map.of("mes", "Mar", "total", 8)
        );
    }

    @GetMapping("/api/reclamacoes-por-prioridade")
    public List<Map<String, Object>> reclamacoesPorPrioridade() {
        return List.of(
                Map.of("prioridade", "Alta", "total", 5),
                Map.of("prioridade", "Média", "total", 12),
                Map.of("prioridade", "Baixa", "total", 6)
        );
    }

    @GetMapping("/api/who5-por-mes")
    public List<Map<String, Object>> who5PorMes() {
        return List.of(
                Map.of("mes", "Jan", "media", 58),
                Map.of("mes", "Fev", "media", 55),
                Map.of("mes", "Mar", "media", 62)
        );
    }

    @GetMapping("/api/resumo")
    public Map<String, Object> resumo() {
        return Map.of(
                "totalReclamacoes", 23,
                "percentualResolvidas", 60,
                "mediaWho5", 62
        );
    }
}

