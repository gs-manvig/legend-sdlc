// Copyright 2020 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.sdlc.server.application.project;

import org.finos.legend.sdlc.domain.model.project.ProjectType;

import java.util.List;

public class CreateProjectCommand
{
    private String name;
    private String description;
    private ProjectType type;
    private String groupId;
    private String artifactId;
    private List<String> tags;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    @Deprecated
    public ProjectType getType()
    {
        return this.type;
    }

    @Deprecated
    public void setType(ProjectType type)
    {
        this.type = type;
    }

    public String getGroupId()
    {
        return this.groupId;
    }

    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }

    public String getArtifactId()
    {
        return this.artifactId;
    }

    public void setArtifactId(String artifactId)
    {
        this.artifactId = artifactId;
    }

    public List<String> getTags()
    {
        return this.tags;
    }

    public void setTags(List<String> tags)
    {
        this.tags = tags;
    }
}
