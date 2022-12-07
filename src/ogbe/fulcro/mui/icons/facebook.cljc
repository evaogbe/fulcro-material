(ns ogbe.fulcro.mui.icons.facebook
  #?(:cljs (:require
            ["@mui/icons-material/Facebook" :default Facebook]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-facebook
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Facebook)))