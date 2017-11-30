package org.millr.test;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.io.UnsupportedEncodingException;

@Model(
        adaptables = { SlingHttpServletRequest.class },
        resourceType = "charset/localeContent",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = "jackson", extensions = "json")
public class LocaleContent {

    @ValueMapValue
    private String localeModalText;

    public String getLocaleModalText() {
        return localeModalText;
    }
}
