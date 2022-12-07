(ns ogbe.fulcro.mui.icons.local-grocery-store
  #?(:cljs (:require
            ["@mui/icons-material/LocalGroceryStore" :default LocalGroceryStore]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-grocery-store
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalGroceryStore)))