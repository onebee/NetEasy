package com.one.modular.complie;

import com.google.auto.service.AutoService;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedOptions;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;

/**
 * @author diaokaibin@gmail.com on 12/6/20.
 */

@AutoService(Processor.class)
@SupportedAnnotationTypes("com.one.modular.annotation.ARouter")
@SupportedSourceVersion(SourceVersion.RELEASE_7)
@SupportedOptions("content")
public class ARouterProcessor extends AbstractProcessor {

    private Elements elementUtils;
    private Types typeUtils;
    private Messager messager;
    private Filer filer;

    @Override
    public synchronized void init(ProcessingEnvironment environment) {
        super.init(environment);

        elementUtils = environment.getElementUtils();
        typeUtils = environment.getTypeUtils();
        messager = environment.getMessager();
        filer = environment.getFiler();


    }



    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment environment) {
        return false;
    }
}
