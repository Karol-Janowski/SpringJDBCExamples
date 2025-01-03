package pl.zajavka;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class NamedParameterJdbcTemplateExamples {

    private final SimpleDriverDataSource simpleDriverDataSource;

    void example() {
        NamedParameterJdbcTemplate template
                = new NamedParameterJdbcTemplate(simpleDriverDataSource);

        String sql = "INSERT INTO PERSON (NAME, AGE) VALUES (:name, :age)";

       Person person = Person.builder()
               .name("Agnieszka")
               .age(25)
               .build();

        BeanPropertySqlParameterSource params3 = new BeanPropertySqlParameterSource(person);

        template.update(sql, params3);
    }
}
