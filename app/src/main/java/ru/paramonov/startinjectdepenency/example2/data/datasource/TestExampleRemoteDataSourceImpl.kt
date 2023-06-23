package ru.paramonov.startinjectdepenency.example2.data.datasource

import android.util.Log
import ru.paramonov.startinjectdepenency.example2.data.network.ExampleApiService
import javax.inject.Inject

class TestExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
): ExampleRemoteDataSource {

    override fun method() {
        Log.d("TEST_IMPL", "TestExampleRemoteDataSource: $this")
        apiService.method()
    }
}