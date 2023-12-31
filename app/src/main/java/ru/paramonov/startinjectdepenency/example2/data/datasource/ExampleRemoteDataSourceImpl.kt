package ru.paramonov.startinjectdepenency.example2.data.datasource

import android.util.Log
import ru.paramonov.startinjectdepenency.example2.data.network.ExampleApiService
import ru.paramonov.startinjectdepenency.example2.di.MainRemoteDataSourceQualifier
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        Log.d("TEST_IMPL", "ExampleRemoteDataSourceImpl: $this")
        apiService.method()
    }
}
