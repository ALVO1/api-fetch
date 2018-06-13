package com.meteogroup.apifetch.fetch;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "fetching")
public class FetchingConfigProperties {

  private Integer poolSize;

  private List<FetchingTaskProperties> fetchingTaskProperties;

  public List<FetchingTaskProperties> getFetchingTaskProperties() {
    return fetchingTaskProperties;
  }

  public void setFetchingTaskProperties(List<FetchingTaskProperties> fetchingTaskProperties) {
    this.fetchingTaskProperties = fetchingTaskProperties;
  }

  public Integer getPoolSize() {
    return poolSize;
  }

  public void setPoolSize(Integer poolSize) {
    this.poolSize = poolSize;
  }

  public static class FetchingTaskProperties {
    private String description;
    private String request;
    private String responseRootKey;
    private String directory;
    private String filePrefix;
    private String fileExtension;
    private String frequency;

    public String getRequest() {
      return request;
    }

    public void setRequest(String request) {
      this.request = request;
    }

    public String getResponseRootKey() {
      return responseRootKey;
    }

    public void setResponseRootKey(String responseRootKey) {
      this.responseRootKey = responseRootKey;
    }

    public String getDirectory() {
      return directory;
    }

    public void setDirectory(String directory) {
      this.directory = directory;
    }

    public String getFilePrefix() {
      return filePrefix;
    }

    public void setFilePrefix(String filePrefix) {
      this.filePrefix = filePrefix;
    }

    public String getFileExtension() {
      return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
      this.fileExtension = fileExtension;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public String getFrequency() {
      return frequency;
    }

    public void setFrequency(String frequency) {
      this.frequency = frequency;
    }
  }
}
