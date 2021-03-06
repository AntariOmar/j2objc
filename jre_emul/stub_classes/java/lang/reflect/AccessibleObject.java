/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package java.lang.reflect;

import java.lang.annotation.Annotation;

/**
 * Stub implementation of AccessibleObject. The actual implementation is in
 * AccessibleObject.h and AccessibleObject.m, so the declared methods in this
 * class should match the actual methods implemented in order to catch
 * unsupported API references.
 * 
 * @see java.lang.Object
 */
public class AccessibleObject implements AnnotatedElement {

  protected AccessibleObject() {}

  public boolean isAccessible() {
    return false;
  }

  public void setAccessible(boolean b) throws SecurityException {}

  public static void setAccessible(AccessibleObject[] objects, boolean b)
      throws SecurityException {}

  public <T extends Annotation> T getAnnotation(Class<T> annotationClass) {
    return null;
  }

  public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {
    return false;
  }

  public Annotation[] getAnnotations() {
    return null;
  }

  public Annotation[] getDeclaredAnnotations() {
    return null;
  }

  public <T extends Annotation> T getDeclaredAnnotation(Class<T> annotationClass) {
    return null;
  }

  public <T extends Annotation> T[] getAnnotationsByType(Class<T> annotationClass) {
    return null;
  }

  public <T extends Annotation> T[] getDeclaredAnnotationsByType(Class<T> annotationClass) {
    return null;
  }
}
