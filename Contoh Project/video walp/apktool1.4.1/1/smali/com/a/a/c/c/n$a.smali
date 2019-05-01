.class public Lcom/a/a/c/c/n$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/c/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lcom/a/a/c/h;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/a/a/c/h;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/a/a/c/a/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/a/a/c/a/d",
            "<TData;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/a/a/c/h;Lcom/a/a/c/a/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/h;",
            "Lcom/a/a/c/a/d",
            "<TData;>;)V"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lcom/a/a/c/c/n$a;-><init>(Lcom/a/a/c/h;Ljava/util/List;Lcom/a/a/c/a/d;)V

    return-void
.end method

.method public constructor <init>(Lcom/a/a/c/h;Ljava/util/List;Lcom/a/a/c/a/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/h;",
            "Ljava/util/List",
            "<",
            "Lcom/a/a/c/h;",
            ">;",
            "Lcom/a/a/c/a/d",
            "<TData;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/c/h;

    iput-object v0, p0, Lcom/a/a/c/c/n$a;->a:Lcom/a/a/c/h;

    invoke-static {p2}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/a/a/c/c/n$a;->b:Ljava/util/List;

    invoke-static {p3}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/c/a/d;

    iput-object v0, p0, Lcom/a/a/c/c/n$a;->c:Lcom/a/a/c/a/d;

    return-void
.end method
