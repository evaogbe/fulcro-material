(ns ogbe.fulcro.mui.icons.article-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ArticleRounded" :default ArticleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-article-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArticleRounded)))