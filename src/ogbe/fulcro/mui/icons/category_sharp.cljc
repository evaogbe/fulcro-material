(ns ogbe.fulcro.mui.icons.category-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CategorySharp" :default CategorySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-category-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CategorySharp)))