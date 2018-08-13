package com.thiendn.cleancodearchitecture.application.builder;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by thiendn on 8/11/18.
 */

@Scope
@Retention(RetentionPolicy.CLASS)
public @interface AppScope {
}
