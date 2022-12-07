(ns ogbe.fulcro.mui.icons.article
  #?(:cljs (:require
            ["@mui/icons-material/Article" :default Article]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-article
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Article)))