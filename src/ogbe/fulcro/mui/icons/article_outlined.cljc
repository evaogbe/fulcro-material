(ns ogbe.fulcro.mui.icons.article-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ArticleOutlined" :default ArticleOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-article-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArticleOutlined)))