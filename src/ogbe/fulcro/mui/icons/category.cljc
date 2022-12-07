(ns ogbe.fulcro.mui.icons.category
  #?(:cljs (:require
            ["@mui/icons-material/Category" :default Category]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-category
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Category)))