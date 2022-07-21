package org.prgrms.kdt.order;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.config.BeanExpressionResolver;
import org.springframework.beans.factory.config.SingletonBeanRegistry;
import org.springframework.lang.Nullable;

public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {
    String SCOPE_SINGLETON = "singleton";
    String SCOPE_PROTOTYPE = "prototype";

    void setParentBeanFactory(BeanFactory var1) throws IllegalStateException;

    void setBeanClassLoader(@Nullable ClassLoader var1);

    @Nullable
    ClassLoader getBeanClassLoader();

    void setTempClassLoader(@Nullable ClassLoader var1);

    @Nullable
    ClassLoader getTempClassLoader();

    void setCacheBeanMetadata(boolean var1);

    boolean isCacheBeanMetadata();

    void setBeanExpressionResolver(@Nullable BeanExpressionResolver var1);

    @Nullable
    BeanExpressionResolver getBeanExpressionResolver();


}
