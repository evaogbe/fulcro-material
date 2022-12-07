(ns ogbe.fulcro.mui.icons.sort-by-alpha
  #?(:cljs (:require
            ["@mui/icons-material/SortByAlpha" :default SortByAlpha]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sort-by-alpha
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SortByAlpha)))