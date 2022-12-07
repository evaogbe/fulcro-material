(ns ogbe.fulcro.mui.icons.broken-image-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BrokenImageRounded" :default BrokenImageRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-broken-image-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BrokenImageRounded)))