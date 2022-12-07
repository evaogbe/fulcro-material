(ns ogbe.fulcro.mui.icons.store
  #?(:cljs (:require
            ["@mui/icons-material/Store" :default Store]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-store
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Store)))