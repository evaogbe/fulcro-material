(ns ogbe.fulcro.mui.icons.sort-by-alpha-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SortByAlphaRounded" :default SortByAlphaRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sort-by-alpha-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SortByAlphaRounded)))