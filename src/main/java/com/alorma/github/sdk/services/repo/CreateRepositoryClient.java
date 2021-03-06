package com.alorma.github.sdk.services.repo;

import android.content.Context;
import com.alorma.github.sdk.bean.dto.request.RepoRequestDTO;
import com.alorma.github.sdk.bean.dto.response.Repo;
import com.alorma.github.sdk.services.client.GithubClient;
import retrofit.RestAdapter;
import rx.Observable;

/**
 * Created by bernat.borras on 11/11/15.
 */
public class CreateRepositoryClient extends GithubClient<Repo> {

  private RepoRequestDTO repoRequestDTO;

  public CreateRepositoryClient(Context context, RepoRequestDTO repoRequestDTO) {
    super(context);
    this.repoRequestDTO = repoRequestDTO;
  }

  @Override
  protected Observable<Repo> getApiObservable(RestAdapter restAdapter) {
    return restAdapter.create(RepoService.class).create(repoRequestDTO);
  }
}
