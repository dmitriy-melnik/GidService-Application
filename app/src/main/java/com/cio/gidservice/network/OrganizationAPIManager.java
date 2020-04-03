package com.cio.gidservice.network;

import com.cio.gidservice.models.Organization;
import com.cio.gidservice.requestEntities.OrganizationRequestEntity;
import com.cio.gidservice.requestEntities.ServiceRequestEntity;

import java.util.List;

import retrofit2.*;
import retrofit2.http.*;


public interface OrganizationAPIManager {

    @GET("/organization/{user_id}/getAllOrganization")
    Call<List<Organization>> getOrganizationList(@Path("user_id") Long id);

    @POST("/organization/{user_id}/addOrganization")
    Call<List<Organization>> addOrganization(@Path("user_id") Long id, @Body OrganizationRequestEntity entity);

    @POST("/organization/{user_id}/addService")
    Call<Long> addService(@Path("user_id") Long user_id, @Body ServiceRequestEntity entity);

    @GET("/organization/{user_id}/getServices")
    Call<List<Organization.Service>> getServices(@Path("user_id") String userID, @Query("org_id") Long orgID);

}