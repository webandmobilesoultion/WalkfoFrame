package com.raoul.walkfoframe.maputtiliy.clustering.algo;

import com.raoul.walkfoframe.maputtiliy.clustering.Cluster;
import com.raoul.walkfoframe.maputtiliy.clustering.ClusterItem;

import java.util.Collection;
import java.util.Set;

/**
 * Logic for computing clusters
 */
public interface Algorithm<T extends ClusterItem> {
    void addItem(T item);

    void addItems(Collection<T> items);

    void clearItems();

    void removeItem(T item);

    Set<? extends Cluster<T>> getClusters(double zoom);

    Collection<T> getItems();
}