package com.ust.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;
@Data
@ConfigurationProperties("project")
@Component
public class ConfigProject {
	private int projectId;
	private String projectName;
	private String projectLocation;
	private double projectCost;
	private String projectStatus;
}
