package com.carlos.springboot.backend.apirest.models.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ReportGenerator {

    public void generateReport(String reportData) {
        // Implementation to generate a report based on the provided data
    }

    // For prototype beans, you may need to use ApplicationContext.getBean() to obtain a new instance each time.

}
