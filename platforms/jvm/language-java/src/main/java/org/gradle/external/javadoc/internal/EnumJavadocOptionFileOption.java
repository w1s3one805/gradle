/*
 * Copyright 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Copyright 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.external.javadoc.internal;

import java.io.IOException;
import java.util.Locale;

/**
 * @param <T> The type which this option represents.
 */
public class EnumJavadocOptionFileOption<T> extends AbstractJavadocOptionFileOption<T> {
    public EnumJavadocOptionFileOption(String option, T value) {
        super(option, value);
    }

    @Override
    public void write(JavadocOptionFileWriterContext writerContext) throws IOException {
        if (value != null) {
            String s = value.toString();
            writerContext.writeOption(s.toLowerCase(Locale.ROOT));
        }
    }

    @Override
    public EnumJavadocOptionFileOption<T> duplicate() {
        return new EnumJavadocOptionFileOption<T>(option, value);
    }
}
