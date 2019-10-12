/*
 * Copyright (C) 2000-2019 Heinz Max Kabutz
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.  Heinz Max Kabutz licenses
 * this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.javaspecialists.books.dynamicproxies.ch01;

public class ProxyVsDecorator {
    public static class Proxy {
        // tag::listing1[]
        // Proxy
        public interface A {
            public void f();
        }
        public class B implements A {
            public void f() { /* do something */ }
        }
        public class C implements A {
            private A a;
            public C(A a) { this.a = a; }
            public void f() {
                /* do something, then */
                a.f();
            }
        }
        // end::listing1[]
    }
    public static class Decorator {
        // tag::listing2[]
        // Decorator
        public interface A {
            public void f();
        }
        public class B implements A {
            public void f() { /* do something */ }
        }
        public class C implements A {
            private A a;
            public C(A a) { this.a = a; }
            public void f() {
                /* do something, then */
                a.f();
            }
        }
        class D extends C {
            public D(A a) { super(a); }
            public void g() {
                /* decorate in some way, then call f() */
                f();
            }
        }
        // end::listing2[]
    }
}