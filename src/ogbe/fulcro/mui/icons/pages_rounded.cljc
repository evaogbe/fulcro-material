(ns ogbe.fulcro.mui.icons.pages-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PagesRounded" :default PagesRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pages-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PagesRounded)))