package co.com.pragma.franquicias.infrastructure.config;

import lombok.NonNull;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.logging.Logger;

import static co.com.pragma.franquicias.FranquiciasApplication.*;

public class BeanImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(@NonNull AnnotationMetadata importingClassMetadata) {

        String[] useCaseClasses = ScannerClasses.scannerClasses(USE_CASE_ROUTE);
        String[] serviceClasses = ScannerClasses.scannerClasses(SERVICE_ROUTE);
        String[] adapterClasses = ScannerClasses.scannerClasses(ADAPTER_ROUTE);

        String[] totalScanner = Arrays.copyOf(useCaseClasses, useCaseClasses.length + serviceClasses.length + adapterClasses.length);
        System.arraycopy(serviceClasses, 0, totalScanner, useCaseClasses.length, serviceClasses.length);
        System.arraycopy(adapterClasses, 0, totalScanner, useCaseClasses.length + serviceClasses.length, adapterClasses.length);

        Logger.getLogger(BeanImportSelector.class.getName()).info("Beans Importados: " + StringUtils.arrayToCommaDelimitedString(totalScanner));

        return totalScanner;
    }

}
