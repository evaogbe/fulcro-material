(ns ogbe.fulcro.mui.icons.broken-image
  #?(:cljs (:require
            ["@mui/icons-material/BrokenImage" :default BrokenImage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-broken-image
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BrokenImage)))