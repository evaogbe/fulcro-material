(ns ogbe.fulcro.mui.icons.google
  #?(:cljs (:require
            ["@mui/icons-material/Google" :default Google]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-google
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Google)))