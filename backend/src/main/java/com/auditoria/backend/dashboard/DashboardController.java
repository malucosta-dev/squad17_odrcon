package com.auditoria.backend.dashboard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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
}