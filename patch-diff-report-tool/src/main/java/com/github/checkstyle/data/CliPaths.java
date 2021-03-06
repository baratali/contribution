////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code for adherence to a set of rules.
// Copyright (C) 2001-2016 the original author or authors.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
////////////////////////////////////////////////////////////////////////////////

package com.github.checkstyle.data;

import java.nio.file.Path;

/**
 * POJO class that hold input paths.
 * @author attatrol
 */
public class CliPaths {
    /**
     * Path to the first checkstyle-report.xml.
     */
    private Path baseReportPath;

    /**
     * Path to the second checkstyle-report.xml.
     */
    private Path patchReportPath;

    /**
     * Path to the data, tested by checkstyle.
     */
    private Path sourcePath;

    /**
     * Path to the result site.
     */
    private Path resultPath;

    /**
     * Path to the data, tested by checkstyle.
     */
    private Path baseConfigPath;

    /**
     * Path to the result site.
     */
    private Path patchConfigPath;

    /**
     * POJO ctor.
     *
     * @param baseReportPath
     *        path to the base checkstyle-report.xml.
     * @param patchReportPath
     *        path to the patch checkstyle-report.xml.
     * @param sourcePath
     *        path to the data, tested by checkstyle.
     * @param resultPath
     *        path to the result site.
     * @param patchConfigPath
     *        path to the configuration of the base report.
     * @param baseConfigPath
     *        path to the configuration of the patch report.
     */
    public CliPaths(Path baseReportPath, Path patchReportPath,
            Path sourcePath, Path resultPath, Path baseConfigPath, Path patchConfigPath) {
        this.baseReportPath = baseReportPath;
        this.patchReportPath = patchReportPath;
        this.sourcePath = sourcePath;
        this.resultPath = resultPath;
        this.baseConfigPath = baseConfigPath;
        this.patchConfigPath = patchConfigPath;
    }

    public Path getBaseReportPath() {
        return baseReportPath;
    }

    public Path getPatchReportPath() {
        return patchReportPath;
    }

    public Path getSourcePath() {
        return sourcePath;
    }

    public Path getResultPath() {
        return resultPath;
    }

    public Path getBaseConfigPath() {
        return baseConfigPath;
    }

    public Path getPatchConfigPath() {
        return patchConfigPath;
    }

    /**
     * Checks if configuration paths are present.
     *
     * @return true if they are not null.
     */
    public boolean configurationPresent() {
        return baseConfigPath != null && patchConfigPath != null;
    }

}
