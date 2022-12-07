(ns ogbe.fulcro.mui.icons.category-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CategoryRounded" :default CategoryRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-category-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CategoryRounded)))