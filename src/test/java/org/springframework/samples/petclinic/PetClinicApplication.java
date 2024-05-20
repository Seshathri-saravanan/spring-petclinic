
You need to use the `@ImportRuntimeHints` annotation on the `PetClinicApplication` class.

Then, add this code in the **PetClinicApplication** class as a bean method:

`@Bean
public LocaleResolver localeResolver() {
    SessionLocaleResolver slr = new SessionLocaleResolver();
    slr.setDefaultLocale(new Locale("en"));
    return slr;
}`

Then, you need to add the `@ImportRuntimeHints` annotation on the `PetClinicRuntimeHints` class as follows:

`@Component
public class PetClinicRuntimeHints implements RuntimeHints {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void registerHints(ApplicationContext context, Environment environment) {
        // comment
    }

    @Override
    public void afterPropertiesSet() throws BeansException {
        logger.info("Running with {}", "springboot");
    }
}`

