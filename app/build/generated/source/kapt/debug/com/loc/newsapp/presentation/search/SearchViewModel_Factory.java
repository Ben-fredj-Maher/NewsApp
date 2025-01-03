package com.loc.newsapp.presentation.search;

import com.loc.newsapp.domain.usecases.news.SearchNews;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class SearchViewModel_Factory implements Factory<SearchViewModel> {
  private final Provider<SearchNews> searchNewsUseCaseProvider;

  public SearchViewModel_Factory(Provider<SearchNews> searchNewsUseCaseProvider) {
    this.searchNewsUseCaseProvider = searchNewsUseCaseProvider;
  }

  @Override
  public SearchViewModel get() {
    return newInstance(searchNewsUseCaseProvider.get());
  }

  public static SearchViewModel_Factory create(Provider<SearchNews> searchNewsUseCaseProvider) {
    return new SearchViewModel_Factory(searchNewsUseCaseProvider);
  }

  public static SearchViewModel newInstance(SearchNews searchNewsUseCase) {
    return new SearchViewModel(searchNewsUseCase);
  }
}
