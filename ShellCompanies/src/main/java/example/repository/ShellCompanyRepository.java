package example.repository;

import example.model.ShellCompany;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.PageableRepository;

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface ShellCompanyRepository extends PageableRepository<ShellCompany, Long> {
}