package com.meteogroup.apifetch.fetch;

import com.meteogroup.apifetch.fetch.service.FetchService;
import com.meteogroup.apifetch.process.FetchedContentProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class FetchTask<T> implements Runnable {

  private static final Logger LOGGER = LoggerFactory.getLogger(FetchTask.class);

  protected final String description;
  protected final FetchService<T> fetchService;
  protected final FetchedContentProcessor<T> contentProcessor;

  protected FetchTask(String description,
                      FetchService<T> fetchService,
                      FetchedContentProcessor<T> contentProcessor) {
    this.description = description;
    this.fetchService = fetchService;
    this.contentProcessor = contentProcessor;
  }

  @Override
  public void run() {
    LOGGER.info("====> Starting executing task: {}", description);
    processFetchedData();
    LOGGER.info("<==== Finished executing task: {}", description);
  }

  protected abstract void processFetchedData();
}
