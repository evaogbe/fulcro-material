(ns ogbe.fulcro.mui.icons.collections
  #?(:cljs (:require
            ["@mui/icons-material/Collections" :default Collections]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-collections
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Collections)))