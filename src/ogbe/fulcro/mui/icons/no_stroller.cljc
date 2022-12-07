(ns ogbe.fulcro.mui.icons.no-stroller
  #?(:cljs (:require
            ["@mui/icons-material/NoStroller" :default NoStroller]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-stroller
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoStroller)))