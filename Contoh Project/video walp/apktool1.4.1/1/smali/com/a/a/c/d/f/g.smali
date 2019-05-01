.class public Lcom/a/a/c/d/f/g;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/d/f/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/a/a/c/d/f/e",
        "<TZ;TZ;>;"
    }
.end annotation


# static fields
.field private static final a:Lcom/a/a/c/d/f/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/a/a/c/d/f/g",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/a/a/c/d/f/g;

    invoke-direct {v0}, Lcom/a/a/c/d/f/g;-><init>()V

    sput-object v0, Lcom/a/a/c/d/f/g;->a:Lcom/a/a/c/d/f/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/a/a/c/d/f/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/a/a/c/d/f/e",
            "<TZ;TZ;>;"
        }
    .end annotation

    sget-object v0, Lcom/a/a/c/d/f/g;->a:Lcom/a/a/c/d/f/g;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/a/a/c/b/u;Lcom/a/a/c/j;)Lcom/a/a/c/b/u;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/b/u",
            "<TZ;>;",
            "Lcom/a/a/c/j;",
            ")",
            "Lcom/a/a/c/b/u",
            "<TZ;>;"
        }
    .end annotation

    return-object p1
.end method
