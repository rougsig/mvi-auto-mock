package com.github.rougsig.fakito.runtime

import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class RxFakito(
  val value: KClass<*>
)
