.class Landroid/support/v7/widget/t$a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v7/widget/RecyclerView$LayoutManager$LayoutPrefetchRegistry;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:I

.field b:I

.field c:[I

.field d:I


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/widget/t$a;->c:[I

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/t$a;->c:[I

    const/4 v1, -0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/t$a;->d:I

    return-void
.end method

.method a(II)V
    .locals 0

    iput p1, p0, Landroid/support/v7/widget/t$a;->a:I

    iput p2, p0, Landroid/support/v7/widget/t$a;->b:I

    return-void
.end method

.method a(Landroid/support/v7/widget/RecyclerView;Z)V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/t$a;->d:I

    iget-object v0, p0, Landroid/support/v7/widget/t$a;->c:[I

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/t$a;->c:[I

    const/4 v1, -0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    :cond_0
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView;->mLayout:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    iget-object v1, p1, Landroid/support/v7/widget/RecyclerView;->mAdapter:Landroid/support/v7/widget/RecyclerView$Adapter;

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->isItemPrefetchEnabled()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz p2, :cond_3

    iget-object v1, p1, Landroid/support/v7/widget/RecyclerView;->mAdapterHelper:Landroid/support/v7/widget/c;

    invoke-virtual {v1}, Landroid/support/v7/widget/c;->d()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p1, Landroid/support/v7/widget/RecyclerView;->mAdapter:Landroid/support/v7/widget/RecyclerView$Adapter;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v1

    invoke-virtual {v0, v1, p0}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->collectInitialPrefetchPositions(ILandroid/support/v7/widget/RecyclerView$LayoutManager$LayoutPrefetchRegistry;)V

    :cond_1
    :goto_0
    iget v1, p0, Landroid/support/v7/widget/t$a;->d:I

    iget v2, v0, Landroid/support/v7/widget/RecyclerView$LayoutManager;->mPrefetchMaxCountObserved:I

    if-le v1, v2, :cond_2

    iget v1, p0, Landroid/support/v7/widget/t$a;->d:I

    iput v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutManager;->mPrefetchMaxCountObserved:I

    iput-boolean p2, v0, Landroid/support/v7/widget/RecyclerView$LayoutManager;->mPrefetchMaxObservedInInitialPrefetch:Z

    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView;->mRecycler:Landroid/support/v7/widget/RecyclerView$Recycler;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$Recycler;->updateViewCacheSize()V

    :cond_2
    return-void

    :cond_3
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->hasPendingAdapterUpdates()Z

    move-result v1

    if-nez v1, :cond_1

    iget v1, p0, Landroid/support/v7/widget/t$a;->a:I

    iget v2, p0, Landroid/support/v7/widget/t$a;->b:I

    iget-object v3, p1, Landroid/support/v7/widget/RecyclerView;->mState:Landroid/support/v7/widget/RecyclerView$State;

    invoke-virtual {v0, v1, v2, v3, p0}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->collectAdjacentPrefetchPositions(IILandroid/support/v7/widget/RecyclerView$State;Landroid/support/v7/widget/RecyclerView$LayoutManager$LayoutPrefetchRegistry;)V

    goto :goto_0
.end method

.method a(I)Z
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Landroid/support/v7/widget/t$a;->c:[I

    if-eqz v1, :cond_0

    iget v1, p0, Landroid/support/v7/widget/t$a;->d:I

    mul-int/lit8 v2, v1, 0x2

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    iget-object v3, p0, Landroid/support/v7/widget/t$a;->c:[I

    aget v3, v3, v1

    if-ne v3, p1, :cond_1

    const/4 v0, 0x1

    :cond_0
    return v0

    :cond_1
    add-int/lit8 v1, v1, 0x2

    goto :goto_0
.end method

.method public addPosition(II)V
    .locals 5

    const/4 v4, 0x0

    if-gez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Layout positions must be non-negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-gez p2, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Pixel distance must be non-negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Landroid/support/v7/widget/t$a;->d:I

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Landroid/support/v7/widget/t$a;->c:[I

    if-nez v1, :cond_3

    const/4 v1, 0x4

    new-array v1, v1, [I

    iput-object v1, p0, Landroid/support/v7/widget/t$a;->c:[I

    iget-object v1, p0, Landroid/support/v7/widget/t$a;->c:[I

    const/4 v2, -0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    :cond_2
    :goto_0
    iget-object v1, p0, Landroid/support/v7/widget/t$a;->c:[I

    aput p1, v1, v0

    iget-object v1, p0, Landroid/support/v7/widget/t$a;->c:[I

    add-int/lit8 v0, v0, 0x1

    aput p2, v1, v0

    iget v0, p0, Landroid/support/v7/widget/t$a;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid/support/v7/widget/t$a;->d:I

    return-void

    :cond_3
    iget-object v1, p0, Landroid/support/v7/widget/t$a;->c:[I

    array-length v1, v1

    if-lt v0, v1, :cond_2

    iget-object v1, p0, Landroid/support/v7/widget/t$a;->c:[I

    mul-int/lit8 v2, v0, 0x2

    new-array v2, v2, [I

    iput-object v2, p0, Landroid/support/v7/widget/t$a;->c:[I

    iget-object v2, p0, Landroid/support/v7/widget/t$a;->c:[I

    array-length v3, v1

    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method