(ns ogbe.fulcro.mui.icons.article-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ArticleSharp" :default ArticleSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-article-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArticleSharp)))