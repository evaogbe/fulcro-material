(ns ogbe.fulcro.mui.icons.sort-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SortSharp" :default SortSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sort-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SortSharp)))